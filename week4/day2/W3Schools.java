package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W3Schools {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// 2) Click on Try It Button (Hint: It is inside a frame)
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//3) Switch to the alert
		Alert alert = driver.switchTo().alert();
		
		//4) Type your name on the alert
		alert.sendKeys("Babu");
		
		//5) Click Ok on the alert
		alert.accept();
		
		//6) Get the text appearing on the browser
		String text = driver.findElement(By.id("demo")).getText();
		
		//7) Check if your name exist there !!
		if(text.contains("Babu"))
			System.out.println("Successful");
		else
			System.out.println("Missing name");

	}

}
