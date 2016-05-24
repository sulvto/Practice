package me.qinchao.pss.domain;

//供应商
public class Supplier {
	private Long id;
	private String name;

	/**
	 * @roseuid 54598F770323
	 */
	public Supplier() {

	}

	public Supplier(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
