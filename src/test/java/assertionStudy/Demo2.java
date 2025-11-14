package assertionStudy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.coverFox.Utils.Utility;

public class Demo2 {
	
	SoftAssert softAssert = new SoftAssert();
	
  @Test
  public void f() throws IOException {
	  		
	  String str1 = "test";
	  String str2 = "test";
	  int a = 5;
	  int b = 10;
	  //Assert.assertEquals(a, b, "test case failed");
	  
	  //String url =Utility.readDataFromPropertiesFile("url");	  
	  //Assert.assertEquals(str1, str2, "test case failed");
	  //Assert.assertNotEquals(str1 , str2, "test case failed");
	  //Assert.assertTrue(b, "test case failed");
	  //Assert.assertFalse(b);
	  //Assert.assertNull(str2, "string is not null");
	  //Assert.assertNotNull(url);
	    
	  //softAssert.assertEquals(str1, str2, "assertEquals");
	  //softAssert.assertNotNull(str1, "assertNotNull");
	  //softAssert.assertAll();
  }
  
  //assertEquals
  //asertNotEquals
  //assertTrue
  //assertFalse
  //assertNull
  //assertNotNull
  //assert.fail()
  
  
}
