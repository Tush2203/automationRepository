package demoScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeLoginCssSelector {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[class^='oxd-button']")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.cssSelector("p[class$='forgot-header']")).click();  //Forget Password
		
		//----------CssSelector For My Info Page-----------//
		
		driver.findElement(By.linkText("My Info")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='firstName']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("abc");
		driver.findElement(By.cssSelector("input[name='middleName']")).sendKeys("def");
		driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("xyz");
		Thread.sleep(2000);
		//For rest no unique attribute 
		
	}

}
