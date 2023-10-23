package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFox {
	// To launch Firefox browser we need to create obj of FirefoxDriver
	public static void main(String[] args) throws InterruptedException {
		
		//upcasting to WebDriver interface
		WebDriver driver =  new FirefoxDriver();
		
		//to maximize the browser
		driver.manage().window().maximize();
		System.out.println("FireFox Browser launched..!!");
		
		//to delay the execution for 2 sec
		Thread.sleep(2000);
		
		//to close the firefox browser
		driver.close();
		System.out.println("Firefox is Closed..!!");
	}
}
