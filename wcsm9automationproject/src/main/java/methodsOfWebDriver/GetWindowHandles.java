package methodsOfWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		String parentHandle = driver.getWindowHandle();
		System.out.println("Address of Parent Window : " + parentHandle);
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		
		Thread.sleep(2000);
		Set<String> allHandles = driver.getWindowHandles();
		
		for(String wh:allHandles)   //Without NOT operator also Getting answer.
		{
			if(parentHandle.equals(wh))
			{
				System.out.println("Address of Parent window : " + wh);
			}
			else
			{
				System.out.println("Address of Child window: " + wh);
			}
		}
		driver.quit();
	}
}
