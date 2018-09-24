package me.qinchao.web.repository;

import me.qinchao.web.domain.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sulvto on 9/24/18.
 */
public interface GoodsRepository extends JpaRepository<Goods, Long> {

}
