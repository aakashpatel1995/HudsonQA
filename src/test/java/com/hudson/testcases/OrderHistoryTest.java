package com.hudson.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hudson.base.TestBase;
import com.hudson.pages.HomePage;
import com.hudson.pages.LoginPage;
import com.hudson.pages.OrderHistory;

public class OrderHistoryTest extends TestBase {
	HomePage homePage;
	LoginPage loginPage;
	OrderHistory orderHistory;
	
	
	
	public OrderHistoryTest() {
		super();
	}
	
		
	@BeforeMethod
	public void Startup() {
		intialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		homePage = loginPage.Signin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	
	@Test(priority =1 )
	public void VerifyOrderHistoryTitleTest() {
		String title = orderHistory.verifypagetitle();
		Assert.assertEquals(title, "Orders - thebay.com");
	}

	@Test(priority =2 )
	public void verifypagetest() {
		String t = orderHistory.VerifyPage();
		Assert.assertEquals(t, "Order History");
	}
	
	@Test(priority =3 )
	
	public void verifyorderstatusTest() {
		String o = orderHistory.verifyorder();
		Assert.assertEquals(o, "You have no recent orders, please try selecting a different date range.");
	}
	
	
	@AfterMethod
	public void TearDown(){
		driver.quit();
	}

}
