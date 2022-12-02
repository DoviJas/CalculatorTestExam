package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;

public class testsParameters {
	
	protected static WebDriver driver;
	
	@BeforeTest
	public static void Setup() {
		
		driver = new ChromeDriver();
		driver.navigate().to("http://localhost:8080");
		driver.manage().window().maximize();
	}
	
	@AfterSuite
	public void TearDown() {
		driver.close();
	}

}
