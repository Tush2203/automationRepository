package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstOption {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/hp/Desktop/wcsm9WebElements/DropDown.html");
		
		
		//IDENTIFY DROPDOWN
		WebElement dropDown1 = driver.findElement(By.id("iddd"));
		Select sel1 = new Select(dropDown1);
		sel1.selectByValue("v4");
		
		//SINGLE DROPDOWN
		WebElement single = sel1.getFirstSelectedOption();
		System.out.println(single.getText());
		
		//TO HANDLE MULTIPLE DROPDOWN WE NEED TO NAVIGATE TO DROPDOWN PAGE
		driver.navigate().to("file:///C:/Users/hp/Desktop/wcsm9WebElements/MultipleSelectDropDown.html");
		
		//TO IDENTIFY DROPDOWN
		WebElement dropDown2 = driver.findElement(By.id("iddd"));
		Select sel2 = new Select(dropDown2);
		Thread.sleep(2000);
		//SELECT MULTIPLE OPTION FROM MULTI SELECT OPTION
		for(int i = 1; i < 4; i++)
		{
			sel2.selectByIndex(i);
		}
		System.out.println(sel2.getFirstSelectedOption().getText());
		
	}

}
