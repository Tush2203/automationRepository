package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra_EndToEnd {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://myntra.com/");
		
		driver.findElement(By.className("desktop-searchBar")).sendKeys("shirt",Keys.ENTER);
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//img[@alt='Mast & Harbour Men Blue & White Slim Fit Striped Casual Sustainable Shirt']")).click();
		for(String wh:driver.getWindowHandles())
		{
			if(!wh.equals(parent))
			{
				driver.switchTo().window(wh);
				driver.findElement(By.xpath("//p[text()='40']")).click();
				driver.findElement(By.xpath("//input[@placeholder='Enter pincode']")).sendKeys("411033");
				driver.findElement(By.xpath("//input[@value='Check']")).click();
				driver.findElement(By.xpath("//span[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']")).click();
				
				//ElementClickInterceptedException
				
				driver.findElement(By.xpath("//span[@data-reactid='903']")).click();
				
			}
		}
	}

}
