package me.qinchao.user.mapper;

import me.qinchao.thrift.user.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by sulvto on 18-8-2.
 */
@Mapper
public interface UserMapper {

    @Select("SELECT id, username, password, real_name as realName, " +
            "mobile, email FROM pe_user WHERE id=#{id}")
    UserInfo getUserById(@Param("id") int id);

    @Select("SELECT id, username, password, real_name as realName, " +
            "mobile, email FROM pe_user WHERE username=#{username}")
    UserInfo getUserByName(@Param("username") String username);

    @Select("delete from pe_user where id=#{id}")
    UserInfo removeById(@Param("id") int id);

    @Insert("INSERT INTO pe_user (username, password, real_name, mobile, email) " +
            "values (#{u.username}, #{u.password}, #{u.realName}, #{u.mobile}, #{u.email})")
    void registerUserById(@Param("u") UserInfo userInfo);

    @Select("SELECT u.id,u.username,u.password,u.real_name as realName," +
            "u.mobile,u.email,t.info,t.description WHERE u.id=#{id} AND u.id=t.user_id")
    UserInfo getTeacherById(@Param("id") int id);

}
