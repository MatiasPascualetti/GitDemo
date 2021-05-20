package stepDefinitions;


import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {

	
	@Given("^User is on the NetBanking landing page$")
	public void user_is_on_the_NetBanking_landing_page() {
		// Code to user navigates to landing page
		System.out.println("User navigated to landing page");
	}
	
	@When("^User login into the app with username and password$")
	public void user_login_to_the_app_with_username_and_password() {
		// Code to login to the application
		System.out.println("User is logged");
	}
	
	@Then("^Home page is displayed$")
	public void home_page_is_displayed() {
		// Home page validation
		System.out.println("Home page is displayed succesfully");
	}
	
	@And("^Cards are displayed$")
	public void cards_are_displayed() {
		// Cards validation
		System.out.println("Cards availables are shown on the page");
	}
	
	 @When("^User login into the app with \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_login_to_the_app_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
		 System.out.println("User: " + strArg1);
		 System.out.println("User: " + strArg2);
	    }
	 
	 @And("^Cards displayed \"([^\"]*)\"$")
	    public void cards_displayed_something(String strArg1) throws Throwable {
		 System.out.println("Are cards shown?: " + strArg1);
	    }
	 
	 @Then("^Home page displayed \"([^\"]*)\"$")
	    public void home_page_displayed_something(String strArg1) throws Throwable {
		 System.out.println("Home page is displayed?: " + strArg1);
	    }
	 
	/* @When("^User login to the app with following details $")
	    public void user_login_to_the_app_with_following_details(DataTable data) throws Throwable {
	        List<List<String>> obj = data.asLists();
	        System.out.println(obj.get(0).get(1));
	    }*/
	 
	 @When("^User login to the app with (.+) and (.+)$")
	    public void user_login_to_the_app_with_and(String username, String password) throws Throwable {
	        System.out.println(username);
	        System.out.println(password);
	    }
	 
	 @Given("^validate the browser$")
	    public void validate_the_browser() throws Throwable {
		 System.out.println("Browser is present");
	    }

	    @When("^Browser is triggered$")
	    public void browser_is_triggered() throws Throwable {
	    	System.out.println("Browser is triggered");
	    }

	    @Then("^Check if the browser is displayed$")
	    public void check_if_the_browser_is_displayed() throws Throwable {
	    	System.out.println("Browser is displayed");
	    }
}
