package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationErr {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(" https://collegeweeklive.com/go-signup/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("submit")).click();

//GetText Method 
		Thread.sleep(4000);
		String FrstNamErr = driver.findElement(By.id("firstNameError")).getText();
		System.out.println(FrstNamErr);
		String LastNamErr = driver.findElement(By.id("lastNameError")).getText();
		System.out.println(LastNamErr);
		String EmailErr = driver.findElement(By.id("emailAddressError")).getText();
		System.out.println(EmailErr);
		String PhNumErr = driver.findElement(By.id("phoneNumberError")).getText();
		System.out.println(PhNumErr);
		String PwdErr = driver.findElement(By.id("passwordError")).getText();
		System.out.println(PwdErr);
		String ConfPwdErr = driver.findElement(By.id("ConfirmPasswordError")).getText();
		System.out.println(ConfPwdErr);
		String NatnErr = driver.findElement(By.id("nationalityError")).getText();
		System.out.println(NatnErr);
		String AttenTypErr = driver.findElement(By.id("attendeeTypeError")).getText();
		System.out.println(AttenTypErr);
		String QueErr = driver.findElement(By.id("questions_137Error")).getText();
		System.out.println(QueErr);

	}

}
