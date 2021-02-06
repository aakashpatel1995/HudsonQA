package com.hudson.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hudson.base.TestBase;

public class OrderHistory extends TestBase{
	
	@FindBy(css ="order-history-headings-sub")
	WebElement OrderHistorylabel;
	
	
	@FindBy(css = "start-shopping-section d-flex flex-column align-items-center")
	WebElement OrderHistorystatus;
	
	
	
	
	public OrderHistory() {
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	public String verifypagetitle() {
		 return driver.getTitle();
	}
	public String VerifyPage() {
		return OrderHistorylabel.getText();
	}
	
	
	public String verifyorder(){
		return OrderHistorystatus.getText();
	}
	

}
