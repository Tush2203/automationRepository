package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookUserPass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("Test123");
		Thread.sleep(2000);
		driver.quit();
	}
}
