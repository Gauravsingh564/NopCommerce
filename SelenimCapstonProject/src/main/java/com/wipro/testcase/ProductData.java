package com.wipro.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.wipro.testbase.ProductPageData;
import com.wipro.testbase.TestBaseClass;
import com.wipro.utilities.GetLoginFileData;
import com.wipro.utilities.TakeScreen;
import com.wipro.utilities.WriteTxt;

public class ProductData extends TestBaseClass{
    @DataProvider(name="Product")
	String[][] productdata() throws Exception{
		GetLoginFileData logdata= new GetLoginFileData();
		String path="D:\\SeleniumProjects\\SelenimCapstonProject\\src\\main\\resources\\testdata\\Log.xlsx";
		String[][] b=logdata.getLog(path, "Sheet1");
		return b;
	}
    @SuppressWarnings("deprecation")
	@Test(dataProvider="Product",dataProviderClass=ProductData.class)
    public void productDataHandler(String email,String pass) throws Exception{
    	ProductPageData data=new ProductPageData(d);
    	d.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		data.email(email);
		data.password(pass);
		data.logClick(); 
		
		Thread.sleep(2000);
		TakeScreen srcshot=new TakeScreen();
		srcshot.screenshot(d,"Productpagelogin");
    	data.comClick();
    	data.deskClick();
    	Thread.sleep(2000);
    	data.vcom3Click();
    	String productName=d.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[1]/h1")).getText();
    	String productPrize=d.findElement(By.xpath("//*[@id=\"price-value-2\"]")).getText();
    	WriteTxt t= new WriteTxt();
    	t.prizeTxt(productName, productPrize);
    	data.addtoCartClick();
    	data.shooopingClick();
    	data.chechBoxClick();
        data.chechoutClick();
        d.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
    	data.continue1Click();
    	data.continue2Click();
    	data.continue3Click();
    	data.continue4Click();
    	data.confirmClick();
    	Thread.sleep(2000);
    	TakeScreen src=new TakeScreen();
    	src.screenshot(d, "product");
    	
    	
    }
    
	
}
