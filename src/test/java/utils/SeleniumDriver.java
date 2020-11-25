package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver {

	private static SeleniumDriver SeleniumDriver;
	
    //initialize webdriver
	private static WebDriver driver;

    //initialize timeouts
	private static WebDriverWait wait;
	private static int TIMEOUT=30;
	private static int PageLoadTIMEOUT=60;
	
	private SeleniumDriver()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver,30);
		driver.manage().timeouts().implicitlyWait(TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PageLoadTIMEOUT, TimeUnit.SECONDS);
		
		String window = driver.getWindowHandle();
		System.out.println("current window handle"+window);
			
	}
	
	
	public static void SetUpDriver()
	{
		if (SeleniumDriver == null)
		{
			SeleniumDriver= new SeleniumDriver();
		}
			
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
	
	public static void openURL(String URL)
	{
		System.out.println(URL);
		driver.get(URL);
	}
	
    public static void tearDown() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
        SeleniumDriver = null;
    }

}
