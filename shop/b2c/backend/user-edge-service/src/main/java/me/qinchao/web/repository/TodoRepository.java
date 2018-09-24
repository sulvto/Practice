package me.qinchao.web.repository;

import me.qinchao.web.domain.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sulvto on 9/24/18.
 */
@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

}
