package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMsg {

	public static void main(String[] args) throws Exception {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(" https://demoqa.com/alerts");
		driver.manage().window().maximize();

		// 1st Alert Msg :
		Thread.sleep(3000);
		driver.findElement(By.id("alertButton")).click();
		String AlertMsg = driver.switchTo().alert().getText();
		System.out.println(AlertMsg);
		driver.switchTo().alert().accept();

		// 2nd Alert Msg :
		Thread.sleep(5000);
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(5000);
		String TimerAlertMsg = driver.switchTo().alert().getText();
		System.out.println(TimerAlertMsg);
		driver.switchTo().alert().accept();

		// 3rd Alert Msg :
		Thread.sleep(3000);
		driver.findElement(By.id("confirmButton")).click();
		String ConfirmAlertMsg = driver.switchTo().alert().getText();
		System.out.println(ConfirmAlertMsg);
		driver.switchTo().alert().accept();
		String OkBtnMsg = driver.findElement(By.xpath("//*[@id=\"confirmResult\"]")).getText();
		System.out.println(OkBtnMsg);

		// 4th Alert Msg :
		Thread.sleep(3000);
		driver.findElement(By.id("promtButton")).click();
		String PromtAlertMsg = driver.switchTo().alert().getText();
		System.out.println(PromtAlertMsg);
		driver.switchTo().alert().accept();
		
//		String UserNameMsg= driver.findElement(By.xpath("//*[@id=\"promptResult\"]")).getText();
//		System.out.println(UserNameMsg);
		//driver.switchTo().alert().dismiss();

	}

}
