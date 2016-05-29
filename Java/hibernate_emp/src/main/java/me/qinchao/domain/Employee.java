package me.qinchao.domain;

import java.util.Date;

public class Employee {
	private Long id;
	private String name;
	private Double salary;
	private Date hireDate;
	private Department department;

	public Employee() {

	}

	public Employee(String name) {
		this.name = name;
	}

	public Employee(String name, Department department) {
		this.name = name;
		this.department = department;
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

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
				+ ", hireDate=" + hireDate + "]";
	}

}
