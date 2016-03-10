package me.qinchao.cglib;

/**
 * Created by SULVTO on 16-3-9.
 */
public class Chinese  implements Person{


    public String hello(String name){
        System.out.println("hello: "+name);
        return "hello: "+name;
    }
}
