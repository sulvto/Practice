package me.qinchao.web.service.impl;

import me.qinchao.web.domain.Goods;
import me.qinchao.web.repository.GoodsRepository;
import me.qinchao.web.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sulvto on 9/24/18.
 */
@Service
public class RepositoryGoodsService extends RepositoryBaseService<Goods> implements GoodsService {

    @Autowired
    RepositoryGoodsService(GoodsRepository repository) {
        super(repository);
    }
}
