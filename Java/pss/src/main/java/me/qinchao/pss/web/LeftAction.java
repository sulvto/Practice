package me.qinchao.pss.web;

import java.util.Enumeration;
import java.util.List;

import me.qinchao.pss.domain.Employee;
import org.apache.struts2.ServletActionContext;

import me.qinchao.pss.domain.Menu;
import me.qinchao.pss.service.IMenuService;

import javax.servlet.http.HttpSession;

public class LeftAction extends BaseAction {

    private static final long serialVersionUID = 1L;
    private IMenuService menuService;

    public void setMenuService(IMenuService menuService) {
        this.menuService = menuService;
    }

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String execute() throws Exception {
        logger.info("left");

        HttpSession session = ServletActionContext.getRequest()
                .getSession();

        Employee employee = (Employee) session.getAttribute(LOGIN_USER);
        List<Menu> menus = null;
        logger.info("id: " + id);
        if (id == null) {// 一级菜单
            menus = menuService.findParentByLogin(employee.getId());
            logger.info("menus1 :" + menus);
        } else {// 二级菜单
            menus = menuService.findChildrenByLogin(id, employee);
            logger.info("menus2:  " + menus);
        }
        logger.info(menus.toString());
        putJson(menus);
        return AJAX_RESULT;
    }

    public String getText() {
        return "xxx";
    }
}
