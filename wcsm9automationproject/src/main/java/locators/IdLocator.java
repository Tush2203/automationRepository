package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/hp/Desktop/wcsm9WebElements/LoginPage.html");
		Thread.sleep(2000);
		
		//Enter Admin as value inside username
		driver.findElement(By.id("id1")).sendKeys("Admin");
		
		Thread.sleep(2000);
		
		//Enter Manager as value inside password
		driver.findElement(By.id("id2")).sendKeys("Manager");
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}
}
