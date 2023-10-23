package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/hp/Desktop/wcsm9WebElements/Link.html");
		
		driver.findElement(By.linkText("seleniumlink")).click();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
