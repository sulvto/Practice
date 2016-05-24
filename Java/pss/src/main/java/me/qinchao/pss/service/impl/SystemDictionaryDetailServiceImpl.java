package me.qinchao.pss.service.impl;

import java.util.List;

import me.qinchao.pss.domain.SystemDictionaryDetail;
import me.qinchao.pss.domain.SystemDictionaryType;
import me.qinchao.pss.service.ISystemDictionaryDetailService;

public class SystemDictionaryDetailServiceImpl extends
		BaseServiceImpl<SystemDictionaryDetail> implements
		ISystemDictionaryDetailService {
	// 获取 品牌
	public List<SystemDictionaryDetail> getBrands() {
//		System.out.println("-------------getBrands");
		List<SystemDictionaryDetail> list = baseDao.findByHql(
				"select o from SystemDictionaryDetail o where o.types.sn=?",
				SystemDictionaryType.PRDOCT_BRAND);
//		System.out.println(list);
		return list;
	}

	// 获取单位
	public List<SystemDictionaryDetail> getUnits() {
//		System.out.println("--------getUnits");
		List<SystemDictionaryDetail> list = baseDao.findByHql(
				"select o from SystemDictionaryDetail o where o.types.sn=?",
				SystemDictionaryType.PRDOCT_UNIT);
//		System.out.println(list);
		return list;
	}

}
