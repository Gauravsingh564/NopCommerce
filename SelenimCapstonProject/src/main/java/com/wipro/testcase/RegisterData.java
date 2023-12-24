package com.wipro.testcase;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.wipro.testbase.RegisterPageData;
import com.wipro.testbase.TestBaseClass;
import com.wipro.utilities.GetRegFileData;
import com.wipro.utilities.TakeScreen;
import com.wipro.utilities.WriteTxt;

public class RegisterData extends TestBaseClass{
	@DataProvider(name="registration")
	String [][] regdata() throws Exception{
		GetRegFileData data=new GetRegFileData();
		String path="D:\\SeleniumProjects\\SelenimCapstonProject\\src\\main\\resources\\testdata\\Register.xlsx";
		String a[][]=data.getReg(path, "Sheet1");
		return a;
	}
	
	@Test(dataProvider="registration", dataProviderClass=RegisterData.class)
	
	public void registrationData(String fname,String lname,String email,String password, String conPassword) throws Exception {
		RegisterPageData regPage=new RegisterPageData(d);
        d.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
        regPage.genClick();
        regPage.fname(fname);
        regPage.lname(lname);
        regPage.email(email);
        regPage.password(password);
        regPage.conpassword(conPassword); 
        regPage.regClick();
        
      
       
        TakeScreen scr= new TakeScreen(); 
        scr.screenshot(d,"reg");
       
        
        String txt=d.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]")).getText();
        WriteTxt t= new WriteTxt();
        t.text(txt);
       
		
	}

}
