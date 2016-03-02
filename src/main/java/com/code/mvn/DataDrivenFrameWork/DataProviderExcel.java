package com.code.mvn.DataDrivenFrameWork;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviderExcel {
	
	@DataProvider(name="getLoggingData")
	public static Object[][]getLoggingData() throws IOException{
		
		return ReadingExcelFile.getdata("Excel.xlsx","Sheet1");
	}
	
	
	
	
	@DataProvider(name="catalogueTest")
	public static Object[][]checkCatalogue() throws IOException{
		
		return ReadingExcelFile.getdata("BookCatalogue.xlsx","Sheet1");
	}


}
