package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {

	WebDriver driver;

	@Before
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\drpra\\December2021_Selenium\\1st_Selenium_Class\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			}

	@Test
	public void loginTest() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();

		driver.findElement(By.partialLinkText("Bank & Cash")).click();
		driver.findElement(By.partialLinkText("New Account")).click();

		driver.findElement(By.id("account")).sendKeys("Savings");
		driver.findElement(By.id("description")).sendKeys("Personal");
		driver.findElement(By.id("balance")).sendKeys("$30000000.00");
		driver.findElement(By.id("account_number")).sendKeys("48955195567");
		driver.findElement(By.id("contact_person")).sendKeys("Jeff Bezos");
		driver.findElement(By.id("contact_phone")).sendKeys("702-897-7584");
		driver.findElement(By.id("ib_url")).sendKeys("www.techfios.com");
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("button.btn-primary")).click();

//		driver.findElement(By.id("submit")).submit();
		Thread.sleep(5000);

	}
//	
//	public void negloginTest() {
//		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
//		driver.findElement(By.id("password")).sendKeys("abc123456");
//		driver.findElement(By.name("login")).click();
//	}
//	
//	@After
//	public void tearDown() {
//	driver.close();

}
