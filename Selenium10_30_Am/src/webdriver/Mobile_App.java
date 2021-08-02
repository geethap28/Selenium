package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mobile_App {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.toxbase.org/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.id("ctl00_ICOCookieNotification_hypButtonText")).click();
		// driver.switchTo().alert().accept();
		Actions act = new Actions(driver);

		String welcomeText = driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/div[3]/div/div[1]/div[1]/h1"))
				.getText();
		System.out.println(welcomeText);

		String infoText = driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/div[3]/div/div[1]/div[1]/h2")).getText();
		System.out.println(infoText);
//For Login
//		driver.findElement(By.id("ctl00_FullRegion_LoginBox_tbUserName")).sendKeys("Geetha");
//		driver.findElement(By.id("ctl00_FullRegion_LoginBox_tbPassword")).sendKeys("Geetha@123");
//		driver.findElement(By.id("ctl00_FullRegion_LoginBox_chkRemember")).click();
//		driver.findElement(By.id("ctl00_FullRegion_LoginBox_btnLogin")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/div[3]/div/div[1]/div[2]/div[1]/a")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
		//For Register
		
		driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/div[3]/div/div[1]/div[2]/div[3]/p[1]/a")).click();
		driver.findElement(By.id("ctl00_FullRegion_AddRegion_txbUnitName")).sendKeys("Geetha");
		driver.findElement(By.id("ctl00_FullRegion_AddRegion_txbUnitAddress1")).sendKeys("KR Puram Main Road");
		driver.findElement(By.id("ctl00_FullRegion_AddRegion_txbUnitAddress2")).sendKeys("ABC Hospital");
		driver.findElement(By.id("ctl00_FullRegion_AddRegion_txbUnitTown")).sendKeys("Banglore");		
		driver.findElement(By.id("ctl00_FullRegion_AddRegion_txbUnitPostcode")).sendKeys("560036");
		Select unit=new Select(driver.findElement(By.name("ctl00$FullRegion$AddRegion$ddlUKNHS")));
		unit.selectByVisibleText("No");		
		Select title=new Select(driver.findElement(By.name("ctl00$FullRegion$AddRegion$ddlApplicantTitle")));
		title.selectByVisibleText("Mrs");
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_FullRegion_AddRegion_txbApplicantFirstName")).sendKeys("Geetha1");
		driver.findElement(By.id("ctl00_FullRegion_AddRegion_txbApplicantSurname")).sendKeys("Pasam1");
		driver.findElement(By.id("ctl00_FullRegion_AddRegion_txbApplicantJobTitle")).sendKeys("Lab Technician");
		driver.findElement(By.id("ctl00_FullRegion_AddRegion_txbApplicatEmployer")).sendKeys("Apollo");
		driver.findElement(By.id("ctl00_FullRegion_AddRegion_txbApplicantEmail")).sendKeys("geetha1.apollo@gmail.com");
		driver.findElement(By.id("ctl00_FullRegion_AddRegion_cbConfirmBehalfOf")).click();
		driver.findElement(By.id("ctl00_FullRegion_AddRegion_cbConfirmClinTrained")).click();
		driver.findElement(By.id("ctl00_FullRegion_AddRegion_cbConfirmKeepContactDetails")).click();
		driver.findElement(By.id("ctl00_FullRegion_AddRegion_cbConfirmNewsLetter")).click();
		driver.findElement(By.id("ctl00_FullRegion_AddRegion_txbInfoInSupport"));
		Select hear=new Select(driver.findElement(By.id("ctl00_FullRegion_AddRegion_ddlHearAbout")));
		hear.selectByVisibleText("Poisons service");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_FullRegion_AddRegion_btnSubmit")).click();
		driver.navigate().to("https://www.toxbase.org/");
		
		
		
		
	}

}
