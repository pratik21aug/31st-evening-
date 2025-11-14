package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.testng.Reporter;

import io.cucumber.java.en.*;

public class GmailLogin {
	
	@Given("I am on login page")
	public void i_am_on_login_page() {
		Reporter.log("I am on login page", true);
	}

	@When("I provide details and click on login button")
	public void i_provide_details_and_click_on_login_button(io.cucumber.datatable.DataTable dataTable) {
	   List<List<String>> testListData = dataTable.asLists();
	   List<String> user1 = testListData.get(1); // testuser123
	   String userName1 = user1.get(0); //getting user1 userName
	   String password1 = user1.get(1); //getting user1 password
	   String msg1 = user1.get(2); //getting user1 msg
	   Reporter.log(userName1, true);
	   Reporter.log(password1, true);
	   Reporter.log(msg1, true);
	   
	   System.out.println("*************************");
	   List<Map<String, String>> testMapData = dataTable.asMaps();
	   System.out.println(testMapData.get(0).get("userName"));
	   
	}

	@Then("I should navigate to inbox")
	public void i_should_navigate_to_inbox() {
		Reporter.log("I should navigate to inbox", true);
	}
	

}
