package org.task.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyInput;
import org.openqa.selenium.support.ui.Select;

public class MiniProject2 {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(2000);
		
				
		driver.findElement(By.xpath("//a[@class='login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("Jaffer@yahoo.com");
		Thread.sleep(3000);
		driver.findElement(By.id("passwd")).sendKeys("Yahoo@123");
		Thread.sleep(2000);
		driver.findElement(By.id("SubmitLogin")).click();
		Thread.sleep(1000);
		
		Actions a = new Actions(driver);
		WebElement women = driver.findElement(By.xpath("//a[.='Women']"));
		a.moveToElement(women).build().perform();	
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[.='Evening Dresses']")).click(); 
		Thread.sleep(5000);
		
		WebElement img = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
		img.click();
		Thread.sleep(3000);
		
		
//		WebElement inc = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		WebElement qty = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		a.moveToElement(qty).perform();
		for (int i = 0; i < 5; i++) {
			qty.click();
			Thread.sleep(1000);
		}
		
		
		//		inc.click();
//		inc.click();
//		inc.click();
//		Thread.sleep(2000);
//		
		
		WebElement id = driver.findElement(By.id("group_1"));
		Select s = new Select(id);
		s.selectByValue("2");
		Thread.sleep(2000);
		
		driver.findElement(By.id("color_24")).click();
		Thread.sleep(2000);
	
		driver.findElement(By.name("Submit")).click();		//add to cart
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//span[contains(.,'Proceed to checkout')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[.='Proceed to checkout']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[.='Proceed to checkout']")).click();
		Thread.sleep(2000);
		
			
		driver.findElement(By.id("cgv")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("processCarrier")).click();
		Thread.sleep(4000);
		
		
		driver.findElement(By.xpath("//a[@class='bankwire']")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//span[.='I confirm my order']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title='Back to orders']")).click();
		Thread.sleep(3000);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File s1 = ts.getScreenshotAs(OutputType.FILE);
		File s2 = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium_Concepts\\Screenshot\\dress.png");
		FileUtils.copyFile(s1, s2);
		
	}

}
