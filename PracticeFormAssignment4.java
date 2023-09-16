package assignment_webDriver_webElements;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class PracticeFormAssignment4 {
	WebDriver driver;

	@Test
	public void studentResistrationForm() throws InterruptedException {
		driver.get("https://demoqa.com/automation-practice-form");
		WebElement firstName = driver.findElement(By.id("firstName"));
		firstName.sendKeys("Priyanka");
		WebElement lastName = driver.findElement(By.id("lastName"));
		lastName.sendKeys("Chavan");
		driver.findElement(By.id("userEmail")).sendKeys("chavanpriyu17@gamil.com");
		driver.findElement(By.xpath("//label[text() ='Female']")).click();
		driver.findElement(By.id("userNumber")).sendKeys("2335656641");
		driver.findElement(By.id("subjectsInput")).sendKeys("Basic automation");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Reading']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("currentAddress")).sendKeys("Pimpri-chinchawad,Pune-MH-12");
		//driver.findElement(By.id("uploadPicture")).isSelected();
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\admin\\OneDrive\\Desktop\\vijaysig.jpeg");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[text()='Select State']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Rajasthan']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Select City']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Jaipur']")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("dateOfBirthInput")).clear();
		driver.findElement(By.id("dateOfBirthInput")).sendKeys("10 Mar 2020");
		driver.findElement(By.id("submit")).click();
	}
	@BeforeMethod
	public void beforeMethod() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();

	}

	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}

}
