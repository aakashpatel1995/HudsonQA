package com.hudson.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;


	public TestBase() {


		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\Vipul\\eclipse-workspace\\Hudsonbay\\src\\main\\java\\com\\hudson\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void intialization() {
		String browserName = prop.getProperty("browser");

		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vipul\\Desktop\\EclipseTest\\chromedriver_win32\\c.exe");
			driver = new ChromeDriver();	

		}
		else if
		(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vipul\\Desktop\\EclipseTest\\geckodriver-v0.29.0-win64\\gk.exe");
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("please enter valid  brwoser in config properties");
		}
		
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}





}


