package hooks;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;

import com.coverFox.DriverConfig.DriverFactory;
import com.coverFox.Utils.Utility;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hooks {
	
	@Before
	public void launchBrowser() throws IOException {
		DriverFactory.initBrowser(Utility.readDataFromPropertiesFile("browser"));
	}
	
	@After (order = 1)
	public void tearDown() {
		DriverFactory.getDriver().quit();// driver.quit()
		Reporter.log("closing browser", true);
	}
	
	@After (order = 2)
	public void takeScreenshot(Scenario scenario) {
		boolean result = scenario.isFailed();
		if(result) {
			byte[] ss = ((TakesScreenshot)DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(ss, "image/png", scenario.getName());
			Reporter.log("taking screenshot", true);
		}
	}
	
	
	//if we have Hooks with duplicate order then they are execute in a order in which they are defined
	//if we have not specified any order then they can execute in any order
	/*
	 * @Before(order = 2) public void clearCache1() {
	 * System.out.println("clearCache1 from browser"); }
	 * 
	 * @Before(order = 2) public void clearCache2() {
	 * System.out.println("clearCache2 from browser"); }
	 * 
	 * @After(order = 1) public void clearHistory1() {
	 * System.out.println("clearHistory1 from browser"); }
	 * 
	 * @After(order = 2) public void clearHistory2() {
	 * System.out.println("clearHistory2 from browser"); }
	 * 
	 * @BeforeStep public void beforeStep() {
	 * System.out.println("before step running"); }
	 * 
	 * @AfterStep public void afterStep() {
	 * System.out.println("after step running"); }
	 */

}