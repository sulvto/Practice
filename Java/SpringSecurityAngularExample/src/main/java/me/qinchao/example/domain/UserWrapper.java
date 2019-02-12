package me.qinchao.example.domain;

import org.springframework.security.core.authority.AuthorityUtils;

/**
 * Created by sulvto on 1/31/19.
 */
public class UserWrapper extends org.springframework.security.core.userdetails.User {

    private User user;

    public UserWrapper(User user) {
        // TODO: role
        super(user.getUsername(), user.getPassword(), AuthorityUtils.createAuthorityList());
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public String toString() {
        return "UserWrapper{" +
                "user=" + user +
                '}';
    }
}
