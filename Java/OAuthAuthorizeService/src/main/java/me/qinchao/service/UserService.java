package me.qinchao.service;

import me.qinchao.domain.User;

/**
 * Created by sulvto on 16-6-29.
 */
public interface UserService {
    User loginCheck(String username, String password);
}
