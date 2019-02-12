package me.qinchao.example.service;

import me.qinchao.example.domain.User;

import java.util.Optional;

/**
 * Created by sulvto on 1/31/19.
 */
public interface UserService {
    Optional<User> getByUsername(String username);
}
