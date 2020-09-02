package me.qinchao.example.mapper;

import me.qinchao.example.model.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

/**
 * Created by sulvto on 01/09/2020.
 *
 * @author sulvto
 */
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM user LIMIT 1")
    @Results(
            id="BaseResultMap",
            value = {
                    @Result(column = "username", jdbcType = JdbcType.VARCHAR, property = "username"),
                    @Result(column = "password", jdbcType = JdbcType.INTEGER, property = "password"),
                    @Result(column = "gmt_create", jdbcType = JdbcType.TIMESTAMP, property = "gmtCreate"),
                    @Result(column = "gmt_modified", jdbcType = JdbcType.TIMESTAMP, property = "gmtModified")
            }
    )
    User selectOne();

    @ResultMap("BaseResultMap")
    @Select("SELECT * FROM user")
    List<User> selectAll();
}
