package me.qinchao.domain;

public class Department {
	private Long id;
	private String name;
	private String provice;
	private String city;
	private String street;
	private String sn;

	public Department() {

	}

	public Department(String name) {
		this.name = name;
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

	public String getProvice() {
		return provice;
	}

	public void setProvice(String provice) {
		this.provice = provice;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", provice="
				+ provice + ", city=" + city + ", street=" + street + ", sn="
				+ sn + "]";
	}

}
