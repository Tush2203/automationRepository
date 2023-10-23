package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://desktop-rcjuolp/login.do");
		Thread.sleep(2000);
		
		//To send input to username TB
		driver.findElement(By.name("username")).sendKeys("admin");
		
		//To send input to Password TB
		driver.findElement(By.name("pwd")).sendKeys("admin123");
	}

}
