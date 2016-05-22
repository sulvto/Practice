package me.qinchao.shopping.util;

//通用的工具类
public class CommUtil {
	private CommUtil() {
	}

	//判断字符串是否非空(既不是null,也不是"")
	public static boolean hasLength(String str) {
		return str != null && !"".equals(str.trim());
	}
}
