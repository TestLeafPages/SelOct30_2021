package week5.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateLead extends BaseHooks{

	@Test(invocationCount = 1)
	public void createLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber1")).sendKeys("9900");
		driver.findElement(By.name("submitButton")).click();
	}
}






