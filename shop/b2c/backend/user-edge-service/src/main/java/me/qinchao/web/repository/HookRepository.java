package me.qinchao.web.repository;

import me.qinchao.web.domain.Hook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sulvto on 9/21/18.
 */
@Repository
public interface HookRepository extends JpaRepository<Hook, Long> {

}
