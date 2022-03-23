package com.Data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_data {

	public static void Particular_Cell_Data() throws IOException {

		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\Maven_Project1\\Data Driven.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);

		Row r = s.getRow(1);

		Cell c = r.getCell(1);

		CellType type = c.getCellType();

		if (type.equals(CellType.STRING)) {

			String stringCellValue = c.getStringCellValue();
			System.out.println(stringCellValue);

		}

		else if (type.equals(CellType.NUMERIC)) {

			double numericCellValue = c.getNumericCellValue();

			int value = (int) numericCellValue;

			System.out.println(value);
		}

		wb.close();

	}

	public static void all_data() throws IOException {

		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\Maven_Project1\\Data Driven.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);

		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {

			Row r = s.getRow(i);

			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {

				Cell c = r.getCell(j);

				CellType type = c.getCellType();

				if (type.equals(CellType.STRING)) {

					String stringvalue = c.getStringCellValue();
					System.out.println(stringvalue);

				} else if (type.equals(CellType.NUMERIC)) {

					double numericvalue = c.getNumericCellValue();

					int v = (int) numericvalue;

					String intvalue = Integer.toString(v);

					System.out.println(intvalue);

				}

			}
			wb.close();
		}

	}

	public static void Particular_Column_data() throws IOException {

		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\Maven_Project1\\Data Driven.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);

		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {

			Row r = s.getRow(i);

			Cell c = r.getCell(0);

			CellType type = c.getCellType();

			if (type.equals(CellType.STRING)) {

				String value = c.getStringCellValue();
				System.out.println(value);

			}

			else if (type.equals(CellType.NUMERIC)) {

				double value = c.getNumericCellValue();

				int v = (int) value;

				String intvalue = Integer.toString(v);

				System.out.println(intvalue);

			}

		}
		wb.close();

	}

	public static void Particular_row_data() throws IOException {

		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\Maven_Project1\\Data Driven.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);

		Row r = s.getRow(2);

		for (int i = 0; i <r.getPhysicalNumberOfCells(); i++) {

			Cell c = r.getCell(i);

			CellType type = c.getCellType();

			if (type.equals(CellType.STRING)) {

				String value = c.getStringCellValue();
				System.out.println(value);

			}

			else if (type.equals(CellType.NUMERIC)) {

				double value = c.getNumericCellValue();

				int v = (int) value;

				String intvalue = Integer.toString(v);

				System.out.println(intvalue);

			}

		}

		wb.close();

	}

	public static void main(String[] args) throws IOException {
		Particular_row_data();

	}

}
