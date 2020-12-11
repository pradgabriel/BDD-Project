package stepDefinition.Lab22;

import static org.testng.Assert.assertEquals;

import DevLabsPages.DevLabsPageObjects;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.AssertionsAndVerifications;
import helper.Operations;

public class Lab22TestSteps extends Operations {
	@When("^User enters the UserID \"([^\"]*)\"$")
	public void user_enters_the_UserID(String userID) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		DevLabsPageObjects devLabsPageObjects = new DevLabsPageObjects();
		EnterText(devLabsPageObjects.username, readConfigFile(userID));
	}

	@And("^User enters the Password \"([^\"]*)\"$")
	public void user_enters_the_Password(String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		DevLabsPageObjects devLabsPageObjects = new DevLabsPageObjects();
		EnterText(devLabsPageObjects.password, readConfigFile(password));
	    throw new PendingException();
	}

	@And("^user checks the remember me checkbox$")
	public void user_checks_the_remember_me_checkbox() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		DevLabsPageObjects devLabsPageObjects = new DevLabsPageObjects();
		Clicks(devLabsPageObjects.rememberme);
	    throw new PendingException();
	}

	@And("^user clicks the sign on button$")
	public void user_clicks_the_sign_on_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		DevLabsPageObjects devLabsPageObjects = new DevLabsPageObjects();
		Clicks(devLabsPageObjects.submit);
	    throw new PendingException();
	}

	@Then("^user log in successfully$")
	public void user_log_in_successfully() throws Throwable {
		assertEquals(title(), "Digital Bank");
		AssertionsAndVerifications.assertEqual(title(), "Digital Bank", "Verifying title page", null);
	    throw new PendingException();
	}

}
