package me.qinchao.web.service;

import me.qinchao.web.domain.Todo;
import me.qinchao.web.dto.TodoDTO;
import me.qinchao.web.exception.EntryNotFoundException;

/**
 * Created by sulvto on 9/24/18.
 */
public interface TodoService extends BaseService<Todo> {

    Todo add(TodoDTO added);

    Todo update(TodoDTO updated, Long id) throws EntryNotFoundException;
}
