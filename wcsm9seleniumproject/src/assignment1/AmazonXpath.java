package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text' and (@id='twotabsearchtextbox')]")).sendKeys("iphone",Keys.ENTER);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal' and (text()='Apple iPhone 15 Plus (256 GB) - Black')]"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='nav-logo-sprites' and (@class='nav-logo-link nav-progressive-attribute')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@alt='Home decoration' and (@class='_fluid-quad-image-label-v2_style_fluidLandscapeImage__2euAK _fluid-quad-image-label-v2_style_fluidImage__gTBjA')]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='https://images-eu.ssl-images-amazon.com/images/G/31/IMG19/Home/bau/Decor/XCM_Manual_440x460_1202741_1202741_IN_Home_Decor_Non_GW_BAU_9_1575984235_jpg.jpg' and (@alt='Clocks')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@dir='auto' and (text()='Reed Diffusers, Oils & Accessories')]")).click();
		driver.findElement(By.xpath("//img[@class='s-image' and (@data-image-index='13')]"));
		Thread.sleep(2000);
		driver.navigate().back();
		
		
		
	}
}
