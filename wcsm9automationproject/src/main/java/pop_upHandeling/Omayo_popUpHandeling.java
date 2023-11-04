package pop_upHandeling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Omayo_popUpHandeling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");
		
		//click on alert button
		driver.findElement(By.id("alert1")).click();
		
		//handeling pop up
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		
		/*
		//using accept
		al.accept();
		
		//using dismiss
		al.dismiss();
		*/
		
		//get text
		System.out.println(al.getText());
		
		//close the browser
		driver.quit();
	}

}
