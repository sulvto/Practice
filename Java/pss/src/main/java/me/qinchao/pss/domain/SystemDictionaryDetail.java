package me.qinchao.pss.domain;

public class SystemDictionaryDetail {
	private Long id;
	private String name;
	private SystemDictionaryType types;

	/**
	 * @roseuid 54598F780072
	 */
	public SystemDictionaryDetail() {

	}

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

	public SystemDictionaryType getTypes() {
		return types;
	}

	public void setTypes(SystemDictionaryType types) {
		this.types = types;
	}

}
