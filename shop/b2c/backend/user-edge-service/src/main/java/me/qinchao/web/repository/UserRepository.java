package me.qinchao.web.repository;

import me.qinchao.web.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sulvto on 9/20/18.
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
