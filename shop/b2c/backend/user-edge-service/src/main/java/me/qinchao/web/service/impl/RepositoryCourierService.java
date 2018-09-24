package me.qinchao.web.service.impl;

import me.qinchao.web.domain.Courier;
import me.qinchao.web.repository.CourierRepository;
import me.qinchao.web.service.CourierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sulvto on 9/21/18.
 */
@Service
public class RepositoryCourierService extends RepositoryBaseService<Courier> implements CourierService {

    @Autowired
    public RepositoryCourierService(CourierRepository repository) {
        super(repository);
    }

}
