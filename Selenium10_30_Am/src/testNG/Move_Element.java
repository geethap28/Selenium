package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Move_Element {
	WebDriver driver;

	@Test
	public void f() throws Exception {
	
		Actions actn = new Actions(driver);
		WebElement abtElem = driver.findElement(By.xpath("//div[text()='About']"));
		actn.moveToElement(abtElem).build().perform();

	}

	@BeforeClass
	public void beforeClass() throws Exception {
		driver.get("https://www.platformqedu.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@BeforeTest
	public void beforeTest()  {
		
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterTest
	public void afterTest() {
		Actions action = new Actions(driver);
		WebElement comElem = driver.findElement(By.xpath("//div[text()='Compare']"));
		action.click(comElem).build().perform();
			
	}
}
