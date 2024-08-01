package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPojo extends BaseClass {
	

		public FlipkartPojo() {
			PageFactory.initElements(driver, this);			
		}
		
		
		@FindBy (xpath="(//input[@type='text'])[2]")
		private WebElement email;
		
		//@FindBy (name ="QqFHMw twnTnD _7Pd1Fp")
		//private WebElement password;

		public WebElement getEmail() {
			return email;
		}

		//public WebElement getPassword() {
			//return password;
		}
		
	

