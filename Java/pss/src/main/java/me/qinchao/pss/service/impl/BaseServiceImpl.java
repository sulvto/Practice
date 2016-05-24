package me.qinchao.pss.service.impl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import me.qinchao.pss.dao.BaseDao;
import me.qinchao.pss.query.BaseQuery;
import me.qinchao.pss.query.PageResult;
import me.qinchao.pss.service.IBaseService;

public abstract class BaseServiceImpl<T> implements IBaseService<T> {
	protected BaseDao<T> baseDao;
	private Class<T> entityClass;

	public BaseServiceImpl() {
		Class clazz = getClass();
		Type type = clazz.getGenericSuperclass();
		if (type instanceof ParameterizedType) {
			ParameterizedType parameterizedType = (ParameterizedType) type;
			entityClass = (Class) parameterizedType.getActualTypeArguments()[0];
		}
		// System.out.println("entityClass: " + entityClass);

	}

	public void setBaseDao(BaseDao<T> baseDao) {
		this.baseDao = baseDao;
	}

	public void save(T t) {
		baseDao.save(t);
	}

	public void update(T t) {
		baseDao.update(t);

	}

	public void delete(Serializable id) {
		baseDao.delete(entityClass, id);

	}

	public T get(Serializable id) {
		return baseDao.get(entityClass, id);
	}

	public List<T> getAll() {
		return baseDao.getAll(entityClass);
	}

	public PageResult<T> findPageResult(final BaseQuery baseQuery) {
		return baseDao.findPageResult(baseQuery);
	}

	public InputStream exp(String[] heads, List<String[]> list)
			throws Exception {
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		// 创建一个xls文件
		WritableWorkbook workbook = Workbook.createWorkbook(os);
		// 创建文件里面的表
		WritableSheet sheet = workbook.createSheet("First Sheet", 0);
		// 创建表里面的数据:索引从0开始
		// 第1个参数：int c:col 列
		// 第2个参数：int r:row 行

		// 添加表头
		for (int i = 0; i < heads.length; i++) {
			Label label = new Label(i, 0, heads[i]);
			sheet.addCell(label);
		}
		// 排除表头
		for (int i = 0; i < list.size(); i++) {
			String[] strings = list.get(i);
			for (int j = 0; j < strings.length; j++) {
				Label label = new Label(j, i + 1, strings[j]);
				sheet.addCell(label);
			}
		}
		// Number number = new Number(0, 1, 18);
		// sheet.addCell(number);
		// 写出去
		workbook.write();
		workbook.close();
		return new ByteArrayInputStream(os.toByteArray());
	}

	public List<String[]> imp(File upload) throws Exception {
		List<String[]> list = new ArrayList<String[]>();
		// 获取xls文件
		Workbook workbook = Workbook.getWorkbook(upload);
		// 获取文件里面的表
		Sheet sheet = workbook.getSheet(0);
		System.out.println("行的总数：" + sheet.getRows());
		System.out.println("列的总数：" + sheet.getColumns());
		// 写2个循环：外循环读行，内循环读列
		for (int i = 0; i < sheet.getRows(); i++) {
			String[] strings = new String[sheet.getColumns()];
			for (int j = 0; j < sheet.getColumns(); j++) {
				// 获取内容:
				Cell cell = sheet.getCell(j, i);
				strings[j] = cell.getContents();
			}
			list.add(strings);
		}
		workbook.close();
		return list;
	}

}
