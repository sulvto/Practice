package me.qinchao.redis.dao;

import me.qinchao.redis.User;

/**
 * Created by SULVTO on 16-3-25.
 */
public interface IUserDao {
    void setUser(String username, User user);

    User getUser(String username);
}
