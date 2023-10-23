package dropdown;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EleminateDuplicate {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/hp/Desktop/wcsm9WebElements/DropDown.html");

		//IDENTIFY DROPDOWN AND STORE IT IN REF VAR
		WebElement menuDropDown = driver.findElement(By.id("iddd"));
		
		
		//GET ALL THE OPTIONS OF menuDropDown
		Select sel = new Select(menuDropDown);
		List<WebElement> allops = sel.getOptions();
		
		//TO ELIMINATE DUPLICATE WE USE HASHSET
		
		HashSet<String> hs = new HashSet<String>();
		
		// READ THE LIST BY USING FOR LOOP AND ELIMINATE DUPLICATE
		for(int i = 0; i<allops.size();i++)
		{
			WebElement op = allops.get(i);
			
			//get the text of WebElement
			String dropDownOption = op.getText();
			
			System.out.println(dropDownOption);
			Thread.sleep(2000);
			
			//add the dropDownoption into HashSet and remove duplicates from DropDown
			hs.add(dropDownOption);
		}
		Thread.sleep(2000);
		//to read the option from hashset using for loop
		for(String opt:hs)
		{
			Thread.sleep(2000);
			System.out.println(opt);
		}
	}

}
