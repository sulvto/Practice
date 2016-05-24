package me.qinchao.pss.service;

import java.util.List;

import me.qinchao.pss.domain.SystemDictionaryDetail;

public interface ISystemDictionaryDetailService extends
		IBaseService<SystemDictionaryDetail> {
	public List<SystemDictionaryDetail> getBrands();

	public List<SystemDictionaryDetail> getUnits();

}
