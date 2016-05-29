package cd.itcast.ssh.domain;

public class JobApply {
	private Long id;
	private String title;
	private String content;
	
	private Company company;//公司
	private City city;//城市
	private SalaryLevel salaryLevel;
	private Trade trade;//行业
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public SalaryLevel getSalaryLevel() {
		return salaryLevel;
	}
	public void setSalaryLevel(SalaryLevel salaryLevel) {
		this.salaryLevel = salaryLevel;
	}
	public Trade getTrade() {
		return trade;
	}
	public void setTrade(Trade trade) {
		this.trade = trade;
	}
}
