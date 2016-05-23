package me.qinchao.shopping;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;

public class MD5Test {

	@Test
	public void testMd5() throws Exception {
		String pwd = "12345";//c4ca4238a0b923820dcc509a6f75849b
//		pwd="wokao"+pwd;//wokao1
		pwd = DigestUtils.md5Hex(pwd);
		System.out.println(pwd);
	}
}
