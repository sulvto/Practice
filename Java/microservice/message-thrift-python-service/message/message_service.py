# coding utf-8
import smtplib
from email.header import Header
from email.mime.text import MIMEText
from message.api import MessageService
from thrift.protocol import TBinaryProtocol
from thrift.server import TServer
from thrift.transport import TSocket
from thrift.transport import TTransport

sender = 'imoocd@163.com'

class MessageServiceHandler:

		def sendMobildMessage(self, mobile, message):
				print("sendMobildMessage, mobile: " + mobile + ", message: "+ message)
				return True
		def sendEmailMessage(self, email, message):
				print("sendEmailMessage")
				messageObj = MIMEText(message, "plain", "utf-8")
				messageObj['From'] = sender
				messageObj['To'] = email
				messageObj['Subject'] = Header('XXX', 'UTF-8')

				try:
					smtpObj = smtplib.SMTP('yum.163.com')
					smtpObj.login(sender, authCode)
					smtpObj.sendmail(sender, [email], messageObj.as_string())
					print("send mail success")
					return True
				except smtplib.SMTPException:
					print("snd mail failed")
					return False

if __name__ == '__main__':
		handler = MessageServiceHandler()
		processor = MessageService.Processor(handler)
		transport = TSocket.TServerSocket(None, "9090")
		tfactory = TTransport.TFramedTransportFactory()
		pfactory = TBinaryProtocol.TBinaryProtocolFactory()

		service = TServer.TSimpleServer(processor, transport, tfactory, pfactory)
		print("python thrift server start")
		service.serve()
		print("python thrift service exit")
