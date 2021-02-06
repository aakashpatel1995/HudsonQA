package com.hudson.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hudson.base.TestBase;

public class Payments extends TestBase{



	@FindBy(xpath="//h1[contains(.,'Payment Methods')]")
	WebElement Paymentlabel;


	@FindBy(xpath="//h3[contains(.,'Save your payment method here.It’ll help you check out faster!')]")
	WebElement AddCardlabel;


	public Payments() {
		PageFactory.initElements(driver, this);
	}


	public String verifyPagetitle() {
		return driver.getTitle();

	}
	
	public String verifyPayment() {
		return Paymentlabel.getText();
	}
	
	public String verify() {
		
		return AddCardlabel.getText();	
	}
	
	

}
