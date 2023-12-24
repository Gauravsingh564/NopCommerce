package com.wipro.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPageData {
	@FindBy(xpath="//*[@id=\"Email\"]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"Password\"]")
	WebElement password;
	
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")
	WebElement logButton;
	@FindBy(xpath="/html/body/div[6]/div[2]/ul[1]/li[1]/a")
	WebElement computers;
	
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[1]/ul/li[1]/a")
	WebElement desktops;
	
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[1]/a/img")
	WebElement vcom3;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-button-2\"]")
	WebElement addtoCart;
	
	@FindBy(xpath="//*[@id=\"topcartlink\"]/a/span[1]")
	WebElement shoopingCart;
	
	@FindBy(xpath="//*[@id=\"termsofservice\"]")
	WebElement checkBox;
	
	@FindBy(id="checkout")
	WebElement checkOut;
	
	@FindBy(xpath="//*[@id=\"billing-buttons-container\"]/button[4]")
	WebElement continue1;
	
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[3]/div[2]/form/div[2]/button")
	WebElement continue2;
	
	@FindBy(xpath="//*[@id=\"payment-method-buttons-container\"]/button")
	WebElement continue3;
	
	@FindBy(xpath="//*[@id=\"payment-info-buttons-container\"]/button")
	WebElement continue4;
	
	@FindBy(xpath="//*[@id=\"confirm-order-buttons-container\"]/button")
	WebElement confirm;
	
	@FindBy(xpath="/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	WebElement logOut;
	
	public ProductPageData(WebDriver d) {
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
	public void comClick() {
		computers.click();
	}
	public void deskClick() {
		desktops.click();
	}
	public void vcom3Click() {
		vcom3.click();
	}
	public void addtoCartClick() {
		addtoCart.click();
	}
	public void shooopingClick() {
		shoopingCart.click();
	}
	
	public void chechBoxClick() {
		checkBox.click();
	}
	public void chechoutClick() {
		checkOut.click();
	}
	public void continue1Click() {
		continue1.click();
	}
	public void continue2Click() {
		continue2.click();
	}
	public void continue3Click() {
		continue3.click();
	}
	public void continue4Click() {
		continue4.click();
	}
	public void confirmClick() {
		confirm.click();
	}
	public void logOut() {
		logOut.click();
	}

}
