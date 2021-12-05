package week5.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseHooks {
	
	public ChromeDriver driver;
	
	public String excelFileName; //initial value is null
	
	@DataProvider(indices = 0)
	public String[][] sendData() throws IOException {
		String[][] readData = ReadExcel.readData(excelFileName);
		return readData;

	}
	
	@Parameters({"username","password","url"}) //name should be correct;order can be anything
	@BeforeMethod(alwaysRun = true)
	public void setup(String uName, String pWord, String url) {//order should be correct; name can be anything
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pWord);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();

	}
	
	
	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		driver.close();

	}

}
