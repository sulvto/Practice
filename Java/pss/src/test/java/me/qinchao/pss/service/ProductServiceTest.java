package me.qinchao.pss.service;

import me.qinchao.pss.domain.Product;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductServiceTest extends BaseServiceTest<Product> {
	@Autowired
	private IProductService productService;

	@Test
	public void test() throws Exception {
		
	}
}
