package demo.test;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.Test;

import com.sun.org.apache.xml.internal.security.utils.Base64;

import demo.base.BaseClass;

	public class Test1 extends BaseClass {

		@Test
		public void Test() throws InterruptedException {
			
			
			
			 driver.get("https://www.flipkart.com/");
			 try
			 {
				 if(driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).isDisplayed())
				 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			 }
			 catch(Exception e)
			 {
				 System.out.println("popup not found");
			 }
			 driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
			 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			 WebDriverWait webDriverWait = new WebDriverWait(driver,30);
			 WebElement form=driver.findElement(By.xpath("//div[@class='_36HLxm col col-3-5']//form"));
			 TimeUnit.SECONDS.sleep(5);
			 form.findElement(By.xpath("//div[@class='IiD88i _351hSN']//input[@type='text']")).sendKeys("9492324701");		
			 form.findElement(By.xpath("//input[@type='password']")).sendKeys("Lahari@1998");
			 form.findElement(By.xpath("//div[@class='_1D1L_j']//button[@type='submit']")).click();
			 TimeUnit.SECONDS.sleep(5);
			 if( driver.findElement(By.xpath("//div[contains(text(),'Lahari')]")).isDisplayed())
			 System.out.println("logged in");
			 
			 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			 
			 driver.close();
			 
			
		   
			 
			 
		}
		
		public void beforeMethod() {
			
		}

	}

