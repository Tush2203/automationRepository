package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_MobileP {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@role='button']")).click();
		driver.findElement(By.name("q")).sendKeys("mobile",Keys.ENTER);
		//driver.findElement(By.partialLinkText("Search Icon")).click();
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).click();
		
		//To get print of the WebElement we need to use getText() method. we need to create a variable, return type should be String.
		String price = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
		System.out.println(price);
		Thread.sleep(4000);
		driver.quit();
	}
}
