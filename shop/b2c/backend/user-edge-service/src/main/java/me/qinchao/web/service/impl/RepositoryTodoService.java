package me.qinchao.web.service.impl;

import me.qinchao.web.domain.Todo;
import me.qinchao.web.dto.TodoDTO;
import me.qinchao.web.exception.EntryNotFoundException;
import me.qinchao.web.repository.TodoRepository;
import me.qinchao.web.service.TodoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sulvto on 9/24/18.
 */
@Service
public class RepositoryTodoService extends RepositoryBaseService<Todo> implements TodoService {
    private static final Logger LOGGER = LoggerFactory.getLogger(RepositoryBaseService.class);

    private TodoRepository repository;

    @Autowired
    RepositoryTodoService(TodoRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public Todo add(TodoDTO added) {
        Todo model = Todo.getBuilder(added.getTitle())
                .description(added.getDescription())
                .build();
        return add(model);
    }

    @Override
    public Todo update(TodoDTO updated, Long id) throws EntryNotFoundException {
        LOGGER.debug("Updating contact with information: {}", updated);
        Todo model = findById(id);
        LOGGER.debug("Updating a `Todo` entry: {}", model);
        repository.save(model);

        return model;
    }
}
