package week4.day2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		
		// Request chrome to run in headless
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		
		// disable notifications
		options.addArguments("--disable-notifications");
		
		// pass the options into the constructor argument. 
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/s?k=Books&ref=nb_sb_noss_2");
		
		// Click on the first book
		driver.findElement(By.xpath("//a[@class='a-link-normal a-text-normal']")).click();
		
		// Switch to the second window
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("The number of windows are "+windowHandles.size());
		
		// Convert to List and switch
		List<String> allWindowHandles = new ArrayList<String>(windowHandles);
		driver.switchTo().window(allWindowHandles.get(1));
		
		// Print the title
		String title = driver.getTitle();
		System.out.println("The title of the new window is "+title);
		
		// Find the element
		WebElement ele = driver.findElement(By.id("img-canvas"));
		
		// Take a screenshot
		File source = driver.getScreenshotAs(OutputType.FILE);
		
		// Folder and file name
		File dest = new File("snaps/snap4.png");
		
		// Store it in your folder
		FileUtils.copyFile(source, dest);
		
		// Close all browsers
		driver.quit();
	}

}
