package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTestUserPass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("test@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("test123");
		Thread.sleep(2000);
		driver.quit();
	}
}
