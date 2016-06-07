package me.qinchao.web.action;

import java.util.List;

import me.qinchao.domain.CompanyType;
import me.qinchao.service.ICompanyTypeService;

import com.opensymphony.xwork2.ActionSupport;

public class CompanyTypeAction  extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private CompanyType companyType;
	private Long id;
	private List<CompanyType> companyTypes;

	private ICompanyTypeService companyTypeService;




	public String list() {
		this.companyTypes = this.companyTypeService.listCompanyTypes();
		return "list";
	}

	public String edit() {
		if (id != null)
			this.companyType = this.companyTypeService.getCompanyType(id);
		return INPUT;
	}

	public String update() {
		if (this.companyType.getId() != null)
			this.companyTypeService.updateCompanyType(companyType);
		else
			this.companyTypeService.saveCompanyType(companyType);
		return SUCCESS;
	}

	public String delete() {
		if (this.id != null) {
			this.companyTypeService.deleteCompanyType(id);
		}
		return SUCCESS;
	}

	public CompanyType getCompanyType() {
		return companyType;
	}

	public void setCompanyType(CompanyType CompanyType) {
		this.companyType = CompanyType;
	}

	public List<CompanyType> getCompanyTypes() {
		return companyTypes;
	}

	public void setCompanyTypes(List<CompanyType> companyTypes) {
		this.companyTypes = companyTypes;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCompanyTypeService(ICompanyTypeService companyTypeService) {
		this.companyTypeService = companyTypeService;
	}

}
