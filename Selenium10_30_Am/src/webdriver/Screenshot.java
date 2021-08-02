package webdriver;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws Exception {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.xe.com/");
		driver.manage().window().maximize();
		
	
		

		File f =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f,new File(".//Screenshots/xe.PNG"));
		FileHandler.copy(f,new File(".//Screenshots/xe.JPEG"));
		FileHandler.copy(f,new File(".//Screenshots./xe.PNG"));
	}

}
