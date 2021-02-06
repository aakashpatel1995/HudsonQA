package com.hudson.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hudson.base.TestBase;
import com.hudson.pages.Address;
import com.hudson.pages.HomePage;
import com.hudson.pages.LoginPage;

public class AddressTest extends TestBase {
LoginPage loginPage;
HomePage homePage;
Address address;



	public AddressTest() {
		super();
	}


	@BeforeMethod
	public void startup() {
		intialization();

		loginPage = new LoginPage();
		homePage = new HomePage();
		address = new Address();
		homePage = loginPage.Signin(prop.getProperty("username"), prop.getProperty("password"));

	}


	@AfterMethod
public void teardown() {
		driver.quit();
	}
	
	
	@Test(priority =1)
	public void verifytitletest() {
		
		
		String ad  = address.verifytitle();
		Assert.assertEquals(ad, "Addresses - thebay.com");
		
	}
	@Test(priority =2 )
	public void verifyAddresschecktest() {
		String check = address.verifyAddresscheck();
		Assert.assertEquals(check, "Save your address here. It'll help you checkout faster!");
	}
	@Test(priority =3 )
	public void verifylabelcheckTest() {
		String labelchk = address.verifyAddresslabel();
		Assert.assertEquals(labelchk, "Address Book");
	}

}
