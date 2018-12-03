package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.BasePage;

public class LoginPage extends BasePage 
{
 //decleration
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBTN;
	
	@FindBy(xpath="//nobr[contains(text(),'actiTIME 2017.4')]")
	private WebElement version;
	
	//intialization
	public LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void enterUserName(String un)
	{
		unTB.sendKeys(un);
	}
	public void enterPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
    public void clickOnLogin()
    {
    	loginBTN.click();
    }
    public void verifyPage(String eTitle)
    {
    	verifyTitle(eTitle);
    }
    public void verifyVersion()
    {
    	verifyElement(version);
    }
}
