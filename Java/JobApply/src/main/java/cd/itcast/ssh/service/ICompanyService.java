package cd.itcast.ssh.service;

import java.io.Serializable;
import java.util.List;

import cd.itcast.ssh.domain.Company;

public interface ICompanyService {
	void saveCompany(Company u);

	void updateCompany(Company u);

	void deleteCompany(Serializable id);

	Company getCompany(Serializable id);

	List<Company> listCompanys();
}
