package com.hudson.pages;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GuestUser {
	
	public static WebDriver driver;
	
	public void startup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vipul\\Desktop\\EclipseTest\\geckodriver-v0.29.0-win64\\gk.exe");
		driver = new FirefoxDriver();
	
	
	
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
	driver.get("https://www.thebay.com");
	
	
	
	}
	
	@FindBy(name ="q")
	WebElement searchfilled;
	
	

	@FindBy(css = ".search-results-header")
	WebElement Magnifyinlens;
	
	@FindBy(id="consent-close")
	WebElement close;
	public GuestUser () {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public String verifytitle() {
		return driver.getTitle();
	}
	
	
	public void searchresult() {
		close.click();
		
		searchfilled.sendKeys("jeans");
		Magnifyinlens.click();
		
	}
	
}
