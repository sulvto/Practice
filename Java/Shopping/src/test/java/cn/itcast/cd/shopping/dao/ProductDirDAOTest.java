package cn.itcast.cd.shopping.dao;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import cn.itcast.cd.shopping.dao.impl.ProductDirDAOImpl;
import cn.itcast.cd.shopping.domain.ProductDir;

public class ProductDirDAOTest {
	private IProductDirDAO dao;

	@Before
	public void init() throws Exception {
		dao = new ProductDirDAOImpl();
	}

	@Test
	public void testSave() {
		ProductDir dir = new ProductDir();
		dir.setName("指环戒指");
		dir.setEnglishName("Ring Finger Ring");
		dir.setIntro("Ring Finger Ring");
		dao.save(dir);
	}

	@Test
	public void testUpdate() {
		ProductDir dir = new ProductDir();
		dir.setName("翡翠手镯");
		dir.setEnglishName("Jade Bangle");
		dir.setIntro("Jade Bangle Jade Bangle Jade Bangle!");

		dir.setId(2L);
		dao.update(dir);
	}

	@Test
	public void testDelete() {
		dao.delete(4L);
	}

	@Test
	public void testGet() {
		ProductDir dir = dao.get(1L);
		System.out.println(dir);
	}

	@Test
	public void testGetAll() {
		List<ProductDir> list = dao.getAll();
		for (ProductDir pd : list) {
			System.out.println(pd);
		}
	}
}
