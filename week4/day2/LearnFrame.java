package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		
		// Switch to the parent frame
		driver.switchTo().frame(1);
		
		// Switch to the frame
		driver.switchTo().frame("frame2");
		
		// Find and click
		driver.findElement(By.id("Click1")).click();
		
		// Living inside and come out of all frames
		driver.switchTo().defaultContent();
		
		// Print the header content
		String text = driver.findElement(By.tagName("h1")).getText();
		System.out.println(text);
	}

}
