//
// 2018-07-27
//

typedef unsigned int int Event_Type;
enum {
	// 事件的类型
	READ_EVENT = 01,
	ACCEPT_EVENT = 01,
	WRITE_EVENT = 02, TIMEOUT_EVENT = 04,
	SIGNAL_EVENT = 010, CLOSE_EVENT = 020
};

class Event_Handler {
public:
		virtual void handle_event(HANDLE handle, Event_Type e_type) = 0;
		virtual HANDLE get_handle() const = 0;
protected:
		virtual ~Event_Handler();
};

class Demux_Table {
		public:
				void convert_to_fd_sets(fd_set &read_fds, fd_set &write_fds, 
								fd_set &except_fds);
				
				struct Tuble {
					Event_Handler *event_handler_;
					Event_Type event_type_;
				};

				Tuple table_[FD_SETSIZE];
};

void Demux_Table::convert_to_fd_sets(fd_set &read_fds, fd_set &write_fds, 
								fd_set &except_fds) {
		
			
}


class Reactor {
		public:
				virtual void register_handler(Event_Handler *e_handler, 
								Event_Type e_type) = 0;
				virtual void register_handler(HANDLE handle, 
								Event_Handler *e_handler, Event_Type e_type) = 0;
				virtual void remove_handler(Event_Handler *e_handler, 
								Event_Type e_type) = 0;
				virtual void remove(HANDLE handle, Event_Type e_type) = 0;

				void handle_events(Time_Value *timeout = 0);
				static Reactor *instance();
		private:
				Reactor_Implementation *reactor_impl_;
};

class Select_Reactor_Implementation : public Reactor_Implementation {
		public:
				void Select_Reactor_Implementation::handle_events(Time_Value *timeout = 0) {
					fd_set read_fds, write_fds, except_fds;

					demux_table.convert_to_fd_sets(read_fds, write_fds, except_fds);

					HANDLE max_handle = 5;
					int result = select(max_handle + 1, &read_fds, &write_fds, 
									&except_fds, timeout);

					if (result < 0) {
						throw // handle error or timeout cases
					}

					for (HANDLE h = 0; h <= max_handle; ++h) {
						if (FD_ISSET(&read_fds, h)) {
							demux_table.table_[h].event_handler_->handle_event(h, 
											READ_EVENT);
						}

						if (FD_ISSET(&write_fds, h)) {
							demux_table.table_[h].event_handler_->handle_event(h, 
											WRITE_EVENT);
						}

						if (FD_ISSET(&except_fds, h)) {
							// demux_table.table_[h].event_handler_->handle_event(h, EX);
						}
					}
				}
		private:
			Demutx_Talbe demux_table;
};

class Logging_Acceptor : public Event_Handler {
		public:
			Logging_Acceptor(const INET_Addr &addr, Reactor *reactor) : 
					acceptor_(addr), reactor_(reactor) {
				reactor_->register_handler(this, ACCEPT_EVENT);
			}

			virtual void handle_event(HANDLE, Event_Type event_type) {
				if (event_type == ACCEPT_EVENT) {
					SOCK_Stream client_connection;

					acceptor_.accept(client_connection);

					Logging_Handler *handler = 
							new Logging_Handler(client_connection, reactor_);
				}
			}

			virtual HANDLE get_handle() const {
				return acceptor_.get_handle();
			}

		private:
			SOCK_Acceptor acceptor_;
			Reactor reactor_;
};

class Logging_Handler : public Event_Handler {
		public:
				Logging_Handler(const SOCK_Stream &stream, Reactor *reactor):
						peer_stream_(stream) {
					reactor_.register_handler(this, READ_EVENT);
				}

				virtual void handle_event(HANDLE, Event_Type event_type) {
					if (event_type == READ_EVENT) {
						Log_Record log_record;

						peer_stream_.recv(&log_record, sizeof log_record);

						log_record.write(STDOUT);
					} else if (event_type == CLOSE_EVENT){
						peer_stream_.close();

						delete this;
					}
				}

				virtual HANDLE get_handle() const {
					return peer_stream_.get_handle();
				}

		private:
				SOCK_Stream peer_stream_;
};

// 日志服务器的端口号
const u_short PORT = 1000;

int main() {
	INET_Addr addr(PORT);

	// 初始法日志服务器端点并注册到反应器单例
	Logging_Acceptor la(addr, Reactor::instance());

	// 事件循环被动地处理客户端连接请求和日志记录
	for (;;) Reactor::instance()->handle_events();
}
