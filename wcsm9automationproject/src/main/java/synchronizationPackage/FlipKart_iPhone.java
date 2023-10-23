package synchronizationPackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipKart_iPhone {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone", Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row'])[2]")).click();
		
		for(String wh:driver.getWindowHandles())
		{
			if(!wh.equals(parent))
			{
				driver.switchTo().window(wh);
				driver.findElement(By.xpath("(//div[@class='_2C41yO'])[1]")).click();
				driver.findElement(By.id("pincodeInputId")).sendKeys("433011");
				driver.findElement(By.xpath("//span[text()='Check']")).click();
				//driver.findElement(By.xpath("//a[text()='512 GB']")).click();
				driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
				driver.findElement(By.xpath("//div[text()='Remove']")).click();   //ElementClickInterceptedException
			}
		}
	}

}
