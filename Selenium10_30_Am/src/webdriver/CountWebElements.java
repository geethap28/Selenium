package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountWebElements {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://tirupatibalaji.ap.gov.in/#/registration");
		driver.manage().window().maximize();
		
		//count Radio Buttons
		List<WebElement> radiobtn= driver.findElements(By.xpath("//*[@type='radio']"));
		System.out.println(radiobtn);
	}

}
