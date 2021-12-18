package week8.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSpecificException {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		try {
			driver.findElement(By.className("decorativeSubmit123")).click();
		} catch (StaleElementReferenceException e) {
			Thread.sleep(2000);
			driver.findElement(By.className("decorativeSubmit")).click();
		}
		finally {
			driver.close();
		}
		
		
		System.out.println("End of program");

	}

}
