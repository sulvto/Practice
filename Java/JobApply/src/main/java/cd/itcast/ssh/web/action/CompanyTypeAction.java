package cd.itcast.ssh.web.action;

import java.util.List;

import cd.itcast.ssh.domain.CompanyType;
import cd.itcast.ssh.service.ICompanyTypeService;

import com.opensymphony.xwork2.ActionSupport;

public class CompanyTypeAction  extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private CompanyType companyType;
	private Long id;
	private List<CompanyType> companyTypes;

	private ICompanyTypeService service;




	public String list() {
		this.companyTypes = this.service.listCompanyTypes();
		return "list";
	}

	public String edit() {
		if (id != null)
			this.companyType = this.service.getCompanyType(id);
		return INPUT;
	}

	public String update() {
		if (this.companyType.getId() != null)
			this.service.updateCompanyType(companyType);
		else
			this.service.saveCompanyType(companyType);
		return SUCCESS;
	}

	public String delete() {
		if (this.id != null) {
			this.service.deleteCompanyType(id);
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

	public void setService(ICompanyTypeService service) {
		this.service = service;
	}
	
}
