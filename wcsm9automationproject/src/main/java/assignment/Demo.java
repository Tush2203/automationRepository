package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
		
		/*
		 * CHROME DRIVER IS A CLASS AND WEBDRIVER IS AN INTERFACE
		 * CHROME DRIVER CLASS EXTENDS REMOTE WEBDRIVER WICH IMPLEMENTS WEBDRIVER INTERFACE
		 * THUS CHROMEDRIVER ALSO IMPLEMENTS ALL THE METHODS OF WEBDRIVER INTERFACE
		 */
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}

}
