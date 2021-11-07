package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindContact {
	
	public static void main(String[] args) {

		// Step 1: Download and attach the chrome driver to this test case
		WebDriverManager.chromedriver().setup();
		
		// Step 2: Launch the chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		// Step 3: Load the URL
		driver.get("http://leaftaps.com/opentaps/");
		
		// Step 4: Maximize the browser 
		driver.manage().window().maximize();
		
		// Step 5: Find the user name and enter the data
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		// Step 6: Find the password and enter the data
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		// Step 7: Find the Login button and click
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Step 8: Click CRM/SFA 
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click Contacts Tab
		driver.findElement(By.linkText("Contacts")).click();
		
		//Click Find Contacts
		driver.findElement(By.linkText("Find Contacts")).click();
		
		//Click Email Tab
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		
		//Type email as babu@testleaf.com
		driver.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");
		
		//Click Find Contacts
		driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
		
		//Close the browser
		//driver.close();
		
		
		
		
		
		
	}

}
