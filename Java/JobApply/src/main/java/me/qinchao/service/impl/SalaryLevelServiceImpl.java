package me.qinchao.service.impl;

import java.io.Serializable;
import java.util.List;

import me.qinchao.dao.ISalaryLevelDAO;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import me.qinchao.domain.SalaryLevel;
import me.qinchao.service.ISalaryLevelService;

@Transactional(propagation = Propagation.REQUIRED)
public class SalaryLevelServiceImpl implements ISalaryLevelService {
	private ISalaryLevelDAO dao;

	public void setDao(ISalaryLevelDAO dao) {
		this.dao = dao;
	}

	@Override
	public void saveSalaryLevel(SalaryLevel d) {
		this.dao.save(d);
	}

	@Override
	public void updateSalaryLevel(SalaryLevel d) {
		this.dao.update(d);
	}

	@Override
	public void deleteSalaryLevel(Serializable id) {
		this.dao.delete(id);
	}

	@Override
	@Transactional(readOnly = true)
	public SalaryLevel getSalaryLevel(Serializable id) {
		return this.dao.get(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<SalaryLevel> listSalaryLevels() {
		return this.dao.list();
	}

}
