

import java.util.Map;

import org.testng.annotations.Test;

import com.code.mvn.DataDrivenFrameWork.DataProviderExcel;

public class TestExcelData {
	
	@Test(dataProvider="getLoggingData", dataProviderClass = DataProviderExcel.class) 
	public void testLoggingData(Map<String, Object> data){
		//testing the data
		System.out.println("User name  = " +  data.get("UserName") + " Password  =" +  data.get("PassWord"));
		
	}
	
	
	@Test(dataProvider ="catalogueTest", dataProviderClass= DataProviderExcel.class)
	public void test2(Map<String, Object>map){
		//Testing excel File
		System.out.println( "Category  = " +  map.get("Category") +  "--->Book name  = " + map.get("BookName"));
		
		
		

		System.out.println("User name  = " +  map.get("UserName") + " Password  =" +  map.get("PassWord"));
		

		
	}
	
	
	

	
	
	

}





