import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.code.mvn.DataDrivenFrameWork.LoggerHelper;

public class TestSeleniumLogger {

	private static Logger logger =  LoggerHelper.getLogger(TestSeleniumLogger.class);
	
	
	@Test
	public void test(){
		System.out.println("Test logger #1");
		logger.info("logged logger #1");
		System.out.println("Test logger #2");
	    logger.info("logged logger # 2");
		System.out.println("Test logger # 3");
		logger.info("logged logger #3");
	    System.out.println("error");
		logger.error("Not able to sysout// error");
		
		
		
		
	}

}
