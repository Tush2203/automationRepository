package synchronizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com/");
		//driver.manage().wait();
		
		driver.findElement(By.xpath("//input[contains(@aria-label,'Phone number, username, or email')]")).sendKeys("Test@xyz.com");
		driver.findElement(By.xpath("//input[contains(@aria-label,'Password')]")).sendKeys("test123");
		
		driver.findElement(By.xpath("//div[contains(text(),'Log in')]")).click();
	}

}
