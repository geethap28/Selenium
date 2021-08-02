package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://naukri.com");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("err-border")).sendKeys("naukri123@gmail.com");
		driver.findElement(By.cssSelector("err-border")).sendKeys("naukri123");
		driver.findElement(By.className("btn-primary loginButton")).click();
		

	}

}
