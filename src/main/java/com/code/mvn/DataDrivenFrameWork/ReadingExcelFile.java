package com.code.mvn.DataDrivenFrameWork;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelFile {
	
	
	public static Object[][]getdata(String fileName, String sheetName) throws IOException{
		
		XSSFWorkbook book = new XSSFWorkbook(ReadingExcelFile.class.getClassLoader().getResourceAsStream("Resources/"+fileName));
		XSSFSheet sheet =  book.getSheet(sheetName);
		XSSFRow row =  null;
		XSSFCell cel =null;
		Map<String, Object>map = null;
		row =  sheet.getRow(0);
		Object[][] data = new Object[sheet.getLastRowNum()][1];
		String []header =  new String[row.getLastCellNum()];
		
		for(int j = row.getFirstCellNum(); j<row.getLastCellNum(); j++){
			cel = row.getCell(j);
			header[j] = cel.getStringCellValue();
		}
		for(int i = sheet.getFirstRowNum()+1; i<=sheet.getLastRowNum(); i++){
			row = sheet.getRow(i);
			map = new LinkedHashMap<String, Object>();
			for(int j = row.getFirstCellNum(); j<row.getLastCellNum(); j++){
				cel = row.getCell(j);
				switch (cel.getCellType()){
				case XSSFCell.CELL_TYPE_STRING:
					map.put(header[j], cel.getStringCellValue());
					break;
				case XSSFCell.CELL_TYPE_NUMERIC:
					map.put(header[j], cel.getNumericCellValue());
					break;	
				}
			}
			data[i-1][0] = map;
		}
	return data;
	
	}

}
