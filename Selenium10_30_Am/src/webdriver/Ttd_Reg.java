package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ttd_Reg {

	public static void main(String[] args) throws Exception {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ttdsevaonline.com/#/registration");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		driver.findElement(By.name("fName")).sendKeys("Jashri");
		driver.findElement(By.name("lName")).sendKeys("kalinati");
		driver.findElement(By.name("mobNo")).sendKeys("1234567890");
		driver.findElement(By.id("regdob")).click();
		Select month = new Select(driver.findElement(By.xpath("//select[@title='Change the month']")));
		month.selectByVisibleText("December");
		Select year = new Select(driver.findElement(By.xpath("//select[@title='Change the year']")));
		year.selectByVisibleText("1992");
		driver.findElement(By.xpath("//a[contains(text(),'28')]")).click();
		WebElement gender = driver.findElement(By.xpath("(//input[@name='gender'])[2]"));
		gender.click();
		driver.findElement(By.name("address1")).sendKeys("Tirupati");
		driver.findElement(By.name("address2")).sendKeys("Puttur");
		driver.findElement(By.name("cityS")).sendKeys("Tirumala");
		Select country = new Select(driver.findElement(By.name("countryS")));
		country.selectByVisibleText("India");
		Select state = new Select(driver.findElement(By.name("stateS")));
		state.selectByVisibleText("Andhra Pradesh");
		driver.findElement(By.name("zipCode")).sendKeys("123456");
		Select idproof = new Select(driver.findElement(By.name("proofS")));
		idproof.selectByVisibleText("Aadhaar Card");
		driver.findElement(By.name("proofId")).sendKeys("123456789123");
		driver.findElement(By.name("emailId")).sendKeys("jashri123@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Jashri123");
		driver.findElement(By.name("repassword")).sendKeys("Jashri123");
		driver.findElement(By.id("regi_continue")).click();

		String alertmsg = driver.findElement(By.xpath("//*[@id=\"ErrorMessagePopUp\"]/div[1]/div/div/div[1]")).getText();
		System.out.println(alertmsg);

	}
}