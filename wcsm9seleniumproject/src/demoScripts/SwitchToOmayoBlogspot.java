package demoScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToOmayoBlogspot {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		String parentHandle = driver.getWindowHandle();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		
		Set<String> allHandles = driver.getWindowHandles();
		for(String wh:allHandles)
		{
			if(!parentHandle.equals(wh))
			{
				System.out.println("Address of child window : " + wh);
				driver.switchTo().window(wh).manage().window().maximize();
				Thread.sleep(2000);
				driver.close();
			}
			else
			{
				System.out.println("Address of parent window: " + wh);
			}
		}
		//driver.quit();
	}

}
