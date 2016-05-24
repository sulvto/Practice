package me.qinchao.pss.domain;

//字典类型
public class SystemDictionaryType {
	public static final String PRDOCT_BRAND = "productBrand";
	public static final String PRDOCT_UNIT = "productUnit";
	private Long id;
	private String sn;
	private String name;

	/**
	 * @roseuid 54598F78001E
	 */
	public SystemDictionaryType() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
