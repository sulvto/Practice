package cd.itcast.ssh.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cd.itcast.ssh.dao.ICompanyDAO;
import cd.itcast.ssh.domain.Company;
import cd.itcast.ssh.service.ICompanyService;

@Transactional(propagation = Propagation.REQUIRED)
public class CompanyServiceImpl implements ICompanyService {
	private ICompanyDAO dao;

	public void setDao(ICompanyDAO dao) {
		this.dao = dao;
	}

	@Override
	public void saveCompany(Company d) {
		this.dao.save(d);
	}

	@Override
	public void updateCompany(Company d) {
		this.dao.update(d);
	}

	@Override
	public void deleteCompany(Serializable id) {
		this.dao.delete(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Company getCompany(Serializable id) {
		return this.dao.get(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Company> listCompanys() {
		return this.dao.list();
	}

}
