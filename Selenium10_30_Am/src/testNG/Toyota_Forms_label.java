package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Toyota_Forms_label {
	WebDriver driver;

	@Test
	public void f() {
		String carname = driver.findElement(By.xpath("//*[@id=\"car_models\"]/div/ul/li[14]"))
				.getAttribute("data-display");
		System.out.println(carname);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@data-select='title']")).click();
		WebElement title = driver.findElement(By.xpath("//*[@data-value='Miss']"));
		title.click();
		String titleName= driver.findElement(By.xpath("//*[@data-select='title']")).getText();
		String fname = "Test";
		driver.findElement(By.name("firstname")).sendKeys(fname);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		String surName =titleName + fname + carname;
		driver.findElement(By.name("surname")).sendKeys(surName);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.findElement(By.name("email")).sendKeys("Test123@gmail.com");
	}

	@BeforeMethod
	public void beforeMethod() {
		driver.findElement(By.xpath("//*[@id=\"car_models\"]/div/ul/li[14]")).click();

	}

	@AfterMethod
	public void afterMethod() {
	
		driver.findElement(By.xpath("//*[@id=\"order_brochure\"]/div/form/div[7]/div[4]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"order_brochure\"]/div/form/div[7]/div[4]/div[1]/div[1]/label")).click();
	}

	@BeforeClass
	public void beforeClass() throws Exception {
		driver.findElement(By.id("tgbgdpr-overlay-agree")).click();
		Thread.sleep(2000);
	}

	@AfterClass
	public void afterClass() {
	}

	@BeforeTest
	public void beforeTest() {
		driver.get("http://forms-uat.toyotabeta.co.uk/brochure");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

	}

	@AfterTest
	public void afterTest() {
		driver.findElement(By.id("submit-br")).click();
	}

	@BeforeSuite
	public void beforeSuite() {

		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();

	}

	@AfterSuite
	public void afterSuite() {
	}

}
