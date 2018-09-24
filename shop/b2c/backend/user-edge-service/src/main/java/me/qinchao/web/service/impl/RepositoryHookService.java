package me.qinchao.web.service.impl;

import me.qinchao.web.domain.Hook;
import me.qinchao.web.repository.HookRepository;
import me.qinchao.web.service.HookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sulvto on 9/21/18.
 */
@Service
public class RepositoryHookService extends RepositoryBaseService<Hook> implements HookService {

    @Autowired
    public RepositoryHookService(HookRepository repository) {
        super(repository);
    }
}
