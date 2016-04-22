package me.qinchao.DynamicCompiler;

import javax.tools.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by SULVTO on 16-4-22.
 */
public class Main {
    class JavaClassObject extends SimpleJavaFileObject {

        /**
         * Construct a SimpleJavaFileObject of the given kind and with the
         * given URI.
         */
        public JavaClassObject(String name, Kind kind) {
            super(URI.create("string:///" + name.replace(".", "/") + kind.extension), kind);
        }

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        public byte[] getBytes() {
            return outputStream.toByteArray();
        }

        @Override
        public OutputStream openOutputStream() throws IOException {
            return outputStream;
        }

    }

    class JavaFileManager extends ForwardingJavaFileManager {
        private JavaClassObject javaClassObject;

        public JavaClassObject getJavaClassObject() {
            return javaClassObject;
        }

        /**
         * Creates a new instance of ForwardingJavaFileManager.
         *
         * @param fileManager delegate to this file manager
         */
        public JavaFileManager(javax.tools.JavaFileManager fileManager) {
            super(fileManager);
        }

        @Override
        public JavaFileObject getJavaFileForOutput(Location location, String className, JavaFileObject.Kind kind, FileObject sibling) throws IOException {
            javaClassObject = new JavaClassObject(className, kind);
            return javaClassObject;
        }
    }

    class JavaSourceFromString extends SimpleJavaFileObject {

        private String code;

        /**
         * @param name the name of the compilation unit represented by this file object
         * @param code the source code for the compilation unit represented by this file object
         */
        protected JavaSourceFromString(String name, String code) {
            super(URI.create("string:///" + name.replace(".", "/") + Kind.SOURCE.extension), Kind.SOURCE);
            this.code = code;
        }

        @Override
        public CharSequence getCharContent(boolean ignoreEncodingErrors) {
            return code;
        }
    }

    URLClassLoader classLoader = (URLClassLoader) this.getClass().getClassLoader();

    public Object main(String name, String code) throws IllegalAccessException, InstantiationException {
        List<JavaFileObject> compilationUnits = new ArrayList<>();

        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        DiagnosticCollector<Object> diagnosticListener = new DiagnosticCollector<>();

        JavaFileManager javaFileManager = new JavaFileManager(compiler.getStandardFileManager(diagnosticListener, null, null));

        compilationUnits.add(new JavaSourceFromString(name, code));
        List<String> options = new ArrayList<String>();
        options.add("-encoding");
        options.add("UTF-8");
        options.add("-classpath");

        StringBuilder sb = new StringBuilder();
        for (URL url : this.classLoader.getURLs()) {
            String p = url.getFile();
            sb.append(p).append(File.pathSeparator);
        }
        options.add(sb.toString());

        JavaCompiler.CompilationTask task = compiler.getTask(null, javaFileManager, diagnosticListener, options, null, compilationUnits);

        if (task.call()) {
            DynamicClassLoader dynamicClassLoader = new DynamicClassLoader(classLoader);
            Class aClass = dynamicClassLoader.loadClass(name, javaFileManager.getJavaClassObject());
            return aClass.newInstance();


        } else {
            RuntimeException runtimeException = new RuntimeException();
            for (Diagnostic diagnostic : diagnosticListener.getDiagnostics()) {
                System.out.println("Position:" + diagnostic.getPosition());
                System.out.println("Start Position:" + diagnostic.getStartPosition());
                System.out.println("End Position:" + diagnostic.getEndPosition());
                System.out.println("Source:" + diagnostic.getSource());
                String message = diagnostic.getMessage(null);
                runtimeException = new RuntimeException(runtimeException);
                System.out.println("Message:" + message);
                System.out.println("LineNumber:" + diagnostic.getLineNumber());
                System.out.println("ColumnNumber:" + diagnostic.getColumnNumber());
            }
            throw runtimeException;
        }
    }

    class DynamicClassLoader extends URLClassLoader {
        public DynamicClassLoader(ClassLoader parent) {
            super(new URL[0], parent);
        }

        public Class findClassByClassName(String className) throws ClassNotFoundException {
            return this.findClass(className);
        }

        public Class loadClass(String fullName, JavaClassObject jco) {
            byte[] classData = jco.getBytes();
            return this.defineClass(fullName, classData, 0, classData.length);
        }
    }
}
