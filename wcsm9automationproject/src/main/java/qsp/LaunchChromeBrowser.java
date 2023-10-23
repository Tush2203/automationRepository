package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
	// To launch chrome browser we need to create obj of ChromeDriver
	
	public static void main(String[] args) throws InterruptedException {
		
		//upcasting to WebDriver interface
		WebDriver driver = new ChromeDriver();
		
		//to maximize the browser
		driver.manage().window().maximize();
		System.out.println("Chrome Browser launched..!!");
		
		//to delay the execution for 2 sec
		Thread.sleep(2000);
		
		//to close the chrome
		driver.close();
		System.out.println("Chrome Browser Closed..!!");
		//driver.manage().window().maximize();
	}

}
