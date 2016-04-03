package me.qinchao.protocol.impl;

import me.qinchao.api.AbstractConfig;
import me.qinchao.api.ProtocolConfig;
import me.qinchao.protocol.Protocol;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by SULVTO on 16-4-3.
 */
public class DefaultProtocol implements Protocol {

    private void doExport(Object service, int port) throws IOException {
        ServerSocket server = new ServerSocket(port);
        for (; ; ) {
            try {
                Socket socket = server.accept();
                new Thread(() -> {
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

    @Override
    public void export(Object serviceObject, ProtocolConfig protocolConfig) {
        try {
            doExport(serviceObject, protocolConfig.getPort());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public <T> T refer(Class<T> serviceType, AbstractConfig protocolConfig) {
        return (T) Proxy.newProxyInstance(serviceType.getClassLoader(), new Class<?>[]{serviceType}, new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        try (Socket socket = new Socket(protocolConfig.getHost(), protocolConfig.getPort())) {
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
