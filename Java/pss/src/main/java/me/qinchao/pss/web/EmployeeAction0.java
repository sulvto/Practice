package me.qinchao.pss.web;

import java.util.List;

import me.qinchao.pss.domain.Employee;
import me.qinchao.pss.query.BaseQuery;
import me.qinchao.pss.query.EmployeeQuery;
import me.qinchao.pss.query.PageResult;
import me.qinchao.pss.service.IDepartmentService;
import me.qinchao.pss.service.IEmployeeService;

import com.opensymphony.xwork2.ActionContext;

public class EmployeeAction0 extends BaseAction {
	private static final long serialVersionUID = 1L;

	private IEmployeeService employeeService;
	private IDepartmentService departmentService;
	private Employee employee = new Employee();
	private List<Employee> employees;
	private PageResult<Employee> pageResult;
	private BaseQuery baseQuery = new EmployeeQuery();

	public void setDepartmentService(IDepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	public void setEmployeeService(IEmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("111111111111   " + baseQuery.getCurrentPage());
		// System.out.println(baseQuery.getName());
		putContext("dept", departmentService.getAll());
		this.pageResult = employeeService.findPageResult(baseQuery);
		// System.out.println("111111111111   " + pageResult.getRows());
		return SUCCESS;
	}

	public String reload() throws Exception {
		System.out.println(pageResult);
		// System.out.println("employee:  " + employee);
		if (employee.getId() != null) {
			employeeService.update(employee);
		} else {
			employeeService.save(employee);
		}
		return RELOAD;
	}

	public String delete() throws Exception {
		// System.out.println(employee);
		if (employee.getId() != null) {
			employeeService.delete(employee.getId());
		}
		return RELOAD;
	}

	@Override
	public String input() throws Exception {
		// System.out.println(pageResult);
		ActionContext.getContext().put("dept", departmentService.getAll());
		if (employee.getId() != null) {
			employee = employeeService.get(employee.getId());
		}
		return INPUT;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public PageResult<Employee> getPageResult() {
		return pageResult;
	}

	public void setPageResult(PageResult<Employee> pageResult) {
		this.pageResult = pageResult;
	}

	public BaseQuery getBaseQuery() {
		return baseQuery;
	}

	public void setBaseQuery(BaseQuery baseQuery) {
		this.baseQuery = baseQuery;
	}

}
