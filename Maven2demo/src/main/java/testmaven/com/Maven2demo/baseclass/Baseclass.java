package testmaven.com.Maven2demo.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	public WebDriver driver;
	
	@BeforeTest	
	public void runtest1() 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/books");
	}
	
	@AfterTest	
	public void runtest2() 
	{
	driver.quit();
	}
}