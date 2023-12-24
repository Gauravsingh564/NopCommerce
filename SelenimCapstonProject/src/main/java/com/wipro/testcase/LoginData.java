package com.wipro.testcase;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.wipro.testbase.*;
import com.wipro.testbase.TestBaseClass;
import com.wipro.utilities.*;
public class LoginData extends TestBaseClass{
	@DataProvider(name="login")
	String[][] logindata() throws Exception{
		GetLoginFileData logdata= new GetLoginFileData();
		String path="D:\\SeleniumProjects\\SelenimCapstonProject\\src\\main\\resources\\testdata\\Login1.xlsx";
		String[][] b=logdata.getLog(path, "Sheet1");
		return b;
	}
	@Test(dataProvider="login",dataProviderClass=LoginData.class)
	public void login(String email , String password,String fname,String lname,String country,String city,String address,String zip,String phone) throws Exception{
		LoginPageData data= new LoginPageData(d);
		d.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		data.email(email);
		data.password(password);
		data.logClick(); 
		
		Thread.sleep(2000);
		TakeScreen srcshot=new TakeScreen();
		srcshot.screenshot(d,"login");
		Thread.sleep(3000);
		d.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
		d.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[1]/div/div[2]/ul/li[2]/a")).click();
		d.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[2]/button")).click();
		data.fname(fname);
		data.lname(lname);
		data.email1(email);
		data.country(country);
		data.city(city);
		data.address(address);
		data.zipCode(zip);
		data.phone(phone);
		data.addClick();
		Thread.sleep(2000);
		
		srcshot.screenshot(d,"address");
		d.findElement(By.xpath("//*[@id=\"bar-notification\"]/div/span")).click();
		d.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		Thread.sleep(1000);
		srcshot.screenshot(d,"logout");
		
		
	}

}
