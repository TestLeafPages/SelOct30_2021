package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/table.html");
		
		//to find the number of rows
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table_id']//tr"));
		int rowSize = rows.size();
		
		
		
		
		for (int i = 2; i <= rowSize; i++) {
			
			List<WebElement> tds = driver.findElements(By.xpath("//table[@id='table_id']//tr["+i+"]/td"));
			int tdSize = tds.size(); // number of td from 2nd row -> 6
						
			for(int j = 1 ; j <= tdSize; j++) {
				
				//i = 2 ; j = 1
				String text = driver.findElement(By.xpath("//table[@id='table_id']//tr["+i+"]/td["+j+"]")).getText();
				System.out.println(text);
			}
			
			
				
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
