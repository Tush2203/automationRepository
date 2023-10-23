package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkLocator {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/hp/Desktop/wcsm9WebElements/Link.html");
		
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("selenium")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
