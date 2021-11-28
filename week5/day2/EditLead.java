package week5.day2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EditLead extends BaseHooks {

	@Test(dataProvider = "sendData")
	public void runEditLead(String company, String phNo) throws InterruptedException {

		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phNo);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(company);
		driver.findElement(By.name("submitButton")).click();

	}
	
	@DataProvider
	public String[][] sendData() throws IOException {
		ReadExcel re = new ReadExcel();
		String[][] readData = re.readData("EditLead");
		return readData;

	}

}
