package cd.itcast.ssh.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cd.itcast.ssh.dao.ISalaryLevelDAO;
import cd.itcast.ssh.domain.SalaryLevel;
import cd.itcast.ssh.service.ISalaryLevelService;

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
