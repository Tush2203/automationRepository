package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-rcjuolp/login.do");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Tasks']")).click();
		driver.findElement(By.xpath("//span[text()='All active projects of all active customers']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='HDFC']")).click();
		driver.findElement(By.xpath("//a[text()='Login page test case']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Create New Tasks']")).click();
		driver.findElement(By.xpath("//option[text()='HDFC']")).click();
		driver.findElement(By.xpath("//option[text()='WEB APPLICATION']")).click();
		driver.findElement(By.xpath("//label[text()='Show list of active projects and customers']")).click();
		Thread.sleep(2000);
	}

}
