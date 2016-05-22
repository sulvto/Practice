package me.qinchao.shopping.util;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import net.coobird.thumbnailator.Thumbnails;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;

@SuppressWarnings("unchecked")
public class FileUtil {
	private FileUtil() {
	}
	public static void upload(HttpServletRequest req,Map<String,String> fieldMap,Map<String,String> binaryMap) {
		boolean isMultipart = ServletFileUpload.isMultipartContent(req);
		if (!isMultipart) {
			return;
		}
		try {
			FileItemFactory factory = new DiskFileItemFactory();
			ServletFileUpload upload = new ServletFileUpload(factory);
			List<FileItem> items = upload.parseRequest(req);
			for (FileItem item : items) {
				String fieldName = item.getFieldName();
				if (item.isFormField()) {
					//普通表单控件
					String fieldValue = item.getString("UTF-8");
					fieldMap.put(fieldName, fieldValue);
				} else {
					//上传控件
					String dir = req.getServletContext().getRealPath(
							"/upload");
					String ext = FilenameUtils.getExtension(item.getName());
//					String uuid = UUID.randomUUID().toString();\
					String name = fieldMap.get("name");
					String fileName = name+"."+ext;
					File f = new File(dir, fileName);
					//图片压缩
					item.write(f);
					
					System.out.println(fieldMap);
					
					File smallFile = new File(dir,name+"_small."+ext);
					Thumbnails.of(f).size(100, 100).toFile(smallFile);
					binaryMap.put("bigPath", "/upload/"+fileName);
					binaryMap.put("smallPic", "/upload/"+name+"_small."+ext);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
