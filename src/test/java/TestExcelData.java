import java.util.Map;

import org.testng.annotations.Test;

import com.code.mvn.DataDrivenFrameWork.DataProviderExcel;

public class TestExcelData {
	
	@Test(dataProvider="getLoggingData", dataProviderClass = DataProviderExcel.class) 
	public void testLoggingData(Map<String, Object> data){
<<<<<<< HEAD
		//testing the data
		System.out.println("User name  = " +  data.get("UserName") + " Password  =" +  data.get("PassWord"));
		
	}
	
	
	@Test(dataProvider ="catalogueTest", dataProviderClass= DataProviderExcel.class)
	public void test2(Map<String, Object>map){
		//Testing excel File
		System.out.println( "Category  = " +  map.get("Category") +  "--->Book name  = " + map.get("BookName"));
		
		
		
=======
		System.out.println("User name  = " +  data.get("UserName") + " Password  =" +  data.get("PassWord"));
		
>>>>>>> 8c3f824a69a4aa7bc5f73d5a2d54139b0b6c581a
		
		
	}
	
<<<<<<< HEAD
	
	

	
	

}


=======

}

>>>>>>> 8c3f824a69a4aa7bc5f73d5a2d54139b0b6c581a
