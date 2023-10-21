package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramUserPass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("test@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("test123");
		Thread.sleep(2000);
		driver.quit();
	}
}
