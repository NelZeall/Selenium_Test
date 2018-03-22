package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class FirstTestCase {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Zlatan\\Downloads\\GeckoDriver\\geckodriver.exe");
		
	
	WebDriver driver = new FirefoxDriver();
	
		
		driver.get("https://9gag.com/");
		
		driver.manage().window().maximize();
		 
		WebElement login = driver.findElement(By.className("badge-login-button"));
		login.click();
			
		WebElement email = driver.findElement(By.id("jsid-login-email-name"));
		email.sendKeys("bigz.berserk@gmail.com");
		
		WebElement password = driver.findElement(By.id("login-email-password"));
		password.sendKeys("12345678z++");
	
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"login-email\"]/div[3]/input"));
		Actions actions = new Actions(driver);
		actions.moveToElement(submit).click().build().perform();


		
	}
	

}
