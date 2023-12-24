package com.wipro.utilities;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreen {
	
	public void screenshot(WebDriver d,String r) throws Exception {
		 double num=Math.random()+1;
	      String  s=Double.toString(num);
		 File screenshot= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(screenshot, new File("D:\\SeleniumProjects\\SelenimCapstonProject\\src\\main\\resources\\ScreenShot\\"+r+s+".png"));
	} 

}
