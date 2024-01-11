package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pages.login;

public class base {
	
	public static Properties prop;
	public static WebDriver driver;
	
	
	
	public base() throws FileNotFoundException {
		
		Properties prop = new Properties();
		
		try {
		FileInputStream ip = new FileInputStream("/Testing/src/main/java/confi/config.properties.txt");
//			prop.load(login.class.getClassLoader().getResourceAsStream("config.properties.txt"));
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			
			e.printStackTrace();
		} 
		
	}
	
	
	public static void init() {
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(option);
		
	String 	url = "https://test.acviss.co/dashboard/login/?next=/dashboard/";
		
		driver.get(url);
		
		
	}
	
	
	
	
	
	
	

}
