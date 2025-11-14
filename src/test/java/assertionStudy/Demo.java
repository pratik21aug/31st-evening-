package assertionStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void f() {
	  String actual = "test";
	  String expected = "test1";
	  
	  /*
	  if(actual.equals(expected)) {
		  System.out.println("TC Passed");
		  
	  }
	  else {
		  System.out.println("TC Failed");
	  }
	  */
	  
	  //In office, we write like this Assert.assertEquals(actual.toLowerCase(), expected.toLowerCase());
	  
	  Assert.assertEquals(actual, expected, "TC FAILED");      //"TC FAILED" is assertion error msg, we only get it if the test case is failed
	  //if TC fails then program execution stops on above line (23)
	  Reporter.log("TC PASSED", true); //if TC is not failed then this line will execute
	  
  }
}
