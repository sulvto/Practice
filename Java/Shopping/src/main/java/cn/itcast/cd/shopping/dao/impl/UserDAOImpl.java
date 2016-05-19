package cn.itcast.cd.shopping.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import cn.itcast.cd.shopping.dao.BaseDAO;
import cn.itcast.cd.shopping.dao.IUserDAO;
import cn.itcast.cd.shopping.domain.User;

//贾琏欲执事
public class UserDAOImpl extends BaseDAO implements IUserDAO {
	public void save(User obj) {
		String sql = "INSERT INTO t_user (username,password,email,type,status,loginTime,loginIp,lastLoginTime,lastLoginIp) VALUES (?,?,?,?,?,?,?,?,?)";
		Object[] params = { obj.getUsername(), obj.getPassword(),
				obj.getEmail(), obj.getType(), obj.getStatus(),
				obj.getLoginTime(), obj.getLoginIp(), obj.getLastLoginTime(),
				obj.getLastLoginIp() };
		super.update(sql, params);
	}

	public void update(User newObj) {
		String sql = "UPDATE t_user SET username=?,password=?,email=?,type=?,status=?,loginTime=?,loginIp=?,lastLoginTime=?,lastLoginIp=? WHERE id = ?";
		Object[] params = { newObj.getUsername(), newObj.getPassword(),
				newObj.getEmail(), newObj.getType(), newObj.getStatus(),
				newObj.getLoginTime(), newObj.getLoginIp(), newObj.getLastLoginTime(),
				newObj.getLastLoginIp(),newObj.getId()};
		super.update(sql, params);
	}

	public void delete(Long id) {
		String sql = "DELETE FROM t_user WHERE id = ?";
		super.update(sql, id);
	}

	public User get(Long id) {
		String sql = "SELECT * FROM t_user WHERE id = ?";
		return super.query(sql, new BeanHandler<>(User.class), id);
	}

	public List<User> getAll() {
		String sql = "SELECT * FROM t_user";
		return super.query(sql, new BeanListHandler<>(User.class));
	}

	public User getUserByUsername(String username) {
		String sql = "SELECT * FROM t_user WHERE username = ? AND type != ?";
		return super.query(sql, new BeanHandler<>(User.class), username,1);
	}

	@Override
	public User getBy(String condition, Object... params) {
		String sql = "SELECT * FROM t_user WHERE 1 = 1"+condition;
		return super.query(sql, new BeanHandler<>(User.class), params);
	}
}
