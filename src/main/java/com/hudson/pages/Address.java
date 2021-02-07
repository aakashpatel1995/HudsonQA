package com.hudson.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hudson.base.TestBase;

public class Address extends TestBase {

	
	@FindBy(css ="//h1[contains(.,'Address Book')]")
WebElement AddressLabel;
	
	
	@FindBy(css ="h2:nth-child(1)")
	WebElement AddressCheck;
	
public Address() {
	PageFactory.initElements(driver, this);
}


public String verifytitle() {
	
	return driver.getTitle();
}
	

public  String verifyAddresslabel() {
	return AddressLabel.getText();
}
	

public String verifyAddresscheck() {
	return AddressCheck.getText();
}
}
