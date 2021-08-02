package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BlazeDemo_16 {
  @Test
  public void f() throws Exception {
	  WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://blazedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		Select depCity = new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
		depCity.selectByVisibleText("Boston");

		Select destCity = new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
		destCity.selectByVisibleText("Berlin");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();

		driver.findElement(By.xpath("//tbody/tr[2]/td[1]/input[1]")).click();
		
		//Valid Data 
		driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Geethanjali");
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("20,A main st");
		driver.findElement(By.id("city")).sendKeys("Banglore");
		driver.findElement(By.id("state")).sendKeys("Karnataka");
		driver.findElement(By.id("zipCode")).sendKeys("560036");
		Select cardType=new Select(driver.findElement(By.id("cardType")));
		cardType.selectByVisibleText("American Express");
		driver.findElement(By.id("creditCardNumber")).sendKeys("123456789012");
		driver.findElement(By.id("creditCardMonth")).sendKeys("12");
		driver.findElement(By.id("creditCardYear")).sendKeys("2023");
		driver.findElement(By.id("nameOnCard")).sendKeys("Geetha");
		driver.findElement(By.id("rememberMe")).click();
		
		driver.findElement(By.xpath("//body/div[2]/form[1]/div[11]/div[1]/input[1]")).click();
		Thread.sleep(2000);
		

		String otherMsgDetails= driver.findElement(By.xpath("//body/div[2]/div[1]")).getText();
		System.out.println(otherMsgDetails);
		driver.quit();
  }
}
