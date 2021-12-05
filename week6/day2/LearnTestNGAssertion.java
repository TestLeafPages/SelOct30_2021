package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnTestNGAssertion {
	
	@Test
	public void login() {
		//Leaftaps - TestLeaf Automation Platform
		String expTitle = "TestLeaf Automation Platform";
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		
		//to verify title
		String actTitle = driver.getTitle();
		
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actTitle, expTitle);
		
		//Hard Assert
			
		//Assert.assertEquals(actTitle, expTitle);
		
		//Assert.assertTrue(displayed); //true -> pass ; false - fail
		//Assert.assertFalse(displayed) ; //false -> pass ; true - fail
		
		
		
		/*
		 * if(expTitle.equals(actTitle)) { System.out.println("matching"); } else {
		 * System.out.println("not matching"); }
		 */
		
		System.out.println("End of program");
		
		//to consolidate the assertions
		//softAssert.assertAll();
		

	}

}
