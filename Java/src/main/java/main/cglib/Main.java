package main.cglib;

/**
 * Created by SULVTO on 16-3-9.
 */
public class Main{
    public static void main(String[] args) {
        Person chin = PeopleProxyFactory.getAuthInstance();
        chin.hello("world");
        System.out.println(chin.getClass());
    }
}
