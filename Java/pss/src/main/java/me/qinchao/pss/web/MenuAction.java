package me.qinchao.pss.web;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import me.qinchao.pss.query.BaseQuery;
import me.qinchao.pss.query.MenuQuery;
import me.qinchao.pss.service.IMenuService;
import org.apache.struts2.ServletActionContext;

import me.qinchao.pss.domain.Menu;
import me.qinchao.pss.query.PageResult;

import com.opensymphony.xwork2.interceptor.annotations.InputConfig;

public class MenuAction extends CRUDAction<Menu> {
    private static final long serialVersionUID = 1L;
    private IMenuService menuService;
    private Menu menu = new Menu();
    private PageResult<Menu> pageResult;
    private BaseQuery baseQuery = new MenuQuery();

    @Override
    protected void list() {
        logger.debug("List");
        this.pageResult = menuService.findPageResult(baseQuery);
    }

    @Override
    @InputConfig(methodName = "input")
    public String save() throws Exception {
        logger.debug("save");
        if (menu.getParent() != null && menu.getParent().getId() == -1) {
            menu.setParent(null);
        }
        if (id != null) {
            menuService.update(menu);
        } else {
            menuService.save(menu);
            baseQuery.setCurrentPage(Integer.MAX_VALUE);
        }
        addActionMessage("保存成功");
        return RELOAD;
    }

    @Override
    public String delete() throws Exception {
        logger.debug("delete");
        HttpServletResponse response = ServletActionContext.getResponse();
        // 类型改成json,编码方式UTF-8
        response.setContentType("text/json; charset=UTF-8");
        PrintWriter out = response.getWriter();
        if (id != null) {
            try {
                menuService.delete(id);
                out.print("{\"success\":true,\"msg\":\"删除成功\"}");
            } catch (Exception e) {
                out.print("{\"success\":false,\"msg\":\"" + e.getMessage()
                        + "\"}");
            }
        } else {
            out.print("{\"success\":false,\"msg\":\"没有删除的id\"}");
        }
        return null;// 返回null
    }

    @Override
    public String input() throws Exception {
        logger.debug("input");
        putContext("allMenu", menuService.getAll());
        return INPUT;
    }

    @Override
    public void beforeSave() {

        if (id == null) {
            menu = new Menu();
        } else {
            menu = menuService.get(id);
        }
    }

    @Override
    public void beforeInput() {
        if (id != null) {
            menu = menuService.get(id);
        }
    }

    public Menu getModel() {
        return menu;
    }

    public BaseQuery getBaseQuery() {
        return baseQuery;
    }

    public void setBaseQuery(BaseQuery baseQuery) {
        this.baseQuery = baseQuery;
    }

    public IMenuService getMenuService() {
        return menuService;
    }

    public PageResult<Menu> getPageResult() {
        return pageResult;
    }


    public void setMenuService(IMenuService menuService) {
        this.menuService = menuService;
    }


    public void setPageResult(PageResult<Menu> pageResult) {
        this.pageResult = pageResult;
    }

}