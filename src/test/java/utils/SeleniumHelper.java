package utils;

import org.openqa.selenium.WebElement;

public class SeleniumHelper {

	
	public static boolean IsElementPresent(WebElement element)
	{
		try
		{
			boolean isPresent=element.isDisplayed();
			return isPresent;
		}
		catch(Exception ex)
		{
			ex.getMessage();
			return false;
		}
	}
	
	
	 public static void waitForPageToLoad()
	    {
	    	try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
}
