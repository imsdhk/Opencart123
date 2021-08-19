package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.HomePage;

public class TC_001_AccountRegistration {
	
	
	WebDriver driver; 
	
	
	
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
		
	}
	
	
	@Test
	public void test_account_Registration() {
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		HomePage hp = new HomePage(driver);
		
	}
	
	
	
	@AfterClass
	public void tearDown() {
		
	}

}
