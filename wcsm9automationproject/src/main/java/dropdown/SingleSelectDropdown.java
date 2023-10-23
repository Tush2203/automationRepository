package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropdown {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		WebElement dropdown1 = driver.findElement(By.xpath("//select[contains(@class,'focus:ring  ease-linear transition-all duration-150 w-5/12')]"));
		
		//TO SELECT NUMBER DROPDOWN
		Select num = new Select(dropdown1);
		num.selectByIndex(3);
		
		//TO SELECT COUNTRY DROPDOWN
		WebElement dropdown2 = driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
		Select cntry = new Select(dropdown2);
	
		cntry.selectByIndex(2);
		
		//TO SELECT STATE DROPDOWN
		WebElement dropdown3 = driver.findElement(By.xpath("//label[text()='State']/following-sibling::select"));
		//TO SELECT STATE DROPDOWN
		//WebElement dropdown3 = driver.findElement(By.xpath("//label[text()='State']/following-sibling::select"));)
		Select stat = new Select(dropdown3);
		for(int i =0; i < 5;i++)
		{
			stat.selectByIndex(i);
		}
	}

}
