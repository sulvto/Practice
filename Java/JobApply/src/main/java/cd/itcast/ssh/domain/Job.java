package cd.itcast.ssh.domain;


public class Job {
	private String id;
	private String title;
	private String content;

	private String company;// 公司
	private String city;// 城市
	private String salaryLevel;
	private String trade;// 行业
	private String companyType;// 公司类型

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getCompanyType() {
		return companyType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSalaryLevel() {
		return salaryLevel;
	}

	public void setSalaryLevel(String salaryLevel) {
		this.salaryLevel = salaryLevel;
	}

	public String getTrade() {
		return trade;
	}

	public void setTrade(String trade) {
		this.trade = trade;
	}

	@Override
	public String toString() {
		return "Job [title=" + title + ", content=" + content + ", company="
				+ company + ", city=" + city + ", salaryLevel=" + salaryLevel
				+ ", trade=" + trade + "]";
	}

}
