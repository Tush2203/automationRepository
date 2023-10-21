package classTest25_09;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		
		String parentHandle = driver.getWindowHandle();
		
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		
		Thread.sleep(2000);
		Set<String> allHandles = driver.getWindowHandles();
		
		for(String wh:allHandles)   //Without NOT operator also Getting answer.
		{
			if(!parentHandle.equals(wh))
			{
				 TargetLocator switchto = driver.switchTo();
				 Thread.sleep(2000);
				 switchto.window(wh).close();
			}
		}
		
	}
}
