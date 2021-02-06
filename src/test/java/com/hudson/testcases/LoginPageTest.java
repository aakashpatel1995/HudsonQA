package com.hudson.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hudson.base.TestBase;
import com.hudson.pages.HomePage;
import com.hudson.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void Startup() {
		intialization();
		loginPage = new LoginPage();
		
		
		
	}
	@Test
	public void verifyTitleTest() {
		
		String title = loginPage.Verifytitle();
		Assert.assertEquals(title, "Login - thebay.com");
		
		
	}
	@Test
	public void verifyLoginTest() {
		loginPage = new LoginPage();
		homePage = new HomePage();
		homePage = loginPage.Signin(prop.getProperty("username"), prop.getProperty("password"));
	}
@AfterMethod
public void Teardown() {
	driver.quit();
}
}
