package javaScriptExecutor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class OmayoBlogpost {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");
		
		//scroll til WebElement
		WebElement disableTextBox = driver.findElement(By.id("tb2"));
		Point webEle_loc = disableTextBox.getLocation();
		int xaxis = webEle_loc.getX();
		int yaxis = webEle_loc.getY();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
		
		//enter text in disable textbox
		jse.executeScript("document.getElementById('tb2').value='Ritik'");
		
		//take ss of disable webelement
		WebElement ss = driver.findElement(By.id("tb2"));
		
		File src = ss.getScreenshotAs(OutputType.FILE);
		File desp = new File("./ScreenShots/omayo.png");
		
		Files.copy(src, desp);
		
		Thread.sleep(2000);
		driver.quit();
	}

}
