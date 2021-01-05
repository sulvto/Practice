package me.qinchao.example.mapper;

import me.qinchao.example.domain.UserDTO;
import me.qinchao.example.domain.UserVO;
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
    UserVO selectOne();

    @ResultMap("BaseResultMap")
    @Select("SELECT * FROM user")
    List<UserVO> selectAll();

    @Insert("INSERT INTO user (username, password, gmt_create, gmt_modified) values (#{user.username}, #{user.password}, now(), now()) ")
    void insert(@Param("user") UserDTO user);
}
