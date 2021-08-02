package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_GetAttribute {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://duckduckgo.com");
		driver.manage().window().maximize();
		Thread.sleep(7000);

	driver.findElement(By.name("q")).sendKeys("selenium");
		
		String attr = driver.findElement(By.name("q")).getAttribute("value");
		System.out.println(attr);
	}

}
