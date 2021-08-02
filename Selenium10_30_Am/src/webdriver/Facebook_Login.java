package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login {

	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://fb.com");
		driver.manage().window().maximize();
	//	driver.navigate().to("https://ttdsevaonline.com/#/registration");
		driver.findElement(By.id("email")).sendKeys("abc123@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("abc1234");
		driver.findElement(By.name("login")).click();
		
	}

}
