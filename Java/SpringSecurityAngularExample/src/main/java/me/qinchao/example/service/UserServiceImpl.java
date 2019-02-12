package me.qinchao.example.service;

import me.qinchao.example.domain.User;
import me.qinchao.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by sulvto on 1/31/19.
 */
@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> getByUsername(String username) {
        return userRepository.findOneByUsername(username);
    }

}
