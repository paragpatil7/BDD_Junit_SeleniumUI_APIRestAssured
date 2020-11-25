 package pom.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleHomePageLocators {

	
	@FindBy(how =How.NAME,using="q")
	public WebElement TextBox_Search;
	
	@FindBy(how=How.XPATH,using="//*[@id='tsf']/div[2]/div[1]/div[3]/center/input[1]")
	public WebElement Button_SearchTxt;
	
}
