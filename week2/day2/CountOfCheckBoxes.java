package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountOfCheckBoxes {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		
		// Goal is to find all the check boxes in the page
		List<WebElement> allChk = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(allChk.size());
		
		//driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		/*
		 * List --> If you want to get one of the element --> method (get)
		 */
		
		// I wanted to click on the first check box
		allChk.get(0).click();;
		
		// Click on the last one
		int size = allChk.size();
		allChk.get(size-1).click();
		
		Thread.sleep(2000);
		
		// Uncheck
		allChk.get(0).click();
		
		
	}

}
