package me.qinchao.Protostuff;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sulvto on 16-5-12.
 */
public class SerializationUtilTest {

    class User {

        private int age;
        private String name;

        public User() {
        }

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "User{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    @Test
    public void test() throws Exception {

        byte[] userbyte = SerializationUtil.serialize(new User(20, "username"));
        System.out.println(userbyte);

        User deserialize = SerializationUtil.deserialize(userbyte, User.class);
        System.out.println(deserialize);

        Assert.assertEquals(deserialize.getAge(), 20);
        Assert.assertEquals(deserialize.getName(), "username");
    }

}