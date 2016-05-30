package me.qinchao.web.action;

import java.util.List;

import me.qinchao.domain.CompanyType;
import me.qinchao.service.ICompanyService;
import me.qinchao.domain.Company;
import me.qinchao.service.ICompanyTypeService;

import com.opensymphony.xwork2.ActionSupport;

public class CompanyAction  extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private Company company;
	private Long id;
	private List<Company> companys;

	private ICompanyService service;

	private ICompanyTypeService companyTypeService;
	private List<CompanyType> companyTypes;


	public String view() {
		company = service.getCompany(id);
		return "view";
	}
	public String list() {
		this.companys = this.service.listCompanys();
		return "list";
	}

	public String edit() {
		companyTypes = this.companyTypeService.listCompanyTypes();
		if (id != null)
			this.company = this.service.getCompany(id);
		return INPUT;
	}

	public String update() {
		if (this.company.getId() != null)
			this.service.updateCompany(company);
		else
			this.service.saveCompany(company);
		return SUCCESS;
	}

	public String delete() {
		if (this.id != null) {
			this.service.deleteCompany(id);
		}
		return SUCCESS;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company Company) {
		this.company = Company;
	}

	public List<Company> getCompanys() {
		return companys;
	}

	public void setCompanys(List<Company> Companys) {
		this.companys = Companys;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setService(ICompanyService service) {
		this.service = service;
	}

	public List<CompanyType> getCompanyTypes() {
		return companyTypes;
	}

	public void setCompanyTypeService(ICompanyTypeService companyTypeService) {
		this.companyTypeService = companyTypeService;
	}
}
