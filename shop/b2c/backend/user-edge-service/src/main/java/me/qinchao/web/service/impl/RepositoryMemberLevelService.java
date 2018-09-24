package me.qinchao.web.service.impl;

import me.qinchao.web.domain.MemberLevel;
import me.qinchao.web.repository.MemberLevelRepository;
import me.qinchao.web.service.MemberLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sulvto on 9/24/18.
 */
@Service
public class RepositoryMemberLevelService extends RepositoryBaseService<MemberLevel> implements MemberLevelService {

    @Autowired
    RepositoryMemberLevelService(MemberLevelRepository repository) {
        super(repository);
    }
}
