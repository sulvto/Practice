package me.qinchao.example.service;

import me.qinchao.example.domain.User;
import me.qinchao.example.domain.UserWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by sulvto on 1/31/19.
 */
@Service
public class MyUserDetailsService implements UserDetailsService {

    private UserService userService;

    @Autowired
    public MyUserDetailsService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> userOptional = userService.getByUsername(username);
        if (userOptional.isPresent()) {
            return new UserWrapper(userOptional.get());
        }

        throw new UsernameNotFoundException(String.format("User %s was not found.", username));
    }
}
