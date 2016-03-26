package me.qinchao.MyRpc.zookeeperRpc.Provider;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.Socket;

/**
 * 调用远程服务的服务消费方
 * Created by SULVTO on 16-3-25.
 */
public class Consumer {

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
