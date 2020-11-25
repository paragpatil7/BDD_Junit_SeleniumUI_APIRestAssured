package pom.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utils.SeleniumDriver;
import utils.SeleniumHelper;
import pom.locators.*;

public class GoogleHomePageActions {

	
	GoogleHomePageLocators GoogleHomePageLocators=null;
	public WebDriver driver=SeleniumDriver.getDriver();
	
	public GoogleHomePageActions()
	{
		this.GoogleHomePageLocators=new GoogleHomePageLocators();
		PageFactory.initElements(driver, GoogleHomePageLocators);
	}
	
	
	public void search_text(String SearchText)
	{
		boolean elepresent=SeleniumHelper.IsElementPresent(GoogleHomePageLocators.TextBox_Search);
		if(elepresent)
		{
			System.out.println("Page Open Successfully");
			GoogleHomePageLocators.TextBox_Search.sendKeys(SearchText);
		}
		else
		{
			System.out.println("Element not found");
		}
		
	}
	
	public void submit_search()
	{
		GoogleHomePageLocators.Button_SearchTxt.click();
	}
}
