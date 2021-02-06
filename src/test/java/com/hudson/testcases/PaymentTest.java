package com.hudson.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hudson.base.TestBase;
import com.hudson.pages.HomePage;
import com.hudson.pages.LoginPage;
import com.hudson.pages.Payments;

public class PaymentTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	Payments payment;
	
	
	
	
	public PaymentTest(){
		super();
	}
	
	
	@BeforeMethod
	public void Startup() {
		intialization();
		homePage = new HomePage();
		loginPage = new LoginPage();
		payment = new Payments();
		
		homePage = loginPage.Signin(prop.getProperty("username"), prop.getProperty("password"));
		
		
	}
	
	@Test(priority =1 )
	public void verifytitletest() {
		String p  = payment.verifyPagetitle();
		Assert.assertEquals(p, "Payments -thebay.com");
		
	}
	
	@Test(priority =2)
	public void VerifyPaymentPage() {
		String vp = payment.verifyPayment(); 
		Assert.assertEquals(vp, "Payment Methods");
		
		
	}
	@Test(priority =3 )
	public void verifyAddPaymenttest() {
		String v = payment.verify();
		Assert.assertEquals(v, "Save your payment method here.It’ll help you check out faster!");
	
	
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
