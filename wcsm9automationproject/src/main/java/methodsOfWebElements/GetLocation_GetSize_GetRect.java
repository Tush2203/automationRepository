package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation_GetSize_GetRect {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://demoapps.qspiders.com/");
		
		WebElement emailTB = driver.findElement(By.cssSelector("input#email"));
		
		//TO GET TE LOCATION OF EMAIL TEXT BOX
		Point loc = emailTB.getLocation();
		
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		
		System.out.println("Location of email Text Box : "+xaxis+ " : "+yaxis);
		
		//TO GET SIZE OF EMAIL TEXT BOX
		Dimension size = emailTB.getSize();
		
		int height = size.getHeight();
		int width = size.getWidth();
		
		System.out.println("Size of email text box is : "+height+ " : "+width);
		
		//TO GET RECT OF EMAIL TEXT BOX
		Rectangle rect = emailTB.getRect();
		
		int x = rect.getX();
		int y = rect.getY();
		
		System.out.println("Height and width of email text box : "+x+" : "+y);
	}

}
