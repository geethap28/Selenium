package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_13 {

	public static void main(String[] args) throws Exception {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='✕']")).click();
//Grocery section
		driver.findElement(By.xpath("//*[text()='Grocery']")).click();
		Thread.sleep(1000);
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement pincode = driver.findElement(By.name("pincode"));
		pincode.sendKeys("560096");
		pincode.sendKeys(Keys.ENTER);

//Snack & Beverages

		driver.findElement(
				By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[2]/a[1]/div[2]/div[1]/div[1]"))
				.click();
		Thread.sleep(2000);
//Biscuits section
		driver.findElement(
				By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[2]/a/div[2]/div[2]/div[2]/div/div/div[1]/a[1]"))
				.click();
// Adding Biscuits :
		driver.findElement(By.xpath(
				"//*[@id=\"container\"]/div/div[3]/div[2]/div[2]/div/div[3]/div/div[1]/div/div/div[3]/button[2]/span"))
				.click();
		driver.findElement(By.xpath("//*text()='Cart']")).click();

	}

}
