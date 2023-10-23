package methodsOfWebDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		
		driver.switchTo().activeElement().sendKeys("shoes");
		Thread.sleep(2000);
		List<WebElement> shoeOption = driver.findElements(By.className("wM6W7d"));
		Thread.sleep(2000);
		for(WebElement op:shoeOption)
		{
			Thread.sleep(2000);
			String options = op.getText();
			
			System.out.println(options);
		}
		
		
	}

}
