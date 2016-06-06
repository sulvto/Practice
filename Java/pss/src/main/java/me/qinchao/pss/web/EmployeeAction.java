package me.qinchao.pss.web;

import java.io.File;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.*;

import javax.servlet.http.HttpServletResponse;

import me.qinchao.pss.domain.Employee;
import me.qinchao.pss.domain.Role;
import me.qinchao.pss.query.BaseQuery;
import me.qinchao.pss.query.PageResult;
import me.qinchao.pss.service.IEmployeeService;
import org.apache.struts2.ServletActionContext;

import me.qinchao.pss.query.EmployeeQuery;
import me.qinchao.pss.service.IDepartmentService;
import me.qinchao.pss.service.IRoleService;

import com.opensymphony.xwork2.interceptor.annotations.InputConfig;

public class EmployeeAction extends CRUDAction<Employee> {
    private static final long serialVersionUID = 1L;
    private IEmployeeService employeeService;
    private IRoleService roleService;
    private IDepartmentService departmentService;
    private Employee employee = new Employee();
    private PageResult<Employee> pageResult;
    private BaseQuery baseQuery = new EmployeeQuery();
    // 处理中间表
    private Long[] ids;

    @Override
    protected void list() {
        logger.debug("List");
        logger.info(baseQuery.toString());
        putContext("allDepts", departmentService.getAll());
        this.pageResult = employeeService.findPageResult(baseQuery);
    }

    @Override
    @InputConfig(methodName = "input")
    public String save() throws Exception {
        logger.info("save");
        for (Long id : ids) {
            employee.getRoles().add(new Role(id));
        }

        if (employee.getDepartment() != null
                && employee.getDepartment().getId() == -1) {
            employee.setDepartment(null);
        }
        if (id != null) {
            logger.debug("update employee");
            employeeService.update(employee);
        } else {
            logger.debug("update save");
            employeeService.save(employee);
            baseQuery.setCurrentPage(Integer.MAX_VALUE);
        }
        logger.debug("保存成功");
        addActionMessage("保存成功");
        return RELOAD;
    }

    @Override
    public String delete() throws Exception {
        logger.debug("delete");
        Map<String, Object> map = new HashMap<String, Object>();
        // HttpServletResponse response = ServletActionContext.getResponse();
        // 类型改成json,编码方式UTF-8
        // response.setContentType("text/json; charset=UTF-8");
        // PrintWriter out = response.getWriter();
        map.put("success", false);
        if (id != null) {
            try {
                employeeService.delete(id);
                // out.print("{\"success\":true,\"msg\":\"删除成功\"}");
                System.out.println("删除成功");
                map.put("success", true);
                map.put("msg", "删除成功");
            } catch (Exception e) {
                System.out.println("异常");
                map.put("msg", "异常 " + e.getMessage());
                // out.print("{\"success\":false,\"msg\":\"" + e.getMessage() +
                // "\"}");
            }
        } else {
            map.put("msg", "没有删除的id");
            // out.print("{\"success\":false,\"msg\":\"没有删除的id\"}");
        }
        putContext("map", map);
        // return null;// 返回null
        return AJAX_RESULT;
    }

    public String checkName() throws Exception {
        logger.debug("check name  " + name);
        logger.debug("check id:" + id);
        // addActionMessage("check name:" + name);
        // 如果输出false,表示用户名重复了
        HttpServletResponse response = ServletActionContext.getResponse();
        PrintWriter out = response.getWriter();
        if (id == null) {
            // 存在用户名,输出false
            out.print(!employeeService.findByName(name));
        } else {
            employee = employeeService.get(id);
            // System.out.println("employee.name  "+employee.getName());
            // System.out.println(name);
            if (employee.getName().equals(name)) {
                out.print(true);
            } else {
                out.print(!employeeService.findByName(name));
            }
        }
        return null;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String input() throws Exception {
        logger.debug("input");
        putContext("allRoles", roleService.getAll());
        putContext("allDepts", departmentService.getAll());
        return INPUT;
    }

    @Override
    public void beforeSave() {

        if (id == null) {
            employee = new Employee();
        } else {
            employee = employeeService.get(id);
            employee.setDepartment(null);
            employee.getRoles().clear();
        }
    }

    @Override
    public void beforeInput() {
        if (id != null) {
            employee = employeeService.get(id);
            Set<Role> roles = employee.getRoles();
            ids = new Long[roles.size()];
            int index = 0;
            for (Role role : roles) {
                ids[index++] = role.getId();
            }
            System.out.println(ids);
        }
    }

    private InputStream inputStream;

    public InputStream getInputStream() {
        return inputStream;
    }

    private String[] heads = {"编号", "姓名", "密码", "邮箱", "年龄", "部门"};

    // 处理中文
    public String getFileName() throws UnsupportedEncodingException {
        return new String("员工.xls".getBytes("GBK"), "ISO8859-1");
    }

    public String download() throws Exception {
        // 从数据库获取数据
        baseQuery.setPageSize(Integer.MAX_VALUE);
        this.pageResult = employeeService.findPageResult(baseQuery);
        List<Employee> employees = pageResult.getRows();
        List<String[]> list = new ArrayList<String[]>();
        for (Employee employee : employees) {
            String[] strings = new String[heads.length];
            strings[0] = employee.getId().toString();
            strings[1] = employee.getName();
            strings[2] = employee.getPassword();
            strings[3] = employee.getEmail();
            strings[4] = employee.getAge().toString();
            strings[5] = employee.getDepartment()!=null?employee.getDepartment().getName():"";
            list.add(strings);
        }
        this.inputStream = employeeService.exp(heads, list);
        return "download";
    }

    private File upload; // 上传的文件

    public File getUpload() {
        return upload;
    }

    public void setUpload(File upload) {
        this.upload = upload;
    }

    public String upload() throws Exception {
        System.out.println("上传");
        List<String[]> list = employeeService.imp(upload);
        for (int i = 1; i < list.size(); i++) {
            String[] strings = list.get(i);
            employee = new Employee();
            employee.setName(strings[1]);
            employee.setPassword(strings[2]);
            employee.setEmail(strings[3]);
            employee.setAge(new Integer(strings[4]));
            employee.setDepartment(departmentService.findByName(strings[5]));
            employeeService.save(employee);
        }
        baseQuery.setCurrentPage(Integer.MAX_VALUE);
        return RELOAD;
    }

    // :<input type="file" name="headImg">

    public Employee getModel() {
        return employee;
    }

    public BaseQuery getBaseQuery() {
        return baseQuery;
    }

    public void setBaseQuery(BaseQuery baseQuery) {
        this.baseQuery = baseQuery;
    }

    public IEmployeeService getEmployeeService() {
        return employeeService;
    }

    public PageResult<Employee> getPageResult() {
        return pageResult;
    }

    public IDepartmentService getDepartmentService() {
        return departmentService;
    }

    public void setEmployeeService(IEmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public void setDepartmentService(IDepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    public void setPageResult(PageResult<Employee> pageResult) {
        this.pageResult = pageResult;
    }

    public void setRoleService(IRoleService roleService) {
        this.roleService = roleService;
    }

    public Long[] getIds() {
        return ids;
    }

    public void setIds(Long[] ids) {
        this.ids = ids;
    }

}