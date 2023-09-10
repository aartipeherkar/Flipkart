package assignment_webDriver_webElements;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class OrangeHRMTestNgAssignment1{
	WebDriver driver;
	

	@Test
	public void loginNT() throws InterruptedException {
		System.out.println("I am inside LoginNT");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);	
		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("Admin");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
        password.submit();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String expectedLogin = "OrangeHRM";
		String actualLogin;
		actualLogin = driver.getTitle();
        assertEquals(actualLogin,expectedLogin);
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am inside Before method");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("I am inside After  method");
		driver.quit();

	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("I am inside Before class");

	}

	@AfterClass
	public void afterClass() {
		System.out.println("I am inside  After class");

	}

}
