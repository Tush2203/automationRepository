package demoScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramSignup {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Sign up')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@aria-label,'Mobile Number or Email')]")).sendKeys("test@xyz.com");
		driver.findElement(By.xpath("//input[contains(@aria-label,'Full Name')]")).sendKeys("Test");
		driver.findElement(By.xpath("//input[contains(@aria-label,'Username')]")).sendKeys("test@007");
		driver.findElement(By.xpath("//input[contains(@aria-label,'Password')]")).sendKeys("test12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Sign up')]")).click();
	}

}
