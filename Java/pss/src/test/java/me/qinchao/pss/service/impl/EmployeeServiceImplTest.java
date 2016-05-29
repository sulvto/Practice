package me.qinchao.pss.service.impl;

import me.qinchao.pss.domain.Employee;
import me.qinchao.pss.domain.Role;
import me.qinchao.pss.service.BaseServiceTest;
import me.qinchao.pss.service.IEmployeeService;
import me.qinchao.pss.service.IRoleService;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by sulvto on 16-5-29.
 */
public class EmployeeServiceImplTest extends BaseServiceTest<Employee> {
    private final static Logger LOGGER = LoggerFactory.getLogger(EmployeeServiceImplTest.class);
    @Autowired
    private IEmployeeService employeeService;
    @Autowired
    private IRoleService roleService;

    @Test
    public void save() {
        Employee t = new Employee("na9877afhvse", "namoe");
        Role e = new Role(1L);
        e.setId(5L);
        e.setName("cgrt");
        t.getRoles().add(e);
//        roleService.save(e);
        employeeService.save(t);
        Employee byLogin = employeeService.findByLogin("namaafe", "name");
        System.out.println(byLogin);
    }
    @Test
    public void update() {
        Employee employee = employeeService.get(3L);
        LOGGER.info(employee.toString());
        System.out.println(employee);

        employee.getRoles().clear();
        Role role = new Role();
        role.setId(2L);
        employee.getRoles().add(role);
        employeeService.update(employee);
        employee = employeeService.get(3L);
        Assert.assertTrue(employee.getRoles().size() > 0);
        Assert.assertTrue(employee.getRoles().iterator().next().getId() == 2);
    }

    @Test
    public void byName() throws Exception {
        System.out.println(employeeService.findByName("admin"));
    }

    @Test
    public void byLogin() throws Exception {
        System.out.println(employeeService.findByLogin("", ""));
        System.out.println(employeeService.findByLogin(null, null));
        System.out.println(employeeService.findByLogin("admin", "admin"));
    }

    @Test
    public void by() throws Exception {
        List<String> methods = employeeService.getAllResourceMethods();
        for (String string : methods) {
            System.out.println(string);
        }
        Employee employee = new Employee();
        employee.setId(2L);
        List<String> resourceMehtods = employeeService
                .findResourceMehtodsByLoginUser(employee);
        for (String string : resourceMehtods) {
            System.out.println(string);
        }
    }
}