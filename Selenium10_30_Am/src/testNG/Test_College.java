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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Test_College {

	WebDriver driver;

	@Test //5
	public void f() {

		Select dobMonth = new Select(driver.findElement(By.id("questions_16_Month")));
		dobMonth.selectByVisibleText("September");
		Select dobDay = new Select(driver.findElement(By.id("questions_16_DayOfMonth")));
		dobDay.selectByVisibleText("18");
		Select dobYear = new Select(driver.findElement(By.id("questions_16_DOBYear")));
		dobYear.selectByVisibleText("1991");

	}

	@BeforeMethod //4
	public void beforeMethod() {
		Select country = new Select(driver.findElement(By.id("country")));
		country.selectByVisibleText("UNITED STATES");
		Select name = new Select(driver.findElement(By.name("attendeeType")));
		name.selectByVisibleText("Student Looking for Graduate Degree");
		Select season = new Select(driver.findElement(By.id("questions[q_134]")));
		season.selectByVisibleText("Spring 2022");
	}

	@AfterMethod //6
	public void afterMethod() {
		WebElement majorOfInt = driver.findElement(By.xpath("//*[@id=\"questions[q_19]\"]/div[1]"));
		majorOfInt.sendKeys("Architecture");
	}

	@BeforeClass //3
	public void beforeClass() {
		driver.findElement(By.id("firstName")).sendKeys("Geetha");
		driver.findElement(By.id("lastName")).sendKeys("pasam");
		driver.findElement(By.id("emailAddress")).sendKeys("geetha123@gmail.com");
		driver.findElement(By.id("password")).sendKeys("geetha123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("geetha123");
		driver.findElement(By.id("phoneNumber")).sendKeys("1234567890");
	}

	@AfterClass //7
	public void afterClass() {
		driver.findElement(By.id("questions[q_135]")).click();
		driver.findElement(By.id("questions[q_136]")).click();
		driver.findElement(By.id("questions[q_137]")).click();
	}

	@BeforeTest //2
	public void beforeTest() throws Exception {
		driver.get("https://collegeweeklive.com/go-signup/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@AfterTest //8
	public void afterTest() {
		driver.findElement(By.id("submit")).click();
	}

	@BeforeSuite //1
	public void beforeSuite() {
		System.setProperty("webdriver.chrome.driver", ".//browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();

	}

	@AfterSuite //9
	public void afterSuite() {
		driver.quit();
	}

}
