package actionPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspiderRightClick {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//TO LAUNCH APPLICATION
		driver.get("https://demoapps.qspiders.com/");
		
		//CLICK ON BUTTON LINK
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		
		//CLICK ON RIGHT CLICK BUTTON PRESENT AT RIGHT SIDE OF THE PAGE
		driver.findElement(By.xpath("//a[text()='Right Click']")).click();
		
		driver.findElement(By.xpath("//button[text()='Right Click']")).click();
	}

}
