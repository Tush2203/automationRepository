package actionPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//TO LAUNCH APPLICATION
		driver.get("https://www.bluestone.com/");
		
		//HANDLE POP-UP
		driver.findElement(By.id("denyBtn")).click();
		
		//TO FIND ELEMENT OF WATCH JEWELLERY
		WebElement menuWatchJewellery = driver.findElement(By.xpath("//a[@title='Watch Jewellery']"));
		
		//MOUSE OVER TO WEBELEMENT AND OBJECT CREATION OF ACTIONS CLASS
		Actions act = new Actions(driver);
		act.moveToElement(menuWatchJewellery).perform();
		
		//CLICK ON BAND(WEBELEMENT)
		driver.findElement(By.xpath("//a[@title='Band']")).click();
		
		
	}

}
