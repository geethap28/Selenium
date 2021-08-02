package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calendar_15 {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://tirupatibalaji.ap.gov.in/#/registration");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.id("regdob")).click();
		Select month = new Select(driver.findElement(By.xpath("//select[@title='Change the month']")));
		month.selectByVisibleText("December");
		Select year = new Select(driver.findElement(By.xpath("//select[@title='Change the year']")));
		year.selectByVisibleText("1992");
		driver.findElement(By.xpath("//a[contains(text(),'28')]")).click();

		WebElement gender = driver.findElement(By.xpath("(//input[@name='gender'])[2]"));
		gender.click();

	}
}
