package com.hudson.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hudson.base.TestBase;

public class LoginPage extends TestBase {
	
	
	@FindBy(id = "login-form-email")
	WebElement emailform;
	
	@FindBy(id ="login-form-password")
	WebElement passwordform;
	
	
	@FindBy(css =".account-btn")
	WebElement signinbtn;
	
	@FindBy(id="consent-close")
	WebElement close;
	
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	public String Verifytitle() {
		return driver.getTitle();
	}
	
	public HomePage Signin(String us ,String pw) {
		close.click();
		emailform.sendKeys(us);
		passwordform.sendKeys(pw);
		signinbtn.click();
		
		return new HomePage();
	}
	
	
	

}
