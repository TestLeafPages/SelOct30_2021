package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends BaseClass{
	
	/*
	 * public ChromeDriver driver;
	 * 
	 * @Given("Open the chrome browser") public void openBrowser() {
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); }
	 * 
	 * @Given("Load the application url") public void loadApplicationUrl() {
	 * driver.get("http://leaftaps.com/opentaps"); }
	 */

	@Given("Enter the username as {string}")
	public void enterUserName(String uName) {
		System.out.println(driver);
		driver.findElement(By.id("username")).sendKeys(uName);
	}

	@Given("Enter the password as {string}")
	public void enterPassword(String pWord) {
		driver.findElement(By.id("password")).sendKeys(pWord);
	}

	@When("Click on Login button")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("Homepage should be displayed")
	public void verifyHomePage() {
		String actTitle = driver.getTitle();
		Assert.assertEquals(actTitle, "Leaftaps - TestLeaf Automation Platform");
		
	}
	
	@But("Error message should be displayed")
	public void verifyErrorMessage() {
		System.out.println("Error message is displayed");

	}
	
	
	

}
