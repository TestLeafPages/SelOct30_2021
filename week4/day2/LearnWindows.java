package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindows {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		
		// You got a new window --> reference
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		
		// Click Home Button
		driver.findElement(By.id("home")).click();
		
		// Get all the window handles
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		// Convert Set to List --> Can i get the method?
		List<String> allHandles = new ArrayList<String>(allWindowHandles);
		
		// Switch to the second window
		driver.switchTo().window(allHandles.get(1));
		System.out.println(driver.getTitle());
		
		// Close all the window handles of the current session
		driver.quit();

	}

}
