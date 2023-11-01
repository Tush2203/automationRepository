package getScreenShotAs;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenShotAs_Way5 {
	
	public static void main(String[] args) throws IOException {
		
		//Explicit type cast into TakeScreenShot (I)
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev");
		
		//Take ScreenShot of WebPage
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		//call the method
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//define way for storing ss
		File dest = new File("./ScreenShots/seeniumss.png");
		
		//store the screenshot into dest
		Files.copy(src, dest);
		
	}

}
