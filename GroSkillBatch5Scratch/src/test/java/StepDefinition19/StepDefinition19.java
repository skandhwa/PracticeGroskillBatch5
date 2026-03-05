package StepDefinition19;

import org.openqa.selenium.WebDriver;

import PageRepository.LoginPage18;
import PageRepository.NewCustomerPage;
import Utilities.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition19 extends BaseClass {
	
	
	WebDriver driver=BaseClass.initializeDriver();
	LoginPage18 obj=new LoginPage18(driver);
	NewCustomerPage obj1=new NewCustomerPage(driver);
	
	
	@Given("user opens the browser URL")
	public void user_opens_the_browser_url() {
		
		getTitle();
		
	   
	}

	@Given("user enters the username as {string}")
	public void user_enters_the_username_as(String uname) {
		
		obj.enterUserName(uname);
		
	    
	}

	@Given("user enters the password as {string}")
	public void user_enters_the_password_as(String password) {
		
		obj.enterPassword(password);
	   
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		
		
		obj.clickLogin();
	   
	}

	@Then("validate that user navigates to the homepage of the application")
	public void validate_that_user_navigates_to_the_homepage_of_the_application() {
	   
		String URL1=getCurrentURL();
		if(URL1.contains("homepage"))
		{
			System.out.println("User navigated to correct page");
		}
		
		else
		{
			throw new NullPointerException("Page navigation not successfull");
			
		}
		
		
	}
	
	
	@Given("user is on the homepage of the application")
	public void user_is_on_the_homepage_of_the_application() {
	    
		getTitle();
		
	}

	@Given("user clicks on New Customer link")
	public void user_clicks_on_new_customer_link() {
		
		obj1.clickOnNewCustomer();
	    
	}

	@Given("user enters the customer name as {string}")
	public void user_enters_the_customer_name_as(String cust_name) {
	   
		obj1.enterUserName(cust_name);
		
		
	}

	@Given("user selects gender")
	public void user_selects_gender() {
		
		obj1.selectGender();
		scrollPage();
	    
		
	}

	@Given("user enters date of birth as {string}")
	public void user_enters_date_of_birth_as(String dob) {
	    
		
		obj1.enterDOB(dob);
		
		
	}

	@Given("user enters address as {string}")
	public void user_enters_address_as(String address) {
		
		
	   obj1.enterAddress(address);
		
		
	}

	@Given("user enters city  as {string}")
	public void user_enters_city_as(String city) {
	   
		obj1.enterCity(city);
		
		
	}

	@Given("user enters state as {string}")
	public void user_enters_state_as(String state) {
	   
		obj1.enterState(state);
		
	}
	
	
	@Given("user enters pin as {string}")
	public void user_enters_pin_as(String pin) {
		
		obj1.enterPin(pin);
	   
	}


	@Given("user enters mobile as {string}")
	public void user_enters_mobile_as(String mobile) {
		
		obj1.enterMobile(mobile);
	   
	}

	
	
	@Given("user enters email as emailAddress")
	public void user_enters_email_as_email_address() {
	    
		obj1.enterEmail(getEmail());
		
	}

	@Given("user enters password as {string}")
	public void user_enters_password_as(String password) {
	    
		obj1.enterPassword(password);
	}

	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() {
	    
		obj1.clickOnSubmit();
	}
	
	@Then("a new customer will be created")
	public void a_new_customer_will_be_created() {
	   
		
		
	}

	@Then("user captures the customer id")
	public void user_captures_the_customer_id() {
	   
		
		
	}
	
	@Then("user closes the browser")
	public void user_closes_the_browser() throws InterruptedException {
	    
		
		closeBrowser();
	}
	

}
