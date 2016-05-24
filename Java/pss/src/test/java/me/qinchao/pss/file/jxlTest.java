package me.qinchao.pss.file;

import java.io.File;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.junit.Test;

public class jxlTest {

	@Test
	public void exp() throws Exception {
		// 创建一个xls文件
		WritableWorkbook workbook = Workbook.createWorkbook(new File(
				"output.xls"));
		// 创建文件里面的表
		WritableSheet sheet = workbook.createSheet("First Sheet", 0);
		// 创建表里面的数据:索引从0开始
		// 第1个参数：int c:col 列
		// 第2个参数：int r:row 行
		Label label = new Label(0, 0, "年龄");
		sheet.addCell(label);

		Number number = new Number(0, 1, 18);
		sheet.addCell(number);
		// 写出去
		workbook.write();
		workbook.close();
	}

	@Test
	public void read() throws Exception {
		// 获取xls文件
		Workbook workbook = Workbook.getWorkbook(new File("read.xls"));
		// 获取文件里面的表
		Sheet[] sheets = workbook.getSheets();
		for (Sheet sheet : sheets) {
			System.out.println("行的总数：" + sheet.getRows());
			System.out.println("列的总数：" + sheet.getColumns());
			// 写2个循环：外循环读行，内循环读列
			for (int i = 0; i < sheet.getRows(); i++) {
				for (int j = 0; j < sheet.getColumns(); j++) {
					// 获取内容:
					Cell cell = sheet.getCell(j, i);
					System.out.print(cell.getContents() + "\t");
				}
				System.out.println();
			}
		}
		workbook.close();
	}

}
