package me.qinchao.web.service.impl;

import me.qinchao.web.domain.ExpressCompany;
import me.qinchao.web.repository.ExpressCompanyRepository;
import me.qinchao.web.service.ExpressCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sulvto on 9/21/18.
 */
@Service
public class RepositoryExpressCompanyService extends RepositoryBaseService<ExpressCompany> implements ExpressCompanyService {

    @Autowired
    public RepositoryExpressCompanyService(ExpressCompanyRepository repository) {
        super(repository);
    }
}
