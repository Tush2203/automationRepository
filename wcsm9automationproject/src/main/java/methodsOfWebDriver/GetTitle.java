package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.findElement(By.id("link1")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		System.out.println("Blogs page is open");
		driver.quit();
	}

}
