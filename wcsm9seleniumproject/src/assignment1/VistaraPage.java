package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class VistaraPage {
	public static void main(String[] args) throws InterruptedException {
		
		//To handle notifications in chrome browser
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.airvistara.com/in/en");
		
		Thread.sleep(2000);
		driver.findElement(By.id("cookieModalCloseBtn")).click();
		
		driver.findElement(By.name("flightSearchFrom")).sendKeys("pnq");
		driver.findElement(By.name("flightSearchTo")).sendKeys("bom");
		Thread.sleep(2000);
		
		driver.findElement(By.name("depart")).click();
		driver.findElement(By.partialLinkText("21")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("24")).click();
		driver.findElement(By.id("passengers")).click();
		driver.findElement(By.linkText("Business")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class^='col-xs-12 done']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("book-flight-widget")).click();
	}

}
