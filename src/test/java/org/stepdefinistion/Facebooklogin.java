package org.stepdefinistion;

import org.base.BaseClass;
import org.base.FaceBookPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebooklogin extends BaseClass {
	
	FaceBookPojo f;
	@Given("user launch the browser and maximize the window")
	public void user_launch_the_browser_and_maximize_the_window() {
		launchBrowser();
		WindowMaximize();
	}

	@When("user launch the url")
	public void user_launch_the_url() {
		launchUrl("https://www.facebook.com/login/");
	   
	}

	@When("user pass the {string}email field")
	public void user_pass_the_email_field(String em) {
	   f = new FaceBookPojo();
	   passText(em, f.getEmail());
	   
	}

	@When("user pass the {string}password field")
	public void user_pass_the_password_field(String pass) {
		 f = new FaceBookPojo();
		 passText(pass, f.getPassword());
	   
	}

	@When("user click the login button")
	public void user_click_the_login_button() {
		 f = new FaceBookPojo();
		clickBtn(f.getLogin());
	   
	}

	@Then("user has close the browser")
	public void user_has_close_the_browser() {
		closeEntireBrowser();
	    
	}



	

}
