package demo.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import demo.base.BaseClass;

public class Test2 extends BaseClass {
	
	public By myAccount = By.xpath("//div[contains(@class,'dropdown-login')]//a");
	public By signUp = By.xpath("//a[contains(text(),'Sign Up')]");
	public By firstName = By.xpath("//input[contains(@name,'firstname')]");
	public By lastName = By.xpath("//input[contains(@name,'lastname')]");
	public By phone = By.xpath("//input[contains(@name,'phone')]");
	public By email = By.xpath("//input[contains(@name,'email')]");
	public By password = By.xpath("//input[contains(@name,'password')]");
	public By confirmpassword = By.xpath("//input[contains(@name,'confirmpassword')]");
	public By signUpBtn = By.xpath("//button[contains(text(),'Sign Up')]");
	public By welcome = By.xpath("//h3[contains(text(),'Hi')]");
	public By homeTab = By.xpath("//a[@title='home']");
	
	@Test
	public void Test() throws InterruptedException {
		driver.get("https://www.phptravels.net/home");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		System.out.println("Url loaded: https://www.phptravels.net/home");
		driver.findElement(myAccount).click();
		System.out.println("Element "+myAccount+" is clicked");
		driver.findElement(signUp).click();
		System.out.println("Element "+signUp+" is clicked");
		driver.findElement(firstName).sendKeys("First");
		System.out.println("First is send to element "+firstName);
		driver.findElement(lastName).sendKeys("Last");
		System.out.println("Last is send to element "+lastName);
		driver.findElement(phone).sendKeys("9746367876");
		System.out.println("9746367876 is send to element "+phone);
		String randomEmail = randomEmailGenerator();
		driver.findElement(email).sendKeys(randomEmail);
		System.out.println(randomEmail+" is send to element "+email);
		driver.findElement(password).sendKeys("123456789");
		System.out.println("123456789 is send to element "+password);
		driver.findElement(confirmpassword).sendKeys("123456789");
		System.out.println("123456789 is send to element "+confirmpassword);
		TimeUnit.SECONDS.sleep(5);
		clickUsingJavaScriptExecutor(signUpBtn);
		System.out.println("Element "+signUpBtn+" is clicked");	
		TimeUnit.SECONDS.sleep(5);
		driver.findElement(welcome).isDisplayed();
		System.out.println("Account Created Successfully with: "+randomEmail);
		driver.findElement(homeTab).click();
		System.out.println("Element "+homeTab+" is clicked");	
	}

}
