package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
	
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
		
		//Click Create Contact
		driver.findElement(By.linkText("Create Contact")).click();
		
		//Type First Name
		driver.findElement(By.id("firstNameField")).sendKeys("Babu");

		//Type Last Name
		driver.findElement(By.id("lastNameField")).sendKeys("Manickam");
		
		// Select the currency using text
		WebElement currency = driver.findElement(By.id("createContactForm_preferredCurrencyUomId"));
		Select select = new Select(currency);
		select.selectByVisibleText("INR - Indian Rupee");
		
		// Select country using value
		WebElement country = driver.findElement(By.id("createContactForm_generalCountryGeoId"));
		Select select1 = new Select(country);
		select1.selectByValue("IND");

		//Click Create Contact Button
		driver.findElement(By.name("submitButton")).click();
		
		//Print the first name and browser title 
		String title = driver.getTitle();
		System.out.println(title);
		
		String text = driver.findElement(By.id("viewContact_firstName_sp")).getText();
		System.out.println(text);
		
		//Close the browser
		driver.close();
		
	}

}
