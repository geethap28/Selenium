package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Move_element {

	public static void main(String[] args) throws Exception {
WebDriver driver;
System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://www.platformqedu.com/");
driver.manage().window().maximize();
Thread.sleep(3000);

//Move action
Actions actn=new Actions(driver);
WebElement abtElem=driver.findElement(By.xpath("//div[text()='About']"));
actn.moveToElement(abtElem).build().perform();

WebElement comElem=driver.findElement(By.xpath("//div[text()='Compare']"));
actn.click(comElem).build().perform();



	}

}
