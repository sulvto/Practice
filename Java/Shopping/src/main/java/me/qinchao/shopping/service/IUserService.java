package me.qinchao.shopping.service;

import java.util.List;

import me.qinchao.shopping.domain.User;

public interface IUserService {
	void save(User obj);

	void update(User newObj);

	void delete(Long id);

	User get(Long id);

	List<User> getAll();
	
	//------------业务操作-------------------
	//检查登录操作
	User checkUser(String username,String password,String ip);
	
	
	void changePwd(String oldPwd,String newPwd,String reNewPwd,User user);

	void regist(User user,String rePwd);
}
