package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChooseDropdown {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		// Step 1:  First identify the dropdown with select tag --> WebElement
		WebElement dropdown = driver.findElement(By.name("dropdown2"));
		
		// Convert the WebElement as Select class (for Webdriver to understand)
		Select select = new Select(dropdown);
		
		// Choose the method (text / value / index) to perform the action
		//select.selectByVisibleText("Appium");
		//select.selectByValue("3");
		select.selectByIndex(4);
		
	}

}
