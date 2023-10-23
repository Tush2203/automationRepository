package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-rcjuolp/login.do");
		
		Thread.sleep(2000);
		 WebElement usrTB = driver.findElement(By.name("username"));
		 usrTB.sendKeys("admin");
		 
		driver.findElement(By.name("pwd")).sendKeys("admin123");
		
		//TO clear the text from username TB
		usrTB.clear();
		
	}

}
