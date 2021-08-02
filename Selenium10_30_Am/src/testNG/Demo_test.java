package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
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

public class Demo_test {
	WebDriver driver;

	@Test
	public void f() throws Exception {
		Select MN = new Select(driver.findElement(By.id("questions_16_Month")));
		MN.selectByVisibleText("July");
		Select Day = new Select(driver.findElement(By.id("questions_16_DayOfMonth")));
		Day.selectByVisibleText("11");
		Select Year = new Select(driver.findElement(By.id("questions_16_DOBYear")));
		Year.selectByVisibleText("1986");

	}

	@BeforeMethod
	public void beforeMethod() {
		Select country = new Select(driver.findElement(By.id("country")));
		country.selectByVisibleText("UNITED STATES");
		Select am = new Select(driver.findElement(By.name("attendeeType")));
		am.selectByVisibleText("Student Looking for Graduate Degree");
		Select AS = new Select(driver.findElement(By.id("questions[q_134]")));
		AS.selectByVisibleText("Fall 2021");

	}


	  @AfterMethod
	  public void afterMethod() {
		WebElement majorOfInt = driver.findElement(By.xpath("//*[@id=\"questions[q_19]\"]/div[1]"));
		majorOfInt.sendKeys("Computer and information sciences");
	}

	@BeforeClass
	public void beforeClass() {
		driver.findElement(By.id("firstName")).sendKeys("jaanu");
		driver.findElement(By.id("lastName")).sendKeys("K");
		driver.findElement(By.id("emailAddress")).sendKeys("jaanu06@gmail.com");
		driver.findElement(By.id("phoneNumber")).sendKeys("8092663344");
		driver.findElement(By.id("password")).sendKeys("Jashri@06");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Jashri@06");

	}

	@AfterClass
	public void afterClass() {
		driver.findElement(By.id("questions[q_135]")).click();
		driver.findElement(By.id("questions[q_136]")).click();
		driver.findElement(By.id("questions[q_137]")).click();

	}

	@BeforeTest
	public void beforeTest() throws InterruptedException {
		driver.get("https://collegeweeklive.com/go-signup/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

	}

	@AfterTest
	public void afterTest() {
		driver.findElement(By.id("submit")).click();
	}

	@BeforeSuite
	public void beforeSuite() {
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("The setup process is completed");
	}

	@AfterSuite
	public void afterSuite() {
		driver.quit();
	}
}
