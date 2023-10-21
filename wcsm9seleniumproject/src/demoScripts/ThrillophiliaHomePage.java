package demoScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThrillophiliaHomePage {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.thrillophilia.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.name("search")).sendKeys("Ladakh",Keys.ENTER);
		
	}

}
