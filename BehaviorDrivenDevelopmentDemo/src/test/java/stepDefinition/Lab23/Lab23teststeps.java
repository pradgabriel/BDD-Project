package stepDefinition.Lab23;

import DevLabsPages.DevLabsPageObjects;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.Operations;

public class Lab23teststeps extends Operations {
	@Given("^User launches the new URL \"([^\"]*)\"$")
	public void user_launches_the_new_URL(String lab23url) throws Throwable {
		openURL(lab23url);
	}

	@When("^Enter user clicks on Signup Here$")
	public void enter_user_clicks_on_Signup_Here() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		DevLabsPageObjects devLabsPageObjects = new DevLabsPageObjects();
		Clicks(devLabsPageObjects.signuphere);
	    throw new PendingException();
	}

	@When("^Enters the First Name on singup \"([^\"]*)\"$")
	public void enters_the_First_Name_on_singup(String FirstName) throws Throwable {
		DevLabsPageObjects devLabsPageObjects = new DevLabsPageObjects();
		EnterText(devLabsPageObjects.firstname, readConfigFile(FirstName));
	    throw new PendingException();
	}

	@When("^Enters the Last name on Siginup \"([^\"]*)\"$")
	public void enters_the_Last_name_on_Siginup(String LastName) throws Throwable {
		DevLabsPageObjects devLabsPageObjects = new DevLabsPageObjects();
		EnterText(devLabsPageObjects.lastname, readConfigFile(LastName));
	    throw new PendingException();
	}

	@When("^Enters the gender$")
	public void enters_the_gender() throws Throwable {
		DevLabsPageObjects devLabsPageObjects = new DevLabsPageObjects();
		Clicks(devLabsPageObjects.Gender);
	    throw new PendingException();
	}

	@When("^Enters DOB on Signup \"([^\"]*)\"$")
	public void enters_DOB_on_Signup(String dob) throws Throwable {
		DevLabsPageObjects devLabsPageObjects = new DevLabsPageObjects();
		EnterText(devLabsPageObjects.dob, readConfigFile(dob));
	    throw new PendingException();
	}

	@When("^Enters SSN Sign up \"([^\"]*)\"$")
	public void enters_SSN_Sign_up(String ssn) throws Throwable {
		DevLabsPageObjects devLabsPageObjects = new DevLabsPageObjects();
		EnterText(devLabsPageObjects.ssn, readConfigFile(ssn));
	    throw new PendingException();
	}

	@When("^Enters Email Address on Signup \"([^\"]*)\"$")
	public void enters_Email_Address_on_Signup(String email) throws Throwable {
		DevLabsPageObjects devLabsPageObjects = new DevLabsPageObjects();
		EnterText(devLabsPageObjects.emailAddress, readConfigFile(email));
	    throw new PendingException();
	}

	@When("^Enters Password on Singup \"([^\"]*)\"$")
	public void enters_Password_on_Singup(String password) throws Throwable {
		DevLabsPageObjects devLabsPageObjects = new DevLabsPageObjects();
		EnterText(devLabsPageObjects.password, readConfigFile(password));
	    throw new PendingException();
	}

	@Then("^Confirms Password on Singup \"([^\"]*)\"$")
	public void confirms_Password_on_Singup(String confirmpassword) throws Throwable {
		DevLabsPageObjects devLabsPageObjects = new DevLabsPageObjects();
		EnterText(devLabsPageObjects.confirmPassword, readConfigFile(confirmpassword));
	    throw new PendingException();
	}




	}

