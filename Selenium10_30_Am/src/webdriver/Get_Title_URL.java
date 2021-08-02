package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Title_URL {

	public static void main(String[] args) throws Exception {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(" https://tirupatibalaji.ap.gov.in/#/login");
		driver.manage().window().maximize();
		// Get the URL & Title for Login Page:
		String cur_url=driver.getCurrentUrl();
		System.out.println("Login URL :" +cur_url );
		String logtitle= driver.getTitle();
		System.out.println("Current Title :" + logtitle);
		
		Thread.sleep(5000);
		// Get the URL & Title for SignUp Page:
		driver.findElement(By.linkText("Sign Up")).click();
		String signcur_url= driver.getCurrentUrl();
		System.out.println("SignUp URL :" + signcur_url);
		String signuptitle=driver.getTitle();
		System.out.println("SignUp Title :" +signuptitle );
		
		
		if((cur_url).equals(signcur_url)) {
			System.out.println("Page was not successfully redirected");
		}
		else {
			System.out.println("Login Page was successfully redirected to Registration Page");
		}
		
	}

}
