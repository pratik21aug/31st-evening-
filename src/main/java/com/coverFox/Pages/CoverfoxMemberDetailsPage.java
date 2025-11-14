package com.coverFox.Pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.coverFox.Utils.Utility;


public class CoverfoxMemberDetailsPage {
	
	//variables
	@FindBy(id = "Age-You") private WebElement ageDropdown;
	@FindBy(className = "next-btn") private WebElement nextButton;
	
	//constructor
	public CoverfoxMemberDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//methods
	public void selectingAgeFromDropdown(String age){
			Utility.handleDropDownUsingVisibleText(ageDropdown, age);
	}
	
	public void ClickingNextButton() {
		System.out.println("Clicking on Next button present in Member Details Page");
		nextButton.click();
	}
	

}
