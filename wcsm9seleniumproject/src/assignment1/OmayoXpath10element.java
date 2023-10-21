package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmayoXpath10element {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		driver.findElement(By.xpath("//textarea[@id='ta1']")).sendKeys("Hello Omayo.Blogpost");
		driver.findElement(By.xpath("//a[@id='link2']"));
		driver.findElement(By.xpath("//a[@id='link1']"));
		driver.findElement(By.xpath("//input[@id='textbox1']"));
		driver.findElement(By.xpath("//button[@id='but2']"));
		driver.findElement(By.xpath("//button[@value='LogIn']"));
		driver.findElement(By.xpath("//input[@id='alert2']"));
		driver.findElement(By.xpath("//input[@id='timerButton']"));
		driver.findElement(By.xpath("//input[@name='userid']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pswrd']")).sendKeys("admin");
		Thread.sleep(2000);
		
		//driver.quit();
	}
}
