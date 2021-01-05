package me.qinchao.user.service;

import me.qinchao.thrift.user.UserInfo;
import me.qinchao.user.UserServiceApplication;
import me.qinchao.user.mapper.UserMapper;
import org.apache.thrift.TException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserServiceApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserServiceImplTest {
    private final static Logger logger = LoggerFactory.getLogger(UserServiceImplTest.class);

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserServiceImpl userService;

    private UserInfo userinfo = new UserInfo();

    @Before
    public void setUp() throws TException {
        logger.info("setUp");

        userinfo.setId(100000000);
        userinfo.setPassword("12345");
        userinfo.setUsername(UUID.randomUUID().toString());

        userService.registerUser(userinfo);
        userinfo.setId(userService.getUserByName(userinfo.getUsername()).getId());
    }

    @After
    public void tearDown() throws TException {
        logger.info("tearDown");
        userMapper.removeById(userinfo.getId());
    }

    @Test
    public void getUserInfo() throws TException {
        UserInfo userInfo = userService.getUserInfo(userinfo.getId());
        Assert.isTrue(userInfo.getUsername().equalsIgnoreCase(userinfo.getUsername()), "username equals");
    }

    @Test
    public void getTeacherById() {
    }

    @Test
    public void getUserByName() throws TException {
        UserInfo userInfo = userService.getUserByName(userinfo.getUsername());
        Assert.isTrue(userInfo.getId() == userinfo.getId(), "id equals");
    }

    @Test
    public void registerUser() throws TException {
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername(UUID.randomUUID().toString());
        userInfo.setPassword("aaaa");

//        userService.registerUser(userInfo);
//        UserInfo userByName = userService.getUserByName(userInfo.getUsername());
//        Assert.isNull(userByName, "registerUser isNull");
//        Assert.isTrue(userByName.getUsername().equals(userInfo.getUsername()), "registerUser name error");
    }

}