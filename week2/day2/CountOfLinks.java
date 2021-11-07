package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountOfLinks {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		
		// Goal is to find all the links in the page
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int size = allLinks.size();
		System.out.println(size);
		
		// findElements --> return type --> List<WebElement> (Multiple)
		// findElement --> return type --> WebElement (Single)
		
		// findElement --> NoSuchElementException
		// findElements --> do not throw any exception --> Empty List 
		
		// Locating one element --> Single WebElement if it is present
		// If it is not present --> NoSuchElementException
		
		/*
		 * Java -> when you like to store multiple same data type
		 * and that can have duplicates --> List !!
		 * 
		 * Get the count of the list --> size (method)
		 * 
		 */
		
	
		
		
		
	}

}
