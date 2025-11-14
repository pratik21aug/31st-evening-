package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CoverFoxHealthCarBikeInsurance {

	@When("I click on car insurance button")
	public void i_click_on_car_insurance_button() {
	    System.out.println("I click on car insurance button");
	}

	@When("I provide RTO number and click on view quotes button")
	public void i_provide_rto_number_and_click_on_view_quotes_button() {
	    System.out.println("I provide RTO number and click on view quotes button");
	}

	@When("I provide details, valid mobile number and click on view quotes button")
	public void i_provide_details_valid_mobile_number_and_click_on_view_quotes_button() {
	    System.out.println("I provide details, valid mobile number and click on view quotes button");
	}

	@Then("I got car insurance details")
	public void i_got_car_insurance_details() {
	    System.out.println("I got car insurance details");
	}

	@When("I click on bike insurance button")
	public void i_click_on_bike_insurance_button() {
		System.out.println("I click on bike insurance button");
	}

	@Then("I got bike insurance details")
	public void i_got_bike_insurance_details() {
	    System.out.println("I got bike insurance details");
	}
	
}
