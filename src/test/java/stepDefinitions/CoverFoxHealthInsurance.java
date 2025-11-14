package stepDefinitions;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.coverFox.DriverConfig.DriverFactory;
import com.coverFox.Pages.CoverfoxAddressDetailsPage;
import com.coverFox.Pages.CoverfoxHealthPlanPage;
import com.coverFox.Pages.CoverfoxHomePage;
import com.coverFox.Pages.CoverfoxMemberDetailsPage;
import com.coverFox.Pages.CoverfoxResultPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CoverFoxHealthInsurance {
	
	CoverfoxHomePage coverfoxHomePage = new CoverfoxHomePage(DriverFactory.getDriver());
	CoverfoxHealthPlanPage coverHealthPlanPage = new CoverfoxHealthPlanPage(DriverFactory.getDriver());
	CoverfoxAddressDetailsPage coverfoxAddressDetailsPage = new CoverfoxAddressDetailsPage(DriverFactory.getDriver());
	CoverfoxMemberDetailsPage coverfoxMemberDetailsPage = new CoverfoxMemberDetailsPage(DriverFactory.getDriver());
	CoverfoxResultPage coverfoxResultPage = new CoverfoxResultPage(DriverFactory.getDriver());
	
	SoftAssert softAssert = new SoftAssert();
	
	@Given("I am on home page")
	public void i_am_on_home_page() {
	   System.out.println("I  am on home page");
	}
	
	@When("I click on get started button")
	public void i_click_on_get_started_button() throws InterruptedException {
		Thread.sleep(3000);
	    System.out.println("I click on get started button");
	    coverfoxHomePage.clickingGetStartedButton();
	}
	
	@When("I click on next button")
	public void i_click_on_next_button() throws InterruptedException {
		Thread.sleep(3000);
	    System.out.println("I click on next button");
	    coverHealthPlanPage.clickingNextButton();
	}
	
	@When("I provide age into the age dropdown as {string} and i click on next button")
	public void i_provide_age_into_the_age_dropdown_as_and_i_click_on_next_button(String age) throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("I provide age into the age dropdown as {string} and i click on next button");
		coverfoxMemberDetailsPage.selectingAgeFromDropdown(age);
		coverfoxMemberDetailsPage.ClickingNextButton();
	}
	
	@When("I enter pincode as {string}, mobileNumber as {string} and i click on continue button")
	public void i_enter_pincode_as_mobile_number_as_and_i_click_on_continue_button(String pincode, String mobNum) throws EncryptedDocumentException, IOException, InterruptedException {
		Thread.sleep(3000);
		System.out.println("I enter pincode as {string}, mobileNumber as {string} and i click on continue button");
	    coverfoxAddressDetailsPage.enteringPincode(pincode);
	    coverfoxAddressDetailsPage.enteringMobileNumber(mobNum);
	    coverfoxAddressDetailsPage.clickingContinueButton();
	   //Assert.fail();
	}
	
	//without parameter
	@Then("i got matching Health Insurance Plans")
	public void i_got_matching_health_insurance_plans() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("i got matching Health Insurance Plans");
		System.out.println(coverfoxResultPage.getMatchingResultNumber());
		
	}
	
	//with parameter
	@Then("Matching Health Insurance Plans should be displayed as {string}")
	public void matching_health_insurance_plans_should_be_displayed_as(String expectedResults) throws InterruptedException {
	    Thread.sleep(5000);
	    System.out.println("matching health insurance plans should be displayed as " + expectedResults);
	    String actualResult = coverfoxResultPage.getMatchingResultNumber(); //48
	    
	    //Even if the test case fails if - else will not show fail
	    /*if(expectedResults.equals(actualResult)) {
	    	System.out.println("Actual and expected results are matching, TC passed");
	    }		
	    else {
	    	System.out.println("Actual and expected results are not matching, TC failed");
	    }
	    */
	    
	    Assert.assertEquals(actualResult, expectedResults);
	    //Assert.assertNotEquals(actualResult, expectedResults);
	}
	
	
	@When("I click on continue button")
	public void i_click_on_continue_button() throws InterruptedException {
		Thread.sleep(2000);
		coverfoxAddressDetailsPage.clickingContinueButton();

	}

	@Then("Validate error message")
	public void validate_error_message() throws InterruptedException {
		Thread.sleep(2000);
		String actualPinErrMsg = coverfoxAddressDetailsPage.getPincodeErrorMsg();
		Reporter.log("Pincode error message is: " + actualPinErrMsg, true);
		String actualMobErrMsg = coverfoxAddressDetailsPage.getMobNumErrorMsg();
		Reporter.log("Mobile number error message is: " + actualMobErrMsg, true);
		String expErrMsgPin = "Please enter a valid pincode";
		String expErrMsgMob = "Please enter a valid mobile no.";
		softAssert.assertEquals(actualPinErrMsg, expErrMsgPin, "Pincode error messages are not matching");
		Reporter.log("pin error message validation is completed", true);
		softAssert.assertEquals(actualMobErrMsg, expErrMsgMob, "Mobile number error messages are not matching");
		Reporter.log("mobile number error message validation is completed", true);
		softAssert.assertAll();
		
	}


}
