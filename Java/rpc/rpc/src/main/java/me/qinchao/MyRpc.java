package me.qinchao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

/**
 * Created by SULVTO on 16-3-16.
 */
public class MyRpc {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyRpc.class);

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

    public static <T> T call(final Class<T> interfaceClass, final String host, final int port) {

        return (T) Proxy.newProxyInstance(interfaceClass.getClassLoader(), new Class<?>[]{interfaceClass}, new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        try (Socket socket = new Socket(host, port)) {
                            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream())) {
                                objectOutputStream.writeUTF(method.getName());
                                objectOutputStream.writeObject(method.getParameterTypes());
                                objectOutputStream.writeObject(args);
                                try (ObjectInputStream input = new ObjectInputStream(socket.getInputStream())) {
                                    Object result = input.readObject();
                                    if (result instanceof Throwable) {
                                        throw (Throwable) result;
                                    }
                                    return result;
                                }
                            }
                        }

                    }
                }
        );

    }

}
