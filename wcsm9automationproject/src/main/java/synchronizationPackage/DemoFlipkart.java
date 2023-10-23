package synchronizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFlipkart {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 14",Keys.ENTER);
		
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row'])[2]")).click();
		for(String wh: driver.getWindowHandles())
		{
			if(!wh.equals(parent))
			{
				driver.switchTo().window(wh);
				driver.findElement(By.id("pincodeInputId")).sendKeys("411033");
				driver.findElement(By.xpath("//span[text()='Check']")).click();
				//driver.findElement(By.xpath("//span[text()='View Details']")).click();
				//driver.findElement(By.xpath("//button[@class='_2KpZ6l _1KAjNd']")).click();
				driver.findElement(By.xpath("//div[text()='512 GB']")).click();
			}
		}
	}
}
