package me.qinchao.service;

import java.io.Serializable;
import java.util.List;

import me.qinchao.domain.CompanyType;

public interface ICompanyTypeService {
	void saveCompanyType(CompanyType u);

	void updateCompanyType(CompanyType u);

	void deleteCompanyType(Serializable id);

	CompanyType getCompanyType(Serializable id);

	List<CompanyType> listCompanyTypes();
}
