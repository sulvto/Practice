package me.qinchao.web;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import me.qinchao.domain.Department;
import me.qinchao.domain.Employee;
import me.qinchao.service.IDepartmentSerivce;
import me.qinchao.service.IEmployeeSerivce;
import me.qinchao.service.impl.DepartmentSerivceImpl;
import me.qinchao.service.impl.EmployeeSerivceImpl;

public class EmployeeAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private IEmployeeSerivce employeeSerivce = new EmployeeSerivceImpl();
	private IDepartmentSerivce departmentSerivce = new DepartmentSerivceImpl();
	private List<Employee> employees;
	private Employee employee;
	private List<Department> depts;
	private Integer pageNo = 1;
	private Integer pageSize = 5;
	private Integer page;
	private Integer lastPage;

	@Override
	public String execute() throws Exception {
		// System.out.println(employeeSerivce.get(1L));
		// employees = employeeSerivce.getAll();
		// System.out.println("pageSize" + pageSize);
		lastPage = employeeSerivce.getAll().size() / pageSize + 1;
		employees = employeeSerivce.query(pageNo, pageSize);
		return "success";
	}

	public String save() throws Exception {
		if (employee.getId() == null) {
			employeeSerivce.save(employee);
		} else {
			employeeSerivce.update(employee);
		}
		return "save";
	}

	// 回显
	public String input() throws Exception {
		if (employee != null && employee.getId() != null) {
			employee = employeeSerivce.get(employee.getId());
		}
		ActionContext.getContext().put("depts", departmentSerivce.getAll());
		return "input";
	}

	public String pagenext() throws Exception {
		if (pageNo != null) {
			pageNo--;
			employees = employeeSerivce.query(pageNo, pageSize);
		}
		return "success";
	}

	public String delete() throws Exception {
		if (employee.getId() != null) {
			employeeSerivce.delete(employee.getId());
		}
		return "delete";
	}

	public void setDepts(List<Department> depts) {
		this.depts = depts;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getTotalPage() {
		return lastPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.lastPage = totalPage;
	}

}
