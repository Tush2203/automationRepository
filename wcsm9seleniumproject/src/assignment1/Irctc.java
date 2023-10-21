package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Irctc {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[@class='fa fa-window-close pull-right loginCloseBtn ng-tns-c19-13']")).click();
		//Thread.sleep(2000);
		//driver.switchTo().activeElement().sendKeys("pune",Keys.ARROW_DOWN.ENTER);
		//driver.findElement(By.xpath("//span[text()=' NAGPUR - NGP ']")).click();
		//driver.findElement(By.id("destination")).sendKeys("bhopal", Keys.ENTER);
		
		
	}

}
