package com.wipro.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestBaseClass {
	public static WebDriver d;
	@BeforeMethod 
	//@BeforeSuite
	public void start() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\gaura\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demo.nopcommerce.com/");
	}
	@AfterMethod 
	//@AfterSuite
	public void end() throws Exception {
		Thread.sleep(5000);
		d.quit();
	} 

}
