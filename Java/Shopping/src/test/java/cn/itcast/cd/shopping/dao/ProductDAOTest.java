package cn.itcast.cd.shopping.dao;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import cn.itcast.cd.shopping.domain.Product;
import cn.itcast.cd.shopping.domain.ProductDir;
import cn.itcast.cd.shopping.factory.BeanFactory;

public class ProductDAOTest {
	private IProductDAO dao;

	@Before
	public void init() throws Exception {
		dao = BeanFactory.INSTANCE.getBean("productDAO", IProductDAO.class);
	}

	@Test
	public void testSave() {
		
		Product pro = new Product();
		for (int i = 1; i < 6; i++) {
			
		
		pro.setSn("abddd_"+i);
		pro.setName("金蟾观音_"+i);
		pro.setMarketPrice(new BigDecimal(300 +(i*50)));
		pro.setCostPrice(new BigDecimal(400 +(i*50)));
		pro.setSalePrice(new BigDecimal(500 +(i*50)));
		pro.setPlace("成都");
		pro.setModel("长10cm，宽10cm，高10cm");
		pro.setNum(1);
		pro.setIntro("就是a");

		pro.setBigPic("1.img");
		pro.setSmallPic("2.img");
		ProductDir dir = new ProductDir();
		dir.setId(2L);
		pro.setDir(dir);
		pro.setViewTimes(5);
		pro.setRecommended(false);
		pro.setCutOff(1.0);
		pro.setInputDate(new Date());
		pro.setStatus(0);
		dao.save(pro);
		}
	}
}
