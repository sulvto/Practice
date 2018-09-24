package me.qinchao.web.repository;

import me.qinchao.web.domain.Courier;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sulvto on 9/21/18.
 */
public interface CourierRepository extends JpaRepository<Courier, Long> {

}
