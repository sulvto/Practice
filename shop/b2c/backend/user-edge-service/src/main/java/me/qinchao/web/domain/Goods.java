package me.qinchao.web.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

/**
 * Created by sulvto on 9/24/18.
 */
@Entity
public class Goods {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Date createDate;
    private String name;
    private int type;

    @OneToOne(cascade = CascadeType.ALL)
    private GoodsCategory goodsCategory;

    private String extendedClass;

    private String cloudAddress;
    private String cloudPassword;

    private String cardPassword;

    private String downloadResources;
    private String unzipPassword;
    private String validityPeriod;

    private String introduction;
    private String keywords;
    private String unit;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<GoodsLabel> labels;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<GoodsBrand> brands;

    @OneToOne(cascade = CascadeType.ALL)
    private GoodsSupplier supplier;

    private long basicPraise;
    private long basicShare;
    private String productCodeA;
    private Date productionDate;
    private int shelfLife;
    private long totalStock;
    private int minStockLaram;
    private boolean showStock;
    private boolean shelves;
    private String province;
    private String city;
    private BigDecimal marketPrice;
    private BigDecimal salePrice;
    private BigDecimal costPrice;
    private int fare;
    private int shippingTeeType;
    private int goodsWeight;
    private int goodsVolume;
    private int expressCompany;
    private int purchaseLimit;
    private int minBuy;

    private int presellDeliveryType;
    private BigDecimal presellPrice;
    private Date presellTime;
    private int presellDay;

    private int maxUseIntegral;
    private int integralSelect;
    private int integrationAvailableUse;
    private int integralGiveType;
    private int integrationAvailableGive;
    private int integrationAvailableGiveRatio;

    // 价格保留方式
    private int priceRetentionMethod;


    // 模板
    private String pcCustomTemplate;
    private String wapCustomTemplate;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public GoodsCategory getGoodsCategory() {
        return goodsCategory;
    }

    public void setGoodsCategory(GoodsCategory goodsCategory) {
        this.goodsCategory = goodsCategory;
    }

    public String getExtendedClass() {
        return extendedClass;
    }

    public void setExtendedClass(String extendedClass) {
        this.extendedClass = extendedClass;
    }

    public String getCloudAddress() {
        return cloudAddress;
    }

    public void setCloudAddress(String cloudAddress) {
        this.cloudAddress = cloudAddress;
    }

    public String getCloudPassword() {
        return cloudPassword;
    }

    public void setCloudPassword(String cloudPassword) {
        this.cloudPassword = cloudPassword;
    }

    public String getCardPassword() {
        return cardPassword;
    }

    public void setCardPassword(String cardPassword) {
        this.cardPassword = cardPassword;
    }

    public String getDownloadResources() {
        return downloadResources;
    }

    public void setDownloadResources(String downloadResources) {
        this.downloadResources = downloadResources;
    }

    public String getUnzipPassword() {
        return unzipPassword;
    }

    public void setUnzipPassword(String unzipPassword) {
        this.unzipPassword = unzipPassword;
    }

    public String getValidityPeriod() {
        return validityPeriod;
    }

    public void setValidityPeriod(String validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Set<GoodsLabel> getLabels() {
        return labels;
    }

    public void setLabels(Set<GoodsLabel> labels) {
        this.labels = labels;
    }

    public Set<GoodsBrand> getBrands() {
        return brands;
    }

    public void setBrands(Set<GoodsBrand> brands) {
        this.brands = brands;
    }

    public GoodsSupplier getSupplier() {
        return supplier;
    }

    public void setSupplier(GoodsSupplier supplier) {
        this.supplier = supplier;
    }

    public long getBasicPraise() {
        return basicPraise;
    }

    public void setBasicPraise(long basicPraise) {
        this.basicPraise = basicPraise;
    }

    public long getBasicShare() {
        return basicShare;
    }

    public void setBasicShare(long basicShare) {
        this.basicShare = basicShare;
    }

    public String getProductCodeA() {
        return productCodeA;
    }

    public void setProductCodeA(String productCodeA) {
        this.productCodeA = productCodeA;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public long getTotalStock() {
        return totalStock;
    }

    public void setTotalStock(long totalStock) {
        this.totalStock = totalStock;
    }

    public int getMinStockLaram() {
        return minStockLaram;
    }

    public void setMinStockLaram(int minStockLaram) {
        this.minStockLaram = minStockLaram;
    }

    public boolean isShowStock() {
        return showStock;
    }

    public void setShowStock(boolean showStock) {
        this.showStock = showStock;
    }

    public boolean isShelves() {
        return shelves;
    }

    public void setShelves(boolean shelves) {
        this.shelves = shelves;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public int getShippingTeeType() {
        return shippingTeeType;
    }

    public void setShippingTeeType(int shippingTeeType) {
        this.shippingTeeType = shippingTeeType;
    }

    public int getGoodsWeight() {
        return goodsWeight;
    }

    public void setGoodsWeight(int goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    public int getGoodsVolume() {
        return goodsVolume;
    }

    public void setGoodsVolume(int goodsVolume) {
        this.goodsVolume = goodsVolume;
    }

    public int getExpressCompany() {
        return expressCompany;
    }

    public void setExpressCompany(int expressCompany) {
        this.expressCompany = expressCompany;
    }

    public int getPurchaseLimit() {
        return purchaseLimit;
    }

    public void setPurchaseLimit(int purchaseLimit) {
        this.purchaseLimit = purchaseLimit;
    }

    public int getMinBuy() {
        return minBuy;
    }

    public void setMinBuy(int minBuy) {
        this.minBuy = minBuy;
    }

    public int getPresellDeliveryType() {
        return presellDeliveryType;
    }

    public void setPresellDeliveryType(int presellDeliveryType) {
        this.presellDeliveryType = presellDeliveryType;
    }

    public BigDecimal getPresellPrice() {
        return presellPrice;
    }

    public void setPresellPrice(BigDecimal presellPrice) {
        this.presellPrice = presellPrice;
    }

    public Date getPresellTime() {
        return presellTime;
    }

    public void setPresellTime(Date presellTime) {
        this.presellTime = presellTime;
    }

    public int getPresellDay() {
        return presellDay;
    }

    public void setPresellDay(int presellDay) {
        this.presellDay = presellDay;
    }

    public int getMaxUseIntegral() {
        return maxUseIntegral;
    }

    public void setMaxUseIntegral(int maxUseIntegral) {
        this.maxUseIntegral = maxUseIntegral;
    }

    public int getIntegralSelect() {
        return integralSelect;
    }

    public void setIntegralSelect(int integralSelect) {
        this.integralSelect = integralSelect;
    }

    public int getIntegrationAvailableUse() {
        return integrationAvailableUse;
    }

    public void setIntegrationAvailableUse(int integrationAvailableUse) {
        this.integrationAvailableUse = integrationAvailableUse;
    }

    public int getIntegralGiveType() {
        return integralGiveType;
    }

    public void setIntegralGiveType(int integralGiveType) {
        this.integralGiveType = integralGiveType;
    }

    public int getIntegrationAvailableGive() {
        return integrationAvailableGive;
    }

    public void setIntegrationAvailableGive(int integrationAvailableGive) {
        this.integrationAvailableGive = integrationAvailableGive;
    }

    public int getIntegrationAvailableGiveRatio() {
        return integrationAvailableGiveRatio;
    }

    public void setIntegrationAvailableGiveRatio(int integrationAvailableGiveRatio) {
        this.integrationAvailableGiveRatio = integrationAvailableGiveRatio;
    }

    public int getPriceRetentionMethod() {
        return priceRetentionMethod;
    }

    public void setPriceRetentionMethod(int priceRetentionMethod) {
        this.priceRetentionMethod = priceRetentionMethod;
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
