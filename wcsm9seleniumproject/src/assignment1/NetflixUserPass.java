package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixUserPass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.netflix.com/in/Login");
		Thread.sleep(2000);
		driver.findElement(By.name("userLoginId")).sendKeys("test@gmail.com");
		//Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("test123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='btn login-button btn-submit btn-small']")).click();
		
		//Used only for unique class name : It will match starting char of attribute value
		//driver.findElement(By.cssSelector("button[class^='btn']")).click();     
		
		//Used only for unique class name : It will match ending char of attribute value
		//driver.findElement(By.cssSelector("button[class$='btn-small']")).click();
		
		//Used only for unique class name : It will match any char of attribute value
		//driver.findElement(By.cssSelector("button[class*='btn-small']")).click();
		
		
		Thread.sleep(2000);
		driver.quit();
	}
}
