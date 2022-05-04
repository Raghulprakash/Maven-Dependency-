package testmaven.com.Maven2demo.baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Baseclass1 {
public WebDriver driver;
	
	@BeforeTest	
	public void runtest1() throws IOException 
	{
		FileInputStream stream=new FileInputStream("config.properties");
		Properties property=new Properties();
		property.load(stream);
		String browser = property.getProperty("Browser");
		String driverlocation=property.getProperty("DriverLocation");
		
		if(browser.equalsIgnoreCase("Chrome")) 
		{
			System.setProperty("webdriver.chrome.driver",driverlocation);
		    driver= new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",driverlocation);
		    driver= new FirefoxDriver();
		}
		
	}
	
	@AfterTest	
	public void runtest2() 
	{
	driver.quit();
	}
}
