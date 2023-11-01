package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/");
		
		Thread.sleep(2000);
		
		
		//TO PERFORM SCROLL DOWN
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		
		//TO PERFORM SCROLL UP
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-500)");
		
		Thread.sleep(2000);
		driver.quit();
	}

}
