package com.hudson.testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hudson.base.TestBase;
import com.hudson.pages.GuestUser;

public class GuestUserTest extends GuestUser{
	
GuestUser guest;
@BeforeMethod
public void startup() {
guest  = new GuestUser();
guest.startup();
}



@Test(priority =1)
public void verifyTitle(){
	String g = guest.verifytitle();
	System.out.println(g);
}

@Test(priority =2 )
public void searchresult(){
	
	guest.searchresult();
	
}
	
	 

	
	
	
	

}
