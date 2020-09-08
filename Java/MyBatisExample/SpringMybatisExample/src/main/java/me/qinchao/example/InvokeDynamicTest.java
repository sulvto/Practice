package me.qinchao.example;

import java.lang.invoke.*;
import java.lang.reflect.Method;

import static java.lang.invoke.MethodHandles.lookup;

/**
 * Created by sulvto on 08/09/2020.
 *
 * @author sulvto
 * @version $Id: InvokeDynamicTest.java, v0.1 08/09/2020 15:39 sulvto Exp$$
 */
public class InvokeDynamicTest {
    public static void main(String[] args) throws Throwable {
        INDY_BootstrapMethod().invokeExact("Hello world");

//        getPrintlnMN(System.currentTimeMillis() % 2 ==0 ? System.out : new MyPrint()).invokeExact("Hello world");
    }

    public static void testMethod(String s) {
        System.out.println("hello String: " + s);
    }

    public static CallSite BootstrapMethod(MethodHandles.Lookup lookup, String name, MethodType mt) throws NoSuchMethodException, IllegalAccessException {
        return new ConstantCallSite(lookup.findStatic(InvokeDynamicTest.class, name, mt));
    }

    private static MethodType MT_BootstrapMethod() {
        return MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", null);
    }

    private static MethodHandle MH_BootstrapMethod() throws NoSuchMethodException, IllegalAccessException {
        return lookup().findStatic(InvokeDynamicTest.class, "BootstrapMethod", MT_BootstrapMethod());
    }

    private static MethodHandle INDY_BootstrapMethod() throws Throwable {
        CallSite cs = (CallSite) MH_BootstrapMethod().invokeWithArguments(lookup(), "testMethod", MethodType.fromMethodDescriptorString("(Ljava/lang/String;)V", null));
        return cs.dynamicInvoker();
    }




    private static MethodHandle getPrintlnMN(Object reveiver) throws Throwable {
        MethodType methodType = MethodType.methodType(void.class, String.class);
        return lookup().findVirtual(reveiver.getClass(), "println", methodType).bindTo(reveiver);
    }

    static class MyPrint {
        public void println(String str) {
            System.out.println("MyPrint: " + str);
        }
    }

}
