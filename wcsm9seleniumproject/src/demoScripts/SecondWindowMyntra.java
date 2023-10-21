package demoScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SecondWindowMyntra {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Men's Dazzler Sneakers")).click();
		Thread.sleep(2000);
		//driver.findElement(By.id("max-height: 482px; max-width: 482px;")).click();
		System.out.println("Executed Properly");
		driver.quit();
	}
}
