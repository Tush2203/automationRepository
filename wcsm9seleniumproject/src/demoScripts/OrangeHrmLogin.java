package demoScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmLogin {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		//System.out.println("Working Fine");
		//Thread.sleep(2000);
		
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Abinav Thashvin")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Logout")).click();
		System.out.println("Execution Prperly");
		driver.quit();
	}

}
