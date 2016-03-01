import java.util.Map;

import org.testng.annotations.Test;

import com.code.mvn.DataDrivenFrameWork.DataProviderExcel;

public class TestExcelData {
	
	@Test(dataProvider="getLoggingData", dataProviderClass = DataProviderExcel.class) 
	public void testLoggingData(Map<String, Object> data){
		System.out.println("User name  = " +  data.get("UserName") + " Password  =" +  data.get("PassWord"));
		
		
		
	}
	

}

