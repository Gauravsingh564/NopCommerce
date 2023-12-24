package com.wipro.utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetRegFileData {
	public String[][] getReg(String path,String sheet) throws Exception{
		FileInputStream f= new FileInputStream(path);
		@SuppressWarnings("resource")
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet sheets=wb.getSheet(sheet); 
		int row=sheets.getPhysicalNumberOfRows();
		int col=sheets.getRow(0).getPhysicalNumberOfCells();
		System.out.println(row);
		System.out.println(col);
		String a[][]=new String [row-1][col];
		for(int i=1;i<row;i++) {
			Row r=sheets.getRow(i); 
			for(int j=0;j<col;j++) { 
				a[i-1][j]=r.getCell(j).toString();
			}
		}
		f.close(); 
		return a;
	}
}
