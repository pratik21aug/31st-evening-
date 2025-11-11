package com.coverFox.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverfoxHomePage {
	
			//variable 
			@FindBy(xpath = "//button[@title = 'Get Started']") private WebElement getStartedButton;
			
			
			//constructor
			public CoverfoxHomePage (WebDriver driver) {
				PageFactory.initElements(driver, this);
			}
			
			//method
			public void clickingGetStartedButton() {
				System.out.println("Clicking on Get Started button Present in Home Page");
				getStartedButton.click();
			}

}
