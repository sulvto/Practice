package me.qinchao.classloader;


import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;

/**
 * Created by sulvto on 16-4-29.
 */
public class ClassLoaderTest {
    static class MyClassLoader extends ClassLoader {
        private String path;

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public Class findClass(String name) {
            byte[] b = loadClassData(name);
            return defineClass(name, b, 0, b.length);
        }

        private byte[] loadClassData(String name) {
            FileInputStream fileInputStream = null;
            ByteArrayOutputStream byteArrayOutputStream = null;
            try {
                fileInputStream = new FileInputStream(new File(path + File.separator + name + ".class"));
                byteArrayOutputStream = new ByteArrayOutputStream();
                int ch = 0;
                while (-1 != (ch = fileInputStream.read())) {
                    byteArrayOutputStream.write(ch);
                }
                return byteArrayOutputStream.toByteArray();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fileInputStream.close();
                    byteArrayOutputStream.close();
                } catch (IOException ignored) {
                }
            }
            return null;
        }
    }

    public static void main(String[] args) {
        MyClassLoader myClassLoader = new MyClassLoader();
        myClassLoader.setPath("/home/qinchao/development/workspace/Practice/Java/lib2");

        myClassLoader.findClass("");
    }

}
