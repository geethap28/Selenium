package testNG;

import org.testng.annotations.Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FB_LoginTest {
	WebDriver driver;

	@Test(dataProvider = "dp")
	public void f(String g, String s) throws Exception {
		driver.get("https://fb.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys(g);
		driver.findElement(By.id("pass")).sendKeys(s);
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { 
			    new Object[] { "gee123@gmail.com", "gee123" },
				new Object[] { "jgee143@gmail.com", "jee143" },
				new Object[] { "jaanu06@gmail.com", "janu@06" },
				};
	}

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
