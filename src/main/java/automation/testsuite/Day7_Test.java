package automation.testsuite;

import automation.common.CommonBase;
import org.testng.annotations.*;

public class Day7_Test extends CommonBase{
	@BeforeMethod
	public void openBrowser()
	{
		System.out.println("This method to open chrome browser");
	}
	@Test
	public void testcase_1()
	{
		System.out.println("This method to test case 1:");
	}
	@AfterMethod
	public void closBrowser()
	{
		System.out.println("This method to close chrome browser");
	}
}
