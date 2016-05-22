package me.qinchao.shopping.service.impl;

import java.util.Date;
import java.util.List;

import me.qinchao.shopping.dao.IUserDAO;
import me.qinchao.shopping.domain.User;
import me.qinchao.shopping.exception.SystemException;
import org.apache.commons.codec.digest.DigestUtils;

import me.qinchao.shopping.factory.BeanFactory;
import me.qinchao.shopping.service.IUserService;

public class UserServiceImpl implements IUserService {
	private IUserDAO dao = BeanFactory.INSTANCE.getBean("userDAO",
			IUserDAO.class);

	public void save(User obj) {
		dao.save(obj);
	}

	public void update(User newObj) {
		dao.update(newObj);
	}

	public void delete(Long id) {
		if (id != null) {
			dao.delete(id);
		}
	}

	public User get(Long id) {
		return dao.get(id);
	}

	public List<User> getAll() {
		return dao.getAll();
	}

	public User checkUser(String username, String password, String ip) {
		// 2.1:检查t_user表中是否有该账号
		User user = dao.getUserByUsername(username);//通过用户名从数据库里拿数据
		if (user == null) {
			throw new SystemException("没有" + username + "账号");// 抛给调用者处理:servlet
		}
		password = DigestUtils.md5Hex(password);
		if (!user.getPassword().equals(password)) {
			throw new SystemException("密码错误");// 抛给调用者处理:servlet
		}
		if (user.getStatus() == 1) {
			throw new SystemException("账号被禁用,请联系管理员");// 抛给调用者处理:servlet
		}
		// ====================================================
		// 2.2:维护对象登录信息:登录时间/ip,上次登录时间/ip
		user.setLastLoginIp(user.getLoginIp());
		user.setLoginIp(ip);
		user.setLastLoginTime(user.getLoginTime());
		user.setLoginTime(new Date());
		dao.update(user);
		return user;
	}

	public void changePwd(String oldPwd, String newPwd, String reNewPwd,
			User user) {
		String pwd = user.getPassword();// 真正的密码
		if (!DigestUtils.md5Hex(oldPwd).equals(pwd)) {
			// 提示:原始密码输入错误
			throw new SystemException("原始密码输入错误!");
		}
		if (!newPwd.equals(reNewPwd)) {
			// 提示:两次密码不同
			throw new SystemException("两次密码不同!");
		}
		user.setPassword(DigestUtils.md5Hex(newPwd));
		dao.update(user);
	}

	@Override//注册
	public void regist(User user, String rePwd) {
		User u = dao.getBy(" AND username = ?", user.getUsername());
		if(u!=null) {
			//存在
			throw new SystemException("账号已存在");
		}
		if(!rePwd.equals(user.getPassword())) {
			throw new SystemException("密码不正确");
		}
		u = dao.getBy(" AND email = ? AND type = 1", user.getEmail()); 
		if(u!=null){
			throw new SystemException("该邮箱已在本站注册");
		}
		user.setType(1);
		user.setPassword(DigestUtils.md5Hex(user.getPassword()));
		user.setStatus(0);
		
		this.save(user);
		
				
				
	}
}
