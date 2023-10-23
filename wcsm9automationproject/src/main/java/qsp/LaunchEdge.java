package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdge {
	// To launch edge browser we need to create obj of EdgeDriver
	
	public static void main(String[] args) throws InterruptedException {
		
		//upcasting to WebDriver interface
		WebDriver driver = new EdgeDriver();
		
		//to maximize the browser
		driver.manage().window().maximize();
		System.out.println("Edge Browser launched..!!");
		
		//to delay execution for 2 sec
		Thread.sleep(2000);
		
		//to close edge browser
		driver.close();
		System.out.println("Edge is Closed");
	}
}
