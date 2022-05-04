package testmaven.com.Maven2demo;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AmazonLowestPrice {

	public static void Example(WebDriver driver){
	//	System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
	 //   WebDriver driver = new ChromeDriver();
	//	driver.get("https://www.amazon.in/");
		String Window1 = driver.getWindowHandle();
        driver.manage().window().maximize();
		WebElement lowestpricemobile = driver.findElement(By.id("twotabsearchtextbox"));
		lowestpricemobile.sendKeys("samsung mobile under 2000");
		lowestpricemobile.submit();
		driver.findElement(By.linkText("Samsung Guru 1200 (GT-E1200, White)")).click();
		Set<String> Window2 = driver.getWindowHandles();
		for (String newwindows : Window2) {
			driver.switchTo().window(newwindows);
		}
		WebElement quantity = driver.findElement(By.xpath("//select[@id='quantity']"));
		Select numbers = new Select(quantity);
		numbers.selectByVisibleText("2");
		WebElement addToCart = driver.findElement(By.id("add-to-cart-button"));
		addToCart.click();
	}
}