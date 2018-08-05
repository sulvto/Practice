package me.qinchao.user.service;

import me.qinchao.thrift.user.UserInfo;
import me.qinchao.thrift.user.UserService;
import me.qinchao.user.mapper.UserMapper;
import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sulvto on 18-8-2.
 */

@Service
public class UserServiceImpl implements UserService.Iface {

    @Autowired
    private UserMapper userMapper;

    public UserInfo getUserInfo(int id) throws TException {
        return userMapper.getUserById(id);
    }

    public UserInfo getTeacherById(int id) throws TException {
        return userMapper.getTeacherById(id);
    }

    public UserInfo getUserByName(String username) throws TException {
        return userMapper.getUserByName(username);
    }

    public void registerUser(UserInfo userinfo) throws TException {
        userMapper.registerUserById(userinfo);
    }

}
