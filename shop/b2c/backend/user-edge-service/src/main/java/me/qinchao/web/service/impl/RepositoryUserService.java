package me.qinchao.web.service.impl;

import me.qinchao.web.domain.User;
import me.qinchao.web.exception.UserNotFoundException;
import me.qinchao.web.repository.UserRepository;
import me.qinchao.web.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by sulvto on 9/21/18.
 */
@Service
public class RepositoryUserService implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(RepositoryUserService.class);

    private UserRepository userRepository;

    @Autowired
    public RepositoryUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User add(User added) {
        LOGGER.debug("Adding a new user entry with information: {}", added);
        return userRepository.save(added);
    }

    @Override
    public Iterable<User> findAll() {
        LOGGER.debug("Finding all user entries");
        return userRepository.findAll();
    }

    @Override
    public User deleteById(Long id) throws UserNotFoundException {
        LOGGER.debug("Deleting a user entry with id: {}", id);
        User deleted = findById(id);
        LOGGER.debug("Deleting user entry: {}", deleted);
        userRepository.delete(deleted);
        return deleted;
    }

    @Override
    public User findById(Long id) throws UserNotFoundException {
        LOGGER.debug("Finding a user entry with id: {}", id);
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            LOGGER.debug("Found user entry: {}", user);
            return user;
        } else {
            throw new UserNotFoundException("No user entry found with id: {}" + id);
        }
    }

    @Override
    public User update(User updated) throws UserNotFoundException {
        LOGGER.debug("Updating contact with information: {}", updated);
        User user = findById(updated.getId());
        LOGGER.debug("Updating a user entry: {}", user);
        userRepository.save(user);

        return user;
    }
}
