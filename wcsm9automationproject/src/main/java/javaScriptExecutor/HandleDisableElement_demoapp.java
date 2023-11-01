package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisableElement_demoapp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");

		driver.findElement(By.xpath("//p[text()='Enabled Mode']")).click();

		//TO SELECT DISABLE MODE	
		driver.findElement(By.xpath("//p[text()='Disabled Mode']")).click();
		Thread.sleep(2000);

		//TO FILL name IN NAME TEXTBOX
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('name').value='Ritik'");
		Thread.sleep(2000);

		//TO FILL email IN email TEXTBOX
		jse.executeScript("document.getElementById('email').value='Ritik@gmail.com'");
		Thread.sleep(2000);

		//TO FILL PASSWORD IN PASSWORD TEXTBOX
		jse.executeScript("document.getElementById('password').value='Ritik@123'");
		Thread.sleep(2000);

		//click on disable register button
		WebElement disableRegButton = driver.findElement(By.xpath("//button[text()='Register']"));

		if(disableRegButton.isDisplayed())
		{
			jse.executeScript("arguments[0].click()", disableRegButton);
			System.out.println("Clicked");
		}
		else
		{
			System.out.println("Not Clicked");
		}

		//CLOSE WEB BROWSER
		driver.quit();
	}

}
