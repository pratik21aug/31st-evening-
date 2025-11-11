package assertionStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keywords {
  //@Test (invocationCount = 3) //1)to call method multiple times 2)count can be zero or -ve 
  /*public void f() {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.coverfox.com/");   
  }
  */
	
	/*
	@Test (priority = 2)
	public void a() {
		Reporter.log("a test", true);
	}
	
	@Test (priority = -5)
	public void b() {
		Reporter.log("b test", true);
	}
	
	@Test   //default priority for every test case is zero     
	public void c() {        
		Reporter.log("c test", true);
	}
	
	@Test (priority = -5)  //if priority is same then execution goes in alphabetical order
	public void d() {
		Reporter.log("d test", true);
	}
	*/
	
	/*
	@Test (timeOut = 2000)
	public void login() throws InterruptedException {
		Thread.sleep(1000);
		Reporter.log("login test", true);
	}
	*/
	
	@Test (enabled = false)  //if we don't want to execute method for a run
	public void logout() throws InterruptedException {
		Thread.sleep(1000);
		Reporter.log("logout test", true);
	}
	
	@Test
	public void login(){
		Assert.fail();
		Reporter.log("login test", true);
	}
	
	@Test (dependsOnMethods = {"login"})  //if login() fails then cashPayment() will skip
	public void cashPayment(){
	
		Reporter.log("payment test", true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
}
