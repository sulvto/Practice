package me.qinchao.redis.dao.impl;

import me.qinchao.redis.User;
import me.qinchao.redis.dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by SULVTO on 16-3-25.
 */
@Repository
public class UserDaoImpl implements IUserDao {

    // inject the actual template
    @Autowired
    private RedisTemplate<String, User> template; // inject the template as ListOperations

    @Resource(name = "redisTemplate")
    private ValueOperations<String, User> valueOps;

    @Override
    public void setUser(String username, User user) {
        valueOps.set(username, user);
    }

    @Override
    public User getUser(String username) {
        return valueOps.get(username);
    }
}
