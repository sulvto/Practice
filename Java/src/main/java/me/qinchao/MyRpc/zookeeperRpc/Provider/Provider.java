package me.qinchao.MyRpc.zookeeperRpc.Provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

/**
 * 暴露服务的服务提供方
 * Created by SULVTO on 16-3-25.
 */
public class Provider {
    private static final Logger LOGGER = LoggerFactory.getLogger(Provider.class);

    public static void publish(Object service, int port) throws IOException {
        ServerSocket server = new ServerSocket(port);
        for (; ; ) {
            try {
                Socket socket = server.accept();
                LOGGER.debug("server.accept");

                new Thread(() -> {
                    try {
                        TimeUnit.SECONDS.sleep(10);
                    } catch (InterruptedException e) {
                    }
                    try {
                        try {
                            ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
                            try {
                                String methodName = objectInputStream.readUTF();
                                Class<?>[] parameterTypes = (Class<?>[]) objectInputStream.readObject();
                                Object[] arguments = (Object[]) objectInputStream.readObject();

                                ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                                try {
                                    Method method = service.getClass().getMethod(methodName, parameterTypes);
                                    Object result = method.invoke(service, arguments);
                                    objectOutputStream.writeObject(result);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                } finally {
                                    objectOutputStream.close();
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            } finally {
                                objectInputStream.close();
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        } finally {
                            socket.close();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }).start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
