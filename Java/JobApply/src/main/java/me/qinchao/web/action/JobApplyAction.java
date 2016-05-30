package me.qinchao.web.action;

import java.util.List;

import me.qinchao.domain.City;
import me.qinchao.domain.Job;
import me.qinchao.domain.SalaryLevel;
import me.qinchao.domain.Trade;
import me.qinchao.domain.Company;
import me.qinchao.domain.JobApply;
import me.qinchao.service.ICityService;
import me.qinchao.service.ICompanyService;
import me.qinchao.service.IJobApplyService;
import me.qinchao.service.ISalaryLevelService;
import me.qinchao.service.ITradeService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class JobApplyAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private JobApply jobApply;
	private Long id;
	private List<JobApply> jobApplys;
	private List<Company> companys;
	private List<City> citys;
	private List<Trade> trades;
	private List<SalaryLevel> salayLevels;

	private IJobApplyService service;
	private ICityService cityService;
	private ITradeService tradeService;
	private ICompanyService companyService;
	private ISalaryLevelService salaryLevelService;
	private String keywords;
	private List<Job> job;

	public String view() {
		jobApply = service.getJobApply(id);
		return "view";
	}

	public String list() {
		this.jobApplys = this.service.listJobApplys();
		return "list";
	}

	public String edit() {
		citys = cityService.listCitys();
		trades = tradeService.listTrades();
		salayLevels = salaryLevelService.listSalaryLevels();
		companys = companyService.listCompanys();
		if (id != null)
			this.jobApply = this.service.getJobApply(id);
		return INPUT;
	}

	public String update() {
		if (this.jobApply.getId() != null)
			this.service.updateJobApply(jobApply);
		else
			this.service.saveJobApply(jobApply);
		return SUCCESS;
	}

	public String search() {
		this.job = this.service.search(keywords);
		ActionContext.getContext().put("jobs", job.size());
		ActionContext.getContext().put("keywords", keywords);
		return "search";
	}

	public String recreateIndex() {
		this.service.createIndex();
		return "success";
	}

	public String query() throws Exception {
		return "query";
	}

	public String delete() {
		if (this.id != null) {
			this.service.deleteJobApply(id);
		}
		return SUCCESS;
	}

	public JobApply getJobApply() {
		return jobApply;
	}

	public void setJobApply(JobApply JobApply) {
		this.jobApply = JobApply;
	}

	public List<JobApply> getJobApplys() {
		return jobApplys;
	}

	public void setJobApplys(List<JobApply> JobApplys) {
		this.jobApplys = JobApplys;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setService(IJobApplyService service) {
		this.service = service;
	}

	public List<Company> getCompanys() {
		return companys;
	}

	public List<City> getCitys() {
		return citys;
	}

	public List<Trade> getTrades() {
		return trades;
	}

	public List<SalaryLevel> getSalayLevels() {
		return salayLevels;
	}

	public void setCityService(ICityService cityService) {
		this.cityService = cityService;
	}

	public void setTradeService(ITradeService tradeService) {
		this.tradeService = tradeService;
	}

	public void setCompanyService(ICompanyService companyService) {
		this.companyService = companyService;
	}

	public void setSalaryLevelService(ISalaryLevelService salaryLevelService) {
		this.salaryLevelService = salaryLevelService;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public void setJob(List<Job> job) {
		this.job = job;
	}

	public List<Job> getJob() {
		return job;
	}
}
