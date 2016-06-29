package me.qinchao.service.impl;

import me.qinchao.domain.User;
import me.qinchao.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by sulvto on 16-6-29.
 */
@Service
public class UserServiceImpl implements UserService {
    private List<User> userList;

    {
        userList = new ArrayList<>();
        User user1 = new User();
        user1.setUsername("admin");
        user1.setPassword("admin");
        user1.setAge(100);
        user1.setId(1);


        User user2 = new User();
        user2.setUsername("admin2");
        user2.setPassword("admin2");
        user2.setAge(100);
        user2.setId(1);

        User user3 = new User();
        user3.setUsername("admin3");
        user3.setPassword("admin3");
        user3.setAge(100);
        user3.setId(1);

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
    }

    @Override
    public User loginCheck(String username, final String password) {
        Optional<User> userOptional = userList.stream().filter(user -> user.getUsername().equals(username) && user.getPassword().equals(password)).findAny();
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            user.setPassword(null);
            return user;
        } else {
            return null;
        }
    }
}
