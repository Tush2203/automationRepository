package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Laptop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("laptop",Keys.ENTER);
		
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		driver.findElement(By.xpath("//div[text()='HP']")).click();
		driver.findElement(By.xpath("//span[text()='13 MORE']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Core i7']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Windows 11']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
		
		List<WebElement> lapName = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
		List<WebElement> lapPrice = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		Thread.sleep(2000);
		for(int i =1;i <lapName.size();i++)
		{
			//Thread.sleep(2000);
			String output = lapName.get(i).getText();
			Thread.sleep(2000);
			for(int j =1;j<= i;j++)
			{
				String res = lapPrice.get(j).getText();
				Thread.sleep(2000);
				System.out.println(output +" : "+res);
			}
		}
	}

}
