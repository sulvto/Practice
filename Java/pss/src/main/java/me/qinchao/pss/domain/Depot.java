package me.qinchao.pss.domain;

import java.math.BigDecimal;

//部门
public class Depot {
	private Long id;
	private String name;
	private BigDecimal maxCapacity;// 最大容量 参考值
	private BigDecimal capcity;// 当前容量 参考值
	private BigDecimal totlaAmount;// 仓库总金额

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(BigDecimal maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public BigDecimal getCapcity() {
		return capcity;
	}

	public void setCapcity(BigDecimal capcity) {
		this.capcity = capcity;
	}

	public BigDecimal getTotlaAmount() {
		return totlaAmount;
	}

	public void setTotlaAmount(BigDecimal totlaAmount) {
		this.totlaAmount = totlaAmount;
	}

	@Override
	public String toString() {
		return "Depot [id=" + id + ", name=" + name + ", maxCapacity="
				+ maxCapacity + ", capcity=" + capcity + ", totlaAmount="
				+ totlaAmount + "]";
	}

}
