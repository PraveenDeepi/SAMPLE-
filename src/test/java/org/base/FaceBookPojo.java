package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookPojo extends BaseClass {
	
		public FaceBookPojo() {
		PageFactory.initElements(driver, this);	
		
		}
		
		@FindBy (id="email")
		private WebElement email;
		
		@FindBy (name="pass")
		private WebElement password;
		
		@FindBy(xpath = "//button[@type='submit']")
		private WebElement Login;

		
		public WebElement getEmail() {
			return email;
		}
		
		public WebElement getPassword() {
			return password;
		}
		public WebElement getLogin() {
			return Login;
		}
}
		
	

