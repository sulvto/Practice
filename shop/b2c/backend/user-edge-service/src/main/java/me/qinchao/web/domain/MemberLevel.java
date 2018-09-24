package me.qinchao.web.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by sulvto on 9/24/18.
 */
@Entity
public class MemberLevel {

    public static final String MEMBERLEVEL_NAVIGATION_TYPE_OR = "or";
    public static final String MEMBERLEVEL_NAVIGATION_TYPE_AND = "and";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    // 1, 累计积分
    // 2, 消费额度
    private int upgradeCondition;
    private String discount;
    private long minIntegral;
    private long quota;
    private String navigationType;
    private String description;

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

    public int getUpgradeCondition() {
        return upgradeCondition;
    }

    public void setUpgradeCondition(int upgradeCondition) {
        this.upgradeCondition = upgradeCondition;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public long getMinIntegral() {
        return minIntegral;
    }

    public void setMinIntegral(long minIntegral) {
        this.minIntegral = minIntegral;
    }

    public long getQuota() {
        return quota;
    }

    public void setQuota(long quota) {
        this.quota = quota;
    }

    public String getNavigationType() {
        return navigationType;
    }

    public void setNavigationType(String navigationType) {
        this.navigationType = navigationType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
