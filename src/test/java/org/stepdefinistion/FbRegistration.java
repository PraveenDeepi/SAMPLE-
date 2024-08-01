package org.stepdefinistion;

import java.util.List;

import org.base.BaseClass;
import org.base.sigINPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.*;

public class FbRegistration extends BaseClass {
	
	sigINPojo s;
	
//	@Given("To launch the browser and maximum")
//	public void to_launch_the_browser_and_maximum() {
//		launchBrowser();
//		WindowMaximize();
//	    
//	}
//
//	@When("To launch the Fb url in browser")
//	public void to_launch_the_Fb_url_in_browser() {
//	   launchUrl("https://www.facebook.com/login/");
//	}
//
//	@When("To click the Sign up for Facebook button")
//	public void to_click_the_Sign_up_for_Facebook_button() {
//		s = new sigINPojo();
//		clickBtn(s.getCreatnewaccount());
//	   
//	}
//
//	@When("To pass the fristname in fristname box")
//	public void to_pass_the_fristname_in_fristname_box(DataTable d) throws InterruptedException {
//		Thread.sleep(3000);
//		
//		List<String> l = d.asList();
//		s = new sigINPojo();
//		passText(l.get(2), s.getFristname());
//	}
//
//	@When("To pass the second name in secondname box")
//	public void to_pass_the_second_name_in_secondname_box() {
//		s = new sigINPojo();
//		passText("djdhd",s.getSecondname());
//	}
//
//	@When("To pass the email in email or phoneno box")
//	public void to_pass_the_email_in_email_or_phoneno_box(DataTable d) {
//		
//		List<List<String>> l = d.asLists();
//		s = new sigINPojo();
//		passText(l.get(2).get(3),s.getEmail());
//	}
//
//	@When("To pass the password in Password box")
//	public void to_pass_the_password_in_Password_box() {
//		s = new sigINPojo();
//	    passText("123456", s.getPass());
//	}
//	@Then("user close the browser")
//	public void user_close_the_browser() {
//	//	closeEntireBrowser();
//		
//	   
//	}
//
//
//}
	@Given("To launch the browser and maximum")
	public void toLaunchTheBrowserAndMaximum() {
		launchBrowser();
		WindowMaximize();
		
	}

	@When("To launch the Fb url in browser")
	public void toLaunchTheFbUrlInBrowser() {
		launchUrl("https://www.facebook.com/login/");
	
	}

	@When("To click the Sign up for Facebook button")
	public void toClickTheSignUpForFacebookButton() {
		s = new sigINPojo();
		clickBtn(s.getCreatnewaccount());
	    
	}

	@When("To pass the fristname in fristname box")
	public void toPassTheFristnameInFristnameBox(DataTable d) throws InterruptedException {
		Thread.sleep(3000);
		
		List<String> l = d.asList();
		s = new sigINPojo();
		passText(l.get(2), s.getFristname());
		
	}

	@When("To pass the second name in secondname box")
	public void toPassTheSecondNameInSecondnameBox() {
		s = new sigINPojo();
		passText("djdhd",s.getSecondname());
	}

	@When("To pass the email in email or phoneno box")
	public void toPassTheEmailInEmailOrPhonenoBox(DataTable d) {
		List<List<String>> l = d.asLists();
		s = new sigINPojo();
		passText(l.get(2).get(3),s.getEmail());s = new sigINPojo();
	}

	@When("To pass the password in Password box")
	public void toPassThePasswordInPasswordBox() {
		s = new sigINPojo();
		passText("123456", s.getPass());
	}

	@Then("user close the browser")
	public void userCloseTheBrowser() {
	   closeEntireBrowser();
	}
}



