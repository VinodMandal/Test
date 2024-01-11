package testcase;

import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.base;
import pages.Homepage;
import pages.login;


public class testlogin extends base{
	
login lg;
 
Homepage hp;
	public testlogin() throws FileNotFoundException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@BeforeMethod()
	public void setup() throws FileNotFoundException {
		
		init();
		
		lg = new login();
		
	}
	
	@Test(priority =1)
	public void login() throws FileNotFoundException {
		
		hp = lg.log("acvissadmin", "Uniqolabel@123$");
		
	String title=	driver.getTitle();
	Assert.assertEquals("Dashboard | Acviss", title);
	}
	
	@AfterMethod()
	public void teardown() {
	driver.quit();
	}
	
	
	}


