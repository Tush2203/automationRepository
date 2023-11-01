package actionPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone_Coins {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//LAUNCH APPLICATION
		driver.get("https://www.bluestone.com/");
		
		//HANDLE POP-UP
		driver.findElement(By.id("denyBtn")).click();
		
		//TO IDENTIFY WEBELEMENT
		WebElement act = driver.findElement(By.xpath("//a[@title='Coins']"));
		
		//USE ACTION CLASS
		Actions coinsTarget = new Actions(driver);
		
		//CLICK ON COINS BY DESIGN
		driver.findElement(By.xpath("//span[text()='Coins by Design']")).click();
		
		
	}

}
