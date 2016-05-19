package cn.itcast.cd.shopping.dao;

import java.util.List;

import cn.itcast.cd.shopping.domain.User;

public interface IUserDAO {

	void save(User obj);

	void update(User newObj);

	void delete(Long id);

	User get(Long id);

	List<User> getAll();
	
	//根据账号去查询用户对象
	User getUserByUsername(String username);

	User getBy(String condition,Object...params);
}
