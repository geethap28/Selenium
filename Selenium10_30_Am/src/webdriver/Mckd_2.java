package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mckd_2 {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.mckd.gov.ae/en/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		Actions abt = new Actions(driver);
		// For About Module
		driver.findElement(By.xpath("//*[@id=\"menu-item-36\"]/a")).click();
		String title = driver.getTitle();
		System.out.println(title);
		String curUrl = driver.getCurrentUrl();
		System.out.println(curUrl);
//		WebElement aboutMinistry = driver.findElement(By.xpath("//h3[text()='About the Ministry']"));
//		abt.click(aboutMinistry).build().perform();
//		WebElement visionMiss = driver.findElement(By.xpath("//a[text()='Vision and Mission']"));
//		abt.click(visionMiss).build().perform();
//		WebElement stratObj = driver.findElement(By.xpath("//a[text()='Strategic Objectives']"));
//		abt.click(stratObj).build().perform();
//		WebElement cultureSector = driver.findElement(By.xpath("//a[text()='Cultural Sectors']"));
//		abt.click(cultureSector).build().perform();
		Thread.sleep(2000);

		// For Services Module
		driver.findElement(By.xpath("//*[@id=\"menu-item-51\"]/a")).click();
		String servUrl = driver.getCurrentUrl();
		System.out.println(servUrl);
		String servTitle = driver.getTitle().toUpperCase();
		System.out.println(servTitle);
		Thread.sleep(2000);
		
		// For Projects Module
		driver.findElement(By.xpath("//*[@id=\"menu-item-41\"]/a")).click();	
		String projTitle = driver.getTitle().toLowerCase();
		System.out.println(projTitle);
		String prjUrl = driver.getCurrentUrl().toUpperCase();
		System.out.println(prjUrl);
		Thread.sleep(2000);
		

		// For Media Module
		driver.findElement(By.xpath("//*[@id=\"menu-item-42\"]/a")).click();
		String mediaTitle = driver.getTitle();
		System.out.println(mediaTitle);
		String medUrl = driver.getCurrentUrl();
		System.out.println(medUrl);
		Thread.sleep(2000);

		// For OpenData Module
		driver.findElement(By.xpath("//*[@id=\"menu-item-65\"]/a")).click();
		String openTitle = driver.getTitle();
		System.out.println(openTitle);
		String openUrl = driver.getCurrentUrl().toLowerCase();
		Thread.sleep(2000);
		System.out.println(openUrl);

		// For E-participation Module
		driver.findElement(By.xpath("//*[@id=\"menu-item-63\"]/a")).click();
		String particTitle = driver.getTitle();
		System.out.println(particTitle);
		String partUrl = driver.getCurrentUrl();
		System.out.println(partUrl);
		Thread.sleep(2000);

	}

}
