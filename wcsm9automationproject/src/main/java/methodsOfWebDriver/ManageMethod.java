package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		//To maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//To minimize the browser
		/*driver.manage().window().minimize();
		Thread.sleep(2000);
		
		//To fullscreen the browser
		driver.manage().window().fullscreen();
		Thread.sleep(2000);*/
		
		//To set the size of browser
		Dimension targetSize = new Dimension(350, 450);
		driver.manage().window().setSize(targetSize);
		
		//To set the positin of browser
		Point targetPosition = new Point(350, 150);
		driver.manage().window().setPosition(targetPosition);
		
		driver.quit();
		
	}
}
