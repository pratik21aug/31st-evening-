package assertionStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
  @Test
  public void resultValidation1() {
	  Reporter.log("running result validation 1", true);
  }
  
  @Test
  public void resultValidation2() {
	  Reporter.log("running result validation 2", true);
  }
  
  @BeforeMethod
  public void provideAddressDetails() {
	  Reporter.log("providing pincode and mobile number - (@BeforeMethod)", true);
  }
  
  @AfterMethod
  public void clearHistory() {
	  Reporter.log("clearing browser history - (@AfterMethod)", true);
  }
  
  @BeforeClass
  public void provideMemberDetails() {
	  Reporter.log("providing member details - @BeforeClass", true);
  }
  
  @BeforeTest
  public void beforeTest() {
	  Reporter.log("Before test running", true);
  }
  
  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("before suite running", true);
  }
  
  @AfterClass
  public void afterClass() {
	  Reporter.log("after class running", true);
  }
  
  @AfterTest
  public void afterTest() {
	  Reporter.log("after test running", true);
  }
  
  @AfterSuite
  public void afterSuite() {        //this will not run because there is only one suite
	  Reporter.log("after suite running", true);
  }
  
  
  
  
}
