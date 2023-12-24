package com.wipro.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPageData {
	@FindBy(xpath="//*[@id=\"gender-male\"]")
	WebElement gender;
	@FindBy(xpath="//*[@id=\"FirstName\"]")
	WebElement fname;
	
	@FindBy(xpath="//*[@id=\"LastName\"]")
	WebElement lname;
	
	@FindBy(xpath="//*[@id=\"Email\"]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"Password\"]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"ConfirmPassword\"]")
	WebElement conpassword;
	
	@FindBy(xpath="//*[@id=\"register-button\"]")
	WebElement regButton;
	
	public RegisterPageData(WebDriver d) { 
		PageFactory.initElements(d, this);
	}
	public void genClick() {
		gender.click();
	}
	public void fname(String name) {
		fname.sendKeys(name);
	}
	public void lname(String name) {
		lname.sendKeys(name);
	}
	public void email(String email1) {
		email.sendKeys(email1);
	}
	public void password(String password1) {
		password.sendKeys(password1);
	}
	public void conpassword(String conpass) {
	   conpassword.sendKeys(conpass);
	}
    
	public void regClick() {
		regButton.click();
	}

}
