package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws Exception {
	  WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(" https://collegeweeklive.com/go-signup/");
		// maximize window
		driver.manage().window().maximize();
		// Wait time
		Thread.sleep(6000);

		driver.findElement(By.id("firstName")).sendKeys("Geetha");
		driver.findElement(By.id("lastName")).sendKeys("pasam");
		driver.findElement(By.id("emailAddress")).sendKeys("geetha123@gmail.com");
		driver.findElement(By.id("password")).sendKeys("geetha123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("geetha123");
		driver.findElement(By.id("phoneNumber")).sendKeys("1234567890");
		// selecting dropdown options :
		Select country = new Select(driver.findElement(By.id("country")));
		country.selectByVisibleText("UNITED STATES");
		Select name = new Select(driver.findElement(By.name("attendeeType")));
		name.selectByVisibleText("Student Looking for Graduate Degree");
		Select season = new Select(driver.findElement(By.id("questions[q_134]")));
		season.selectByVisibleText("Spring 2022");
		Select dobMonth=new Select(driver.findElement(By.id("questions_16_Month")));
		dobMonth.selectByVisibleText("September");
		Select dobDay=new Select(driver.findElement(By.id("questions_16_DayOfMonth")));
		dobDay.selectByVisibleText("18");
		Select dobYear=new Select(driver.findElement(By.id("questions_16_DOBYear")));
		dobYear.selectByVisibleText("1991");
		WebElement majorOfInt= driver.findElement(By.xpath("//*[@id=\"questions[q_19]\"]/div[1]"));
		majorOfInt.sendKeys("Architecture");
		//majorofint.selectByVisibleText("Architecture");
		driver.findElement(By.id("questions[q_135]")).click();
		driver.findElement(By.id("questions[q_136]")).click();
		driver.findElement(By.id("questions[q_137]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
	  
  }
}
