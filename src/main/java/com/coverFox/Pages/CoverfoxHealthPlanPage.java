package com.coverFox.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverfoxHealthPlanPage {
	
	//variable
	@FindBy(className = "next-btn") private WebElement nextButton;
	
	//constructor
	public CoverfoxHealthPlanPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//method
	public void clickingNextButton() {
		System.out.println("Clicking on Next button present in Health Plan Page");
		nextButton.click();
	}
	
	
}
