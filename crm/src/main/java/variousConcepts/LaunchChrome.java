package variousConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class LaunchChrome {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\drpra\\December2021_Selenium\\1st_Selenium_Class\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		
		
		
		driver.findElement(By.partialLinkText("Bank & Cash")).click();

		
	
        driver.findElement(By.linkText("Add New Account")).click();

		
		driver.findElement(By.id("Account Title")).sendKeys("Checking");
		driver.findElement(By.id("Description")).sendKeys("Personal");
		driver.findElement(By.id("Initial Balance")).sendKeys("$50000.00");
		driver.findElement(By.id("Account Number")).sendKeys("895674582");
		driver.findElement(By.id("Contact Person")).sendKeys("James Bond");
		driver.findElement(By.id("Phone")).sendKeys("901-897-7584");
		
		
		

		
		
	
	
	
	
	}
}
