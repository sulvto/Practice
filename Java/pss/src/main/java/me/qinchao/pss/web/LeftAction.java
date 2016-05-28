package me.qinchao.pss.web;

import java.util.Enumeration;
import java.util.List;

import me.qinchao.pss.domain.Employee;
import org.apache.struts2.ServletActionContext;

import me.qinchao.pss.domain.Menu;
import me.qinchao.pss.service.IMenuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpSession;

public class LeftAction extends BaseAction {
	private final static Logger LOGGER = LoggerFactory.getLogger(LeftAction.class);

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
		LOGGER.info("left");
		// Employee employee = (Employee) ServletActionContext.getRequest()
		// .getSession().getAttribute(LOGIN_USER);
		// List<Menu> menus = menuService.findParentByLogin(employee.getId());
		//
		// String json = JSONSerializer.toJSON(menus).toString();// 不能很好处理延迟加载问题
		// HttpServletResponse response = ServletActionContext.getResponse();
		// response.setContentType("text/json; charset=UTF-8");
		// PrintWriter out = response.getWriter();
		// out.print(json);

		// HttpServletResponse response = ServletActionContext.getResponse();
		// response.setContentType("text/json; charset=UTF-8");
		// PrintWriter out = response.getWriter();
		// out.print("[{\"id\":100,\"name\":\"菜单1\",\"isParent\":true},{\"id\":10,\"name\":\"菜单2\",\"isParent\":true}]");
		// return null;

		HttpSession session = ServletActionContext.getRequest()
				.getSession();
		Enumeration attributeNames = session.getAttributeNames();
		while (attributeNames.hasMoreElements()){
			System.out.println(attributeNames.nextElement());
		}

		Employee employee = (Employee) session.getAttribute(LOGIN_USER);
		System.out.println(employee.getName());
		LOGGER.info(employee.toString());
		List<Menu> menus = null;
		LOGGER.info("id: " + id);
		if (id == null) {// 一级菜单
			menus = menuService.findParentByLogin(employee.getId());
			LOGGER.info("menus1 :" + menus);
		} else {// 二级菜单
			menus = menuService.findChildrenByLogin(id, employee);
			LOGGER.info("menus2:  " + menus);
		}
		LOGGER.info(menus.toString());
		putJson(menus);
		return AJAX_RESULT;
	}

	public String getText() {
		return "xxx";
	}
}
