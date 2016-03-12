package me.qinchao.proxy.aop;

import me.qinchao.proxy.Chinese;
import me.qinchao.proxy.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import static org.junit.Assert.*;

/**
 * Created by SULVTO on 16-3-12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AopConfig.class})
public class AspectProxyTest {
    @Autowired
    private Person person;

    @Test
    public void testPerson() throws Exception {
        person.hello("xxx");
    }
}