package org.stepdefinistion;

import org.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass {
	
	@Before
	private void precondition() {
		launchBrowser();
		WindowMaximize();
		

	}
	
	@After
	private void postcondition() {
		closeEntireBrowser();

	}
	

}