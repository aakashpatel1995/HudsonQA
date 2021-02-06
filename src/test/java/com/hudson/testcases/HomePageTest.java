package com.hudson.testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hudson.base.TestBase;
import com.hudson.pages.HomePage;
import com.hudson.pages.LoginPage;
import com.hudson.pages.OrderHistory;
import com.hudson.pages.Payments;
import com.hudson.pages.ProfilePage;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	OrderHistory orderHistory;
	Payments payment;
	ProfilePage profile;



	public HomePageTest() {
		super();
	}



	@BeforeMethod
	public void Startup() {
		intialization();

		loginPage = new LoginPage();
		homePage = new HomePage();
		orderHistory = new OrderHistory();
		payment = new Payments();
		homePage = loginPage.Signin(prop.getProperty("username"), prop.getProperty("password"));

	}
@Test(priority =1 )
public void verifyTitleTest() {
	
	
	
	String hometitle = homePage.VerifyPageTitle();
	Assert.assertEquals(hometitle, "Profile - thebay.com");
}

@Test(priority =2 )
public void verifyOrderHistoryClick() {
	orderHistory = homePage.VerifyOrderHistoryclick();
}

@Test(priority =3 )
public void verifypaymentClick() {
	
	payment = homePage.verifyPaymentclick();
}

@Test(priority=4)
public void verifyprofileclicktest() {
	profile = homePage.verifyProfileclick();
}

@AfterMethod
public void TearDown() {
	driver.quit();
}

}


