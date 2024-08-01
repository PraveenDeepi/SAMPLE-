package org.stepdefinistion;

import org.base.BaseClass;
import org.base.FlipkartPojo;
import org.base.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Flipkartlogin extends BaseClass {

	FlipkartPojo f;
	@Given("To launch the chrome browser and maximize the window")
	public void to_launch_the_chrome_browser_and_maximize_the_window() {
		launchBrowser();
		WindowMaximize();
	    
	}

	@When("To launch the Flipkart url")
	public void to_launch_the_Flipkart_url() {
		launchUrl("https://www.flipkart.com/account/login?ret=/");
	}

	@When("To pass the valied username in email field")
	public void to_pass_the_valied_username_in_email_field() {
		f = new FlipkartPojo();
		passText("8508358610", f.getEmail());
	    
	}

	@When("To pass the invalied password in password field")
	public void to_pass_the_invalied_password_in_password_field() {
		f = new FlipkartPojo();
		//passText("12345678",f.getPassword());
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		f = new FlipkartPojo();
	   
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		closeEntireBrowser();
	  
	}
}

