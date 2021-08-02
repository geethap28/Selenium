package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Toyota_forms {
	WebDriver driver;

	@Test
	public void f() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://forms-uat.toyotabeta.co.uk/brochure");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		driver.findElement(By.id("tgbgdpr-overlay-agree")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"car_models\"]/div/ul/li[14]")).click();
		String carname = driver.findElement(By.xpath("//*[@id=\"car_models\"]/div/ul/li[14]"))
				.getAttribute("data-display");
		System.out.println(carname);
	}

	

}
