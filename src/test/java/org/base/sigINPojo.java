package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sigINPojo extends BaseClass {
	 
	public sigINPojo() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (xpath= "//a[text()='Sign up for Facebook']")
	private WebElement Creatnewaccount;
	
	@FindBy (name="firstname")
	private WebElement fristname;
	
	@FindBy (name="lastname")
	private WebElement secondname;
	
	@FindBy (name="reg_email__")
	private WebElement email;
	
	@FindBy (name="reg_passwd__")
	private WebElement pass;

	public WebElement getCreatnewaccount() {
		return Creatnewaccount;
	}

	public WebElement getFristname() {
		return fristname;
	}

	public WebElement getSecondname() {
		return secondname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}
	
}
