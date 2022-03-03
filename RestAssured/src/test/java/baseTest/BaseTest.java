package baseTest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import utils.FileandEnv;
import utils.*;

@Listeners(ExtentReportListener.class)
public class BaseTest extends ExtentReportListener{
	
	@Test
	public void utilTest() {
		
		test.log(LogStatus.INFO, "utilTest: Started");
		
		//Printing the environment variables based on selection in BaseTest > Run As > Run Configuration > Arguments "-Denv=qa/dev/staging"
		System.out.println(FileandEnv.envAndFile());
		
		//Printing based on the selected Key Value of the selected env configuration
		System.out.println(FileandEnv.envAndFile().get("ServerURL"));
		System.out.println(FileandEnv.envAndFile().get("Port"));
		System.out.println(FileandEnv.envAndFile().get("Username"));
		System.out.println(FileandEnv.envAndFile().get("Password"));
		
		test.log(LogStatus.PASS, "utilTest: Passed");
		test.log(LogStatus.INFO, "utilTest: Completed");
	}
	

}
