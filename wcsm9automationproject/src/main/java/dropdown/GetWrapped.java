package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrapped {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/hp/Desktop/wcsm9WebElements/MultipleSelectDropDown.html");
		
		//MULTI SELECT DROPDOWN
		WebElement dropDown1 = driver.findElement(By.id("iddd"));
		
		//HANDLE DROPDOWN
		Select sel1 = new Select(dropDown1);
		
		System.out.println(sel1.getWrappedElement().getText());
	}

}
