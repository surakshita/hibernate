package com.xworkz.planet;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public ReadExcel(String excelPath, String sheetName) {
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*
	 * public static void main(String[] args) { getRowCount(); getCellData(); }
	 */

	public static void getCellData() {
		System.out.println("invoked cell data");

		int value = (int) sheet.getRow(1).getCell(0).getNumericCellValue();
		System.out.println(value);

		String name = sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println("Name:" + name);

		double area = sheet.getRow(1).getCell(2).getNumericCellValue();
		System.out.println("Area:" + area);

		String satellite = sheet.getRow(1).getCell(3).getStringCellValue();
		System.out.println("Satellite:" + satellite);

		String shape = sheet.getRow(1).getCell(4).getStringCellValue();
		System.out.println("Shape:" + shape);

	}

	public static void getRowCount() {
		System.out.println("row count invoked");
		// String projectDir=System.getProperty("user.dir");
		// System.out.println(projectDir);
		try {
			String excelPath = "./data/TestData.xlsx";
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet("Sheet1");
			int rowcount = sheet.getPhysicalNumberOfRows();
			System.out.println(rowcount);
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (workbook != null)

					workbook.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
