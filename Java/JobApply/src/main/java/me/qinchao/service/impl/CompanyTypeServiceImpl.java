package me.qinchao.service.impl;

import java.io.Serializable;
import java.util.List;

import me.qinchao.dao.ICompanyTypeDAO;
import me.qinchao.domain.CompanyType;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import me.qinchao.service.ICompanyTypeService;

@Transactional(propagation = Propagation.REQUIRED)
public class CompanyTypeServiceImpl implements ICompanyTypeService {
	private ICompanyTypeDAO dao;

	public void setDao(ICompanyTypeDAO dao) {
		this.dao = dao;
	}

	@Override
	public void saveCompanyType(CompanyType d) {
		this.dao.save(d);
	}

	@Override
	public void updateCompanyType(CompanyType d) {
		this.dao.update(d);
	}

	@Override
	public void deleteCompanyType(Serializable id) {
		this.dao.delete(id);
	}

	@Override
	@Transactional(readOnly = true)
	public CompanyType getCompanyType(Serializable id) {
		return this.dao.get(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<CompanyType> listCompanyTypes() {
		return this.dao.list();
	}

}
