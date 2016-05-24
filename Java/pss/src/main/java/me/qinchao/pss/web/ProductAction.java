package me.qinchao.pss.web;

import com.opensymphony.xwork2.interceptor.annotations.InputConfig;
import me.qinchao.pss.domain.Product;
import me.qinchao.pss.domain.ProductType;
import me.qinchao.pss.query.BaseQuery;
import me.qinchao.pss.query.PageResult;
import me.qinchao.pss.query.ProductQuery;
import me.qinchao.pss.service.IProductService;
import me.qinchao.pss.service.IProductTypeService;
import me.qinchao.pss.service.ISystemDictionaryDetailService;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductAction extends CRUDAction<Product> {
    private static final long serialVersionUID = 1L;
    private IProductService productService;
    private IProductTypeService productTypeService;
    private ISystemDictionaryDetailService systemDictionaryDetailService;
    private Product product = new Product();
    private PageResult<Product> pageResult;
    private BaseQuery baseQuery = new ProductQuery();

    @Override
    protected void list() {
        logger.debug("ProductAction List");
        // putContext("allTypes", productTypeService.getAll());
        this.pageResult = productService.findPageResult(baseQuery);
    }

    public String bill() throws Exception {
        logger.debug("Bill");
//		System.out.println("bill-------------");
        this.pageResult = productService.findPageResult(baseQuery);
        return "bill";
    }

    private File upload;

    public File getUpload() {
        return upload;
    }

    public void setUpload(File upload) {
        this.upload = upload;
    }

    @Override
    @InputConfig(methodName = "input")
    public String save() throws Exception {
        logger.debug("save");
        // System.out.println("path: "
        // + ServletActionContext.getServletContext().getRealPath("/"));
        // System.out.println("filename: " + new Date().getTime() + ".png");
        String path = ServletActionContext.getServletContext().getRealPath("/");
        String filename = "upload_pic/" + new Date().getTime() + ".png";
        File file = new File(path, filename);
        if (upload != null) {
            FileUtils.copyFile(upload, file);
            // System.out.println(filename);
            product.setPic(filename);
        }
        if (id != null) {
            productService.update(product);
        } else {
            productService.save(product);
            baseQuery.setCurrentPage(Integer.MAX_VALUE);
        }
        System.out.println(product);
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
                productService.delete(id);
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

        // 添加一个一级类型列表的选择
        putContext("allParents", productTypeService.getParents());
        // 添加一个二级类型列表的选择
        List<ProductType> allChildrens = new ArrayList<ProductType>();
        allChildrens.add(new ProductType(-1L, "-请选择-"));

        ProductType productType = product.getTypes();
        if (product != null && product.getTypes() != null) {

            ProductType parentProductType = productType.getParent();
            List<ProductType> children = productTypeService
                    .findChildrentByParentId(parentProductType.getId());
            allChildrens.addAll(children);
        }
        putContext("allChildrens", allChildrens);
        // 显示品牌和单位列表
        putContext("allBrands", systemDictionaryDetailService.getBrands());
        putContext("allUnits", systemDictionaryDetailService.getUnits());
        return INPUT;
    }

    @Override
    public void beforeSave() {

        if (id == null) {
            product = new Product();
        } else {
            product = productService.get(id);
        }
    }

    @Override
    public void beforeInput() {
        if (id != null) {
            product = productService.get(id);
        }
    }

    public String findChildren() {
        putJson(productTypeService.findChildrentByParentId(id));
        return AJAX_RESULT;
    }

    public Product getModel() {
        return product;
    }

    public BaseQuery getBaseQuery() {
        return baseQuery;
    }

    public void setBaseQuery(BaseQuery baseQuery) {
        this.baseQuery = baseQuery;
    }

    public IProductService getProductService() {
        return productService;
    }

    public PageResult<Product> getPageResult() {
        return pageResult;
    }

    public void setProductService(IProductService productService) {
        this.productService = productService;
    }

    public void setPageResult(PageResult<Product> pageResult) {
        this.pageResult = pageResult;
    }

    public void setProductTypeService(IProductTypeService productTypeService) {
        this.productTypeService = productTypeService;
    }

    public void setSystemDictionaryDetailService(
            ISystemDictionaryDetailService systemDictionaryDetailService) {
        this.systemDictionaryDetailService = systemDictionaryDetailService;
    }
}