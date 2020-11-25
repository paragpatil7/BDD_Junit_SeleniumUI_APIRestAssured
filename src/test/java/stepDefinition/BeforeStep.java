package stepDefinition;

import cucumber.api.java.Before;
import utils.SeleniumDriver;

public class BeforeStep {

	
	@Before
	public static void setup()
	{
		System.out.println("in Cumcumber before class - hooks");
		SeleniumDriver.SetUpDriver();
	}
}
