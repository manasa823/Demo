package demo.base;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
  public WebDriver driver;
  public String path = "C:\\Users\\manasa.channamaraju\\Downloads\\chromedriver_win32(1)\\chromedriver.exe";
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", path);
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("--incognito");
	  options.addArguments("--start-maximized");
	  driver = new ChromeDriver(options);
  }
  
  public void clickUsingJavaScriptExecutor(By locator) {
	  JavascriptExecutor executor = (JavascriptExecutor)driver;
	  executor.executeScript("arguments[0].click();", driver.findElement(locator));
  }
  
  public String randomEmailGenerator() {
  int leftLimit = 97; // letter 'a'
  int rightLimit = 122; // letter 'z'
  int targetStringLength = 6;
  Random random = new Random();
  StringBuilder buffer = new StringBuilder(targetStringLength);
  for (int i = 0; i < targetStringLength; i++) {
      int randomLimitedInt = leftLimit + (int) 
        (random.nextFloat() * (rightLimit - leftLimit + 1));
      buffer.append((char) randomLimitedInt);
  }
  buffer.append("@gmail.com");
  String generatedString = buffer.toString();
  System.out.println(generatedString);
  return generatedString;
}
}
