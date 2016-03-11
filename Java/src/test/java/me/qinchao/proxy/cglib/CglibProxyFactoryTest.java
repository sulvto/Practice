package me.qinchao.proxy.cglib;

import me.qinchao.proxy.Person;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by SULVTO on 16-3-11.
 */
public class CglibProxyFactoryTest {

    @Test
    public void testGetAuthInstance() throws Exception {
        Person chin = CglibProxyFactory.getAuthInstance();
        chin.hello("world");
        System.out.println(chin.getClass());
    }
}