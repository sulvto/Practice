package me.qinchao.example.repository;

import me.qinchao.example.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by sulvto on 1/31/19.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findOneByUsername(String username);
}
