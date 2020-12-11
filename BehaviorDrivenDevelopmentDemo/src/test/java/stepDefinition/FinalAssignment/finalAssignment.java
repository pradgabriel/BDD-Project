package stepDefinition.FinalAssignment;

import DevLabsPages.DevLabsPageObjects;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.Operations;

public class finalAssignment extends Operations {
	@Given("^User launches the ZoomcarURL \"([^\"]*)\"$")
	public void user_launches_the_ZoomcarURL(String zoomcarurl) {
		openURL(zoomcarurl);
	   
	}

	@When("^User clicks on Start Your Wonderful Journey$")
	public void user_clicks_on_Start_Your_Wonderful_Journey() {
		DevLabsPageObjects devLabsPageObjects = new DevLabsPageObjects();
		Clicks(devLabsPageObjects.startyourwonderfuljourney);
		
			
	}

	@And("^User clicks Porur as the pick up Point$")
	public void user_clicks_Porur_as_the_pick_up_Point() throws InterruptedException {
		DevLabsPageObjects devLabsPageObjects = new DevLabsPageObjects();
		Thread.sleep(5000);
		Clicks(devLabsPageObjects.Porur);
		
	}

	@And("^user clicks the next button$")
	public void user_clicks_the_next_button() {
		DevLabsPageObjects devLabsPageObjects = new DevLabsPageObjects();
		Clicks(devLabsPageObjects.nextButton);
	
	}

	@And("^use selects next date$")
	public void use_selects_next_date() {
		DevLabsPageObjects devLabsPageObjects = new DevLabsPageObjects();
		Clicks(devLabsPageObjects.nextdate);
	
	}

	@And("^user clicks on next button again$")
	public void user_clicks_on_next_button_again() {
		DevLabsPageObjects devLabsPageObjects = new DevLabsPageObjects();
		Clicks(devLabsPageObjects.nextButton);
	
	}

	@And("^user clicks on last date$")
	public void user_clicks_on_last_date()  {
		DevLabsPageObjects devLabsPageObjects = new DevLabsPageObjects();
		Clicks(devLabsPageObjects.lastdate);
		
	}

	@And("^user clicks on Done button$")
	public void user_clicks_on_Done_button() {
		DevLabsPageObjects devLabsPageObjects = new DevLabsPageObjects();
		Clicks(devLabsPageObjects.doneButton);
		
	
	}

	@Then("^user gets the price of the highest priced car$")
	public void user_gets_the_price_of_the_highest_priced_car() throws InterruptedException {
		Thread.sleep(5000);
		DevLabsPageObjects devLabsPageObjects = new DevLabsPageObjects();
		countandprice(devLabsPageObjects.price);
	
	 	}
}
