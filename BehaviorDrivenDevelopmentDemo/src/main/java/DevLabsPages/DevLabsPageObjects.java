package DevLabsPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import helper.PropertiesHelper;
import helper.today;

public class DevLabsPageObjects extends today {
	public DevLabsPageObjects() {
		PageFactory.initElements(PropertiesHelper.driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//SPAN[text()='Alert']")
	public WebElement alertButton;
	
	@FindBy(how = How.NAME, using = "zxcvbnm")
	public WebElement confirmButton;
	
	@FindBy(how = How.NAME, using = "username")
	public WebElement username;
	
	@FindBy(how = How.NAME, using = "password")
	public WebElement password;
	
	@FindBy(how = How.NAME, using = "remember-me")
	public WebElement rememberme;
	
	@FindBy(how = How.XPATH , using = "//button[@id= 'submit']")
	public WebElement submit;
	
	@FindBy(how = How.XPATH, using = "//a[text()=' Sign Up Here']")
	public WebElement signuphere;
	
	@FindBy(how = How.NAME, using = "firstName")
	public WebElement firstname;
	
	@FindBy(how = How.NAME, using = "lastName")
	public WebElement lastname;
	
	@FindBy(how = How.XPATH, using = "//input[@id='gender' and @value='F']")
	public WebElement Gender;
	
	@FindBy(how = How.ID, using = "dob")
	public WebElement dob;
	
	@FindBy(how = How.ID, using = "ssn")
	public WebElement ssn;
	
	@FindBy(how = How.ID, using = "emailAddress")
	public WebElement emailAddress;
	
	
	@FindBy(how = How.ID, using = "password")
	public WebElement signuppassword;
	
	
	@FindBy(how = How.ID, using = "confirmPassword")
	public WebElement confirmPassword;
	
	
	@FindBy(how = How.XPATH, using = "//a[@title= 'Start your wonderful journey']")
	public WebElement startyourwonderfuljourney;
	
	@FindBy ( how= How.XPATH, using= "//div[contains(text(),'Porur')]")
	public WebElement Porur;
	
	@FindBy(how= How.XPATH, using= "//button[contains(text(),'Next')]")
	public WebElement nextButton;
	
	@FindBy(how= How.XPATH, using= "//*[@class='day'] [2]")
	public WebElement nextdate;
	
	@FindBy(how= How.XPATH, using= "//*[@class='day'] [5]")
	public WebElement lastdate;
		
	@FindBy(how= How.XPATH, using= "//button[contains(text(),'Done')]")
	public WebElement doneButton;
	
	@FindBy(how= How.XPATH, using= "//div[@class = 'price']")
	public WebElement price;
	
}
