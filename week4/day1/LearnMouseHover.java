package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnMouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
		
		WebElement prime = driver.findElement(By.xpath("//span[text()='Prime']"));
		
		
		//Create object for Actions class and pass the driver as argument
		Actions builder = new Actions(driver);
		builder.moveToElement(prime).perform(); //perform() at the end of action.
		
		
		
		
		
		
		
		

	}

}
