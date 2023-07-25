package com.actitime_project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="username")
	private WebElement untbx;    //declaration
	
	@FindBy(name="pwd")
	private WebElement pwtbx;
	
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement lgBtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);   //initialization
	}
	public void setLogin(String un,String pw ) {
		untbx.sendKeys(un);
		pwtbx.sendKeys(pw);
		lgBtn.click();         //utilization
	}
	

}
