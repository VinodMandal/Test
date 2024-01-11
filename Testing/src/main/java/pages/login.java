package pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.base;




public class login extends base{
	
	

	//page object Rep
	
	
	@FindBy(id ="username")
	
	WebElement username;
	
	@FindBy(id ="password")
	
	WebElement password;
	
	@FindBy(id = "submit")
	WebElement submit;
	
	
	public login() throws FileNotFoundException {
		PageFactory.initElements(driver, this);	
	}
	
	
	public Homepage log(String un, String pw) throws FileNotFoundException {
		
		username.sendKeys(un);
		password.sendKeys(pw);
		submit.click();
		return new Homepage();
		
	}

}
