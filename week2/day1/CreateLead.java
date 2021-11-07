package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	
	/*
	 * Webdriver project does not allow you to 
	 * talk to an existing browser
	 * 
	 * 
	 */

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
		
		//Click Leads
		driver.findElement(By.linkText("Leads")).click();
		
		//Click Create Lead
		driver.findElement(By.linkText("Create Lead")).click();

		//Type Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		//Type First Name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Babu");

		//Type Last Name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Manickam");

		//Click Create Lead Button
		driver.findElement(By.name("submitButton")).click();
		
		// Verify that lead is created
		
		// V1: Check the title
		String title = driver.getTitle();
		System.out.println(title);
		
		// V2: Verify the status
		String text = driver.findElement(By.id("viewLead_statusId_sp")).getText();
		System.out.println(text);
		
		// Close the browser
		driver.close();
		
		
	}

}
