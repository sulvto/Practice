package me.qinchao.web.action;

import java.util.List;

import me.qinchao.domain.SalaryLevel;
import me.qinchao.service.ISalaryLevelService;

import com.opensymphony.xwork2.ActionSupport;

public class SalaryLevelAction  extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private SalaryLevel salaryLevel;
	private Long id;
	private List<SalaryLevel> salaryLevels;

	private ISalaryLevelService salaryLevelService;




	public String list() {
		this.salaryLevels = this.salaryLevelService.listSalaryLevels();
		return "list";
	}

	public String edit() {
		if (id != null)
			this.salaryLevel = this.salaryLevelService.getSalaryLevel(id);
		return INPUT;
	}

	public String update() {
		if (this.salaryLevel.getId() != null)
			this.salaryLevelService.updateSalaryLevel(salaryLevel);
		else
			this.salaryLevelService.saveSalaryLevel(salaryLevel);
		return SUCCESS;
	}

	public String delete() {
		if (this.id != null) {
			this.salaryLevelService.deleteSalaryLevel(id);
		}
		return SUCCESS;
	}

	public SalaryLevel getSalaryLevel() {
		return salaryLevel;
	}

	public void setSalaryLevel(SalaryLevel SalaryLevel) {
		this.salaryLevel = SalaryLevel;
	}

	public List<SalaryLevel> getSalaryLevels() {
		return salaryLevels;
	}

	public void setSalaryLevels(List<SalaryLevel> salaryLevels) {
		this.salaryLevels = salaryLevels;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setSalaryLevelService(ISalaryLevelService salaryLevelService) {
		this.salaryLevelService = salaryLevelService;
	}
}
