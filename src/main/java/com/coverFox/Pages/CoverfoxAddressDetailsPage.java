package com.coverFox.Pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class CoverfoxAddressDetailsPage {

		//variables
		@FindBy(xpath = "(//input[@type = 'number'])[1]") private WebElement pincodeField;
		@FindBy(xpath = "(//input[@type = 'number'])[2]") private WebElement mobileNumberField;
		@FindBy(className = "next-btn") private WebElement continueButton;
		@FindBy (xpath = "//div[contains(text(), 'valid pincode ')]") private WebElement pincodeErrorMsg;
		@FindBy (xpath = "//div[contains(text(), 'valid mobile no. ')]") private WebElement mobNumErrorMsg;
		
		//constructor
		public CoverfoxAddressDetailsPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		//methods
		public void enteringPincode(String pincode) throws EncryptedDocumentException, IOException {
			System.out.println("Entering Pincode into pincode field present in Address Details Page");
			pincodeField.sendKeys(pincode);
		}
		
		public void enteringMobileNumber(String mobileNumber) throws EncryptedDocumentException, IOException {
			System.out.println("Entering Mobile Number into mobile number field present in Address Details Page");
			mobileNumberField.sendKeys(mobileNumber);
		}
		
		public void clickingContinueButton() {
			System.out.println("clicking on Continue Button present in Address Details Page");
			continueButton.click();
		}
		
		public String getPincodeErrorMsg() {
			return pincodeErrorMsg.getText();
		}
		
		public String getMobNumErrorMsg() {
			return mobNumErrorMsg.getText();
		}
		
	
}
