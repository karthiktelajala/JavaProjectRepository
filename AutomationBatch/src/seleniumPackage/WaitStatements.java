package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitStatements {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VD57\\Downloads\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Implicit Wait:
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//navigate to URL
		driver.navigate().to("http://www.gmail.com");
		
		driver.findElement(By.id("identifierId")).sendKeys("karthiktelajala@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		//Explicit Wait:
		WebDriverWait waitTime = new WebDriverWait(driver,10);
		waitTime.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
		
		driver.findElement(By.name("password")).sendKeys("xyxpasword");
		driver.findElement(By.xpath("//span[text()='Next']")).click();


	}

}
