package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgressBar_DemoappQSP {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		
		//click on Synchronization link
		driver.findElement(By.xpath("//section[text()='Synchronization']")).click();
		
		//click on progress bar link
		driver.findElement(By.xpath("//section[text()='Progress Bar']")).click();
		
		//click on Disabled Element button
		driver.findElement(By.xpath("//a[text()='Disabled Element']")).click();
		
		//enter time in seconds textbox
		driver.findElement(By.xpath("//input[@placeholder='Enter time in seconds']")).sendKeys("5");
		
		//click on start button
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		Thread.sleep(6000);
		System.out.println("waited for progress to complete");
		
		//handle disable dropdown
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("")
		
		//driver.findElement(By.xpath("//option[text()='Select your answer']"));
	}

}
