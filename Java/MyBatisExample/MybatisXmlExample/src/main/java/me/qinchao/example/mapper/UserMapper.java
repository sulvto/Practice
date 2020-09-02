package me.qinchao.example.mapper;

import me.qinchao.example.model.User;

import java.util.List;

/**
 * Created by sulvto on 01/09/2020.
 *
 * @author sulvto
 */
public interface UserMapper {

    User selectUser();

    List<User> selectAll();
}
