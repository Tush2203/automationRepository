package javaScriptExecutor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Selenium_Twitter_SS {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/");

		//SCROLL TILL TWITTER LOGO
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,5000)");
		WebElement twitterlogo = driver.findElement(By.xpath("//a[@aria-label='Selenium in Twitter']"));

		
		//TO SCROLL TILL TWITTER LOGO ANOTHER METHOD
		/*
		Point loc = twitterlogo.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
		 */


		//SS OF TWITTER LOGO
		TakesScreenshot ts = (TakesScreenshot)twitterlogo;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File desc = new File("./ScreenShots/twitterlogo.png");

		Files.copy(src, desc);

		driver.quit();
	}

}
