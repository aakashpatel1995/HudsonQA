package com.hudson.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hudson.base.TestBase;

public class HomePage extends TestBase{
	@FindBy(linkText ="Order History")
	WebElement OrderHistorylabel;
	
	@FindBy(linkText ="Payments")
	WebElement Paymentlabel;
	
	@FindBy(linkText = "Profile")
	WebElement ProfilePagelabel;
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String VerifyPageTitle() {
		return driver.getTitle();	
	}
	
	public OrderHistory VerifyOrderHistoryclick() {
		OrderHistorylabel.click();
		return new OrderHistory();
	}
	
	public Payments verifyPaymentclick() {
		Paymentlabel.click();
		return new Payments();
	}
	
	public ProfilePage verifyProfileclick() {
		ProfilePagelabel.click();
		return new ProfilePage();
	}

}
