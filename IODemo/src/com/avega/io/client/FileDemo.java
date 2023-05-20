package com.avega.io.client;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		

		File f=new File("D:\\external Training");
		System.out.println(f.isDirectory());
		
		
		String files[]=f.list();
		for(String file:files) {
			File fileop=new File(f+"\\"+file);
			/*
			 * if(fileop.isFile()) { System.out.println(fileop.getAbsolutePath()); }
			 */
			
			
		}
		
		File fileext[]=f.listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File f, String name) {
				// TODO Auto-generated method stub
				return name.endsWith(".xlsx");
			}
			
		});
		
		System.out.println(Arrays.toString(fileext));
		
		
File file_filerted[]=f.listFiles(new FileFilter() {

	@Override
	public boolean accept(File pathname) {
		// TODO Auto-generated method stub
		return pathname.length()<2048;
	}});		
System.out.println(Arrays.toString(file_filerted ));	
	}
	
}
