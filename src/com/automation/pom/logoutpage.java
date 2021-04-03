package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logoutpage {

	public WebDriver driver;
	
	@FindBy(xpath = "//a[@class='logout']")
	private WebElement logout;

	public logoutpage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
	}

	public WebElement getLogout() {
		return logout;
	}
	
}
