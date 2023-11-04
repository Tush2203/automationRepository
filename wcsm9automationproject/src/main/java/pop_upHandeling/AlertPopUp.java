package pop_upHandeling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		
		//click on pop-up link
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		
		//click on javascript link
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		
		//click on alert box
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Thread.sleep(2000);
		
		//handle pop-up
		Alert al = driver.switchTo().alert();
		
		//handle by accept
		al.accept();
		
		//handle by dismiss
		al.dismiss();
		
		//get text method
		al.getText();
		
		driver.quit();
	}

}
