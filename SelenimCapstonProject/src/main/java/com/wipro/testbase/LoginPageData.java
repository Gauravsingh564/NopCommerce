
package com.wipro.testbase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class LoginPageData {
	@FindBy(xpath="//*[@id=\"Email\"]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"Password\"]")
	WebElement password;
	
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")
	WebElement logButton;
	@FindBy(xpath="//*[@id=\"Address_FirstName\"]")
	WebElement fname;
	
	@FindBy(xpath="//*[@id=\"Address_LastName\"]")
	WebElement lname;
	
	@FindBy(xpath="//*[@id=\"Address_Email\"]")
	WebElement email1;
	
	@FindBy(id="Address_CountryId")
	WebElement country;
	
	@FindBy(xpath="//*[@id=\"Address_City\"]")
	WebElement city;
	
	@FindBy(xpath="//*[@id=\"Address_Address1\"]")
	WebElement address;
	
	@FindBy(xpath="//*[@id=\"Address_ZipPostalCode\"]")
	WebElement zipCode;
	
	@FindBy(xpath="//*[@id=\"Address_PhoneNumber\"]")
	WebElement phone;
	
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div[2]/form/div/div[2]/div[2]/button")
	WebElement button;
	
	public LoginPageData(WebDriver d) {
		PageFactory.initElements(d, this);
	}
	 
	public void email(String mail) {
		email.sendKeys(mail);
	}
	public void password(String pass) {
		password.sendKeys(pass);
	}
    
	public void logClick() {
		logButton.click(); 
	}
	public void fname(String name) {
		fname.sendKeys(name);
	}
	public void lname(String lname1) {
		lname.sendKeys(lname1);
	}
	public void email1(String mail) {
		email1.sendKeys(mail);
	}
	public void country(String con) {
		Select s=new Select(country);
		s.selectByVisibleText(con);
	}
	public void city(String cit) {
		city.sendKeys(cit);
	}
	public void address(String addr) {
		address.sendKeys(addr);
	}
	public void zipCode(String zipcode) {
		zipCode.sendKeys(zipcode);
	}
	public void phone(String phon) {
		phone.sendKeys(phon);
	}
	public void addClick() {
		button.click(); 
	}

}
