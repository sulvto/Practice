package me.qinchao.web.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by sulvto on 9/24/18.
 */
@Entity
public class GoodsCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String abbreviate;
    private long parentId;
    // 关联类型
    private int goodsType;
    private boolean show;
    private int sort;
    private String keywords;
    private String description;
    private String pcCustomTemplate;
    private String wapCustomTemplate;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviate() {
        return abbreviate;
    }

    public void setAbbreviate(String abbreviate) {
        this.abbreviate = abbreviate;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    public int getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(int goodsType) {
        this.goodsType = goodsType;
    }

    public boolean isShow() {
        return show;
    }

    public void setShow(boolean show) {
        this.show = show;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPcCustomTemplate() {
        return pcCustomTemplate;
    }

    public void setPcCustomTemplate(String pcCustomTemplate) {
        this.pcCustomTemplate = pcCustomTemplate;
    }

    public String getWapCustomTemplate() {
        return wapCustomTemplate;
    }

    public void setWapCustomTemplate(String wapCustomTemplate) {
        this.wapCustomTemplate = wapCustomTemplate;
    }
}
