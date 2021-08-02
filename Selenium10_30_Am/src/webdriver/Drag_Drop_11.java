package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_11 {

	public static void main(String[] args) throws Exception {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		//For Debit Side 
		WebElement fromBank=driver.findElement(By.xpath("//li[@id='credit2']/a"));
		WebElement toAccount=driver.findElement(By.xpath("//ol[@id='bank']/li"));
		act.dragAndDrop(fromBank, toAccount).build().perform();
		//Amt
		WebElement fromAmt=driver.findElement(By.xpath("//li[@id='fourth']/a"));
		WebElement toDebtAccount=driver.findElement(By.xpath("//ol[@id='amt7']/li"));
		act.dragAndDrop(fromAmt, toDebtAccount).build().perform();
		
		//For credit side
		WebElement fromSales=driver.findElement(By.xpath("//li[@id='credit1']/a"));
		WebElement toCredAccount=driver.findElement(By.xpath("//ol[@id='loan']/li"));
		act.dragAndDrop(fromSales, toCredAccount).build().perform();
		
		//amt
		WebElement fromSalesAmt=driver.findElement(By.xpath("//li[@id='fourth']/a"));
		WebElement toCredAmt=driver.findElement(By.xpath("//ol[@id='amt8']/li"));
		act.dragAndDrop(fromSalesAmt, toCredAmt).build().perform();
		
		String text= driver.findElement(By.xpath("//*[@id=\"equal\"]/a")).getText();
		System.out.println(text);
		
		
		
		
	}
}