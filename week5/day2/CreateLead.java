package week5.day2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseHooks {

	@Test(dataProvider = "sendData")
	public void runCreateLead(String company, String firstName, String lastName, String phNo) {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
		driver.findElement(By.name("submitButton")).click();

	}

	@DataProvider
	public String[][] sendData() throws IOException {
		ReadExcel re = new ReadExcel();
		String[][] readData = re.readData("CreateLead");
		return readData;

	}

}
