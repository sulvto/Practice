package me.qinchao.example.service;

import me.qinchao.example.model.User;

/**
 * Created by sulvto on 1/17/19.
 */
public interface UserService {

    User findByUsername(String username);
}
