package cn.itcast.cd.file;

import java.io.File;

import net.coobird.thumbnailator.Thumbnails;

import org.junit.Test;

public class FileTest {
	
	@Test
	public void test() throws Exception {
		File srcFile = new File("C:/大图.jpg");//被压缩文件对象
		File targetFile = new File("C:/图_111.jpg");//被压缩文件对象
		//of(File f):表示压缩哪一个图片文件
		//size(int width,int hight):压缩的图片最终的大小
		//toFile(File f):最终的图片对象
		Thumbnails.of(srcFile).size(100, 100).toFile(targetFile);
	}
}
