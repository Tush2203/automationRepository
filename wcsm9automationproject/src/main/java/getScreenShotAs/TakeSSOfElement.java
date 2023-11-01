package getScreenShotAs;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class TakeSSOfElement {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//TO LAUNCH APPLICATION
		driver.get("https://www.bluestone.com/");
		
		//HANDLE POP-UP
		driver.findElement(By.id("denyBtn")).click();
		
		//TO FIND ELEMENT OF WATCH JEWELLERY
		WebElement menuCoins = driver.findElement(By.xpath("//a[@title='Coins']"));
		
		//MOUSE OVER TO WEBELEMENT AND OBJECT CREATION OF ACTIONS CLASS
		Actions act = new Actions(driver);
		act.moveToElement(menuCoins).perform();
		Thread.sleep(2000);
		
		//CLICK ON COINS BY DESIGN
		driver.findElement(By.xpath("//span[text()='Coins by Design']")).click();
		Thread.sleep(2000);
		
		//IDENTIFY ELEMENT TO TAKE SS OF
		WebElement coinElement = driver.findElement(By.xpath("//img[@alt='50 gram 24 KT Lakshmi Gold Coin']"));
		Thread.sleep(2000);
		
		//STORE IN SS FOLDER
		File src = coinElement.getScreenshotAs(OutputType.FILE);
		File desc = new File("./ScreenShots/coinElement.png");
		
		Files.copy(src, desc);
		
		Thread.sleep(2000);
		driver.quit();
	}

}
