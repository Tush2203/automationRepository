package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/hp/Desktop/wcsm9WebElements/LoginPage.html");
		Thread.sleep(2000);
		
		//Enter Admin as value inside username
		driver.findElement(By.tagName("input")).sendKeys("Admin");
		
		Thread.sleep(2000);
		//Enter Manager as value inside password
		driver.findElement(By.tagName("input")).sendKeys("Manager");
		Thread.sleep(2000);
		
		driver.quit();
	}

}
