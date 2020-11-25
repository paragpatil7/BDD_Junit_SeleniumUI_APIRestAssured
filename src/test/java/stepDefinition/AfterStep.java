package stepDefinition;

import cucumber.api.java.After;
import utils.SeleniumDriver;

public class AfterStep {

	@After
	public static void tearDown()
	{
		System.out.println("in cucumber after class - hooks");
		SeleniumDriver.tearDown();
	}
	
}
