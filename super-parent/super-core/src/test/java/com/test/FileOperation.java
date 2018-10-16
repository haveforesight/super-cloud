package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;
import java.util.List;

import com.xxx.utils.ExcelUtil;

public class FileOperation {
	
	///demo/ComprehensiveDemo/assets/%E8%B4%B4%E5%9B%BE/%E4%BA%91%E5%B1%82.png
	public static void main(String[] args) {
		
		 try {
			 File file = new File("D://demo.xlsx");
			InputStream in = new FileInputStream(file);
			List<List<String>> list = new ExcelUtil(in, "").read();
			
			String projectPath ="D://";
			String projectName = "bigscreen-newenergy";
			FileInputStream fis = null;
			FileOutputStream fos = null;
			for (List<String> list2 : list) {
				String str = list2.get(0);
				System.out.println(str);
				String filePath =str.substring(str.indexOf(projectName)+ projectName.length(), str.length());
				String fileName = filePath.substring(filePath.lastIndexOf("/")+1, filePath.length());
				
				filePath = filePath.substring(0, filePath.indexOf(fileName));
				
				File yfile = new File("D:\\hightopo\\demo\\bigscreen-newenergy\\"+ fileName);
				fis = new FileInputStream(yfile);
				
				File pp = new File( projectPath +File.separator + projectName + File.separator + URLDecoder.decode( filePath));
				if(!pp.exists()) {
					pp.mkdirs();
				}
					File ppFile = new File(pp.getPath() + File.separator +URLDecoder.decode(fileName ) );
					ppFile.createNewFile();
					
					fos = new FileOutputStream(ppFile);
					int a ;
					while (-1 != (a = fis.read())) {
						fos.write(a);
					}
					fos.flush();
					fos.close();
					fis.close();
				
			}
					
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
