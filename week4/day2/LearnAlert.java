package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		
		// Click on Confirm Alert
		//driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		
		// Type the value
		driver.switchTo().alert().sendKeys("XYZ");
		
		// Switch to an alert and get the text
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		
		// Switch to an alert and click cancel
		driver.switchTo().alert().accept();
		
		// Find the result text (not inside alert)
		String text2 = driver.findElement(By.id("result1")).getText();
		System.out.println(text2);

	}

}
