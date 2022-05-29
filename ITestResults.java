package IBM.testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import graphql.Assert;


public class ITestResults {
	static WebDriver driver;
	
	
	
		@Test
		public void noor05() {
			
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver.exe");
		
		 driver = new ChromeDriver();
		 driver.get("https://www.toolsqa.com/");
		 driver.findElement(By.id("sdsd"));
		
		}
		 
		@Test
		public void noor0507() throws InterruptedException {
		
		driver.navigate().to("https://www.toolsqa.com/cucumber-tutorial/");
		 Thread.sleep(5000);
		 
		
		}
		
		
		@AfterMethod
		private void tearDown(ITestResult result) throws Throwable {
			
			if (ITestResult.FAILURE==result.getStatus()) {
				System.out.println("Failed Test Cases");
				Check2.screenshot1(driver, result.getName());
			}
			else if (ITestResult.SUCCESS==result.getStatus()) {
				System.out.println("Testcase passed Sucessfully");
				Check2.screenshot1(driver, result.getName());
			}
			driver.quit();
			

		}




	}
	
