package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectWrappers extends GenericWrapper{
	
	@BeforeMethod
	public void launchIrctc(){
		invokeApp("chrome", "https://www.irctc.co.in");
		
	}
	@AfterMethod
	public void closeIrctc(){
		closeAllBrowsers();
		
	}
}
