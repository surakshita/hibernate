package com.xworkz.planet;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		
		String excelPath=".\\data\\TestData.xlsx";
		
		FileInputStream inputStream=new FileInputStream(excelPath);
		
		XSSFWorkbook workbook=new XSSFWorkbook(inputStream);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		//using iterator
		
		Iterator iterator=sheet.iterator();
		
		while(iterator.hasNext()) {
			XSSFRow row=(XSSFRow) iterator.next();
			Iterator cellIterator=row.cellIterator();
			
			while(cellIterator.hasNext()) {
				XSSFCell cell=(XSSFCell) cellIterator.next();
				
				switch(cell.getCellType()) {
				case NUMERIC:System.out.println(cell.getNumericCellValue()); 
				break;
				case STRING:System.out.println(cell.getStringCellValue()); 
				break;
				case BOOLEAN:System.out.println(cell.getBooleanCellValue()); 
				break;
				}
			}System.out.println("**************");
		}
		
		workbook.close();

	}

}
