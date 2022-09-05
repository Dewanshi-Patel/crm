package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_JUnit {
	
	WebDriver driver;
	
	@Before
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\drpra\\December2021_Selenium\\1st_Selenium_Class\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}	
	
	@Test
	public void loginTest() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
//		same operation but different elements
//		driver.findElement(By.className("btn btn-success block full-width")).click();
//		driver.findElement(By.id("Submit"));
		
		driver.findElement(By.partialLinkText("Bank & Cash")).click();
        driver.findElement(By.partialLinkText("Add New Account")).click();

		
		driver.findElement(By.id("Account Title")).sendKeys("Checking");
		driver.findElement(By.id("Description")).sendKeys("Personal");
		driver.findElement(By.id("Initial_Balance")).sendKeys("$50000.00");
		driver.findElement(By.id("Account_Number")).sendKeys("895674582");
		driver.findElement(By.id("Contact_Person")).sendKeys("James Bond");
		driver.findElement(By.id("Contact_Phone")).sendKeys("901-897-7584");
		driver.findElement(By.id("Submit"));
	}
	
	public void negloginTest() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123456");
		driver.findElement(By.name("login")).click();
	}
	
	@After
	public void tearDown() {
			driver.close();
			
}
		
		
}