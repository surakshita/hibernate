package com.xworkz.planet;

public class ExcelTester {

	public static void main(String[] args) {
		String excelPath="./data/TestData.xlsx";
		String sheetName="Sheet1";
		ReadExcel readExcel = new ReadExcel(excelPath, sheetName);
	
		readExcel.getCellData();

	}

}
