package me.qinchao.example.repository;

import me.qinchao.example.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by sulvto on 1/16/19.
 */
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsernameAndPassword(String username, String password);
}
