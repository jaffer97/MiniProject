package org.task.com;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MiniProject {
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("email_create")).sendKeys("jaffu@yaoo.com"); //login
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//i[@class='icon-user left']")).click();
		Thread.sleep(3500);
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("id_gender1")).click();   //gender
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("customer_firstname")).sendKeys("Jaffer");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("customer_lastname")).sendKeys("Ali I");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("passwd")).sendKeys("Yahoo@123");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement d = driver.findElement(By.id("days"));
		Select s = new Select(d);
		s.selectByValue("10");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);;
		
		WebElement m = driver.findElement(By.id("months"));
		Select ss = new Select(m);
		ss.selectByValue("8");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);;
		
		WebElement y = driver.findElement(By.id("years"));
		Select sss = new Select(y);
		sss.selectByValue("1997");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);;
	
		driver.findElement(By.id("newsletter")).click();
		Thread.sleep(1000);
	
		driver.findElement(By.id("optin")).click();
		Thread.sleep(1000);
	
//		driver.findElement(By.id("firstname")).sendKeys("Sharafath");
//		Thread.sleep(1000);
	
//		driver.findElement(By.id("firstname")).sendKeys("Ali");
//		Thread.sleep(1000);
	
		
		driver.findElement(By.id("company")).sendKeys("Greens Technology");
		Thread.sleep(2000);
		
		driver.findElement(By.id("address1")).sendKeys("Gandhi Nagar, chennai 28");
		Thread.sleep(1000);
		

		driver.findElement(By.id("address2")).sendKeys("Anna Nagar, chennai 28");
		Thread.sleep(1000);
		

		driver.findElement(By.id("city")).sendKeys("Chennai Porur");
		Thread.sleep(1000);
		
		WebElement st = driver.findElement(By.id("id_state"));
		Select df = new Select(st);
		df.selectByValue("32");
		

		driver.findElement(By.id("postcode")).sendKeys("12345");
		Thread.sleep(1000);
		
		driver.findElement(By.id("other")).sendKeys("Float like a butterfly String Like a Bee");
		Thread.sleep(2000);
		
		driver.findElement(By.id("phone")).sendKeys("12345678");
		Thread.sleep(1000);
	
	
		driver.findElement(By.id("phone_mobile")).sendKeys("67672828");
		Thread.sleep(1000);
	
		WebElement add = driver.findElement(By.id("alias"));
		add.clear();
		add.sendKeys("Marina");
		Thread.sleep(1000);
	
//		driver.findElement(By.id("submitAccount")).click();
//		Thread.sleep(4000);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screen = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium_Concepts\\ScreenShotss\\on2.png");
		FileUtils.copyFile(screen, f);
		
		Thread.sleep(2000);
	}
	
}