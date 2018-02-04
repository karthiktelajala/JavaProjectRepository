package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlrets {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VD57\\Downloads\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/selenium/delete_customer.php");
		
		//getting the title of the page
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("cusid")).sendKeys("123");
		driver.findElement(By.name("submit")).click();
		
		Alert alert = driver.switchTo().alert();
		//alert.dismiss();
		alert.accept();
		driver.switchTo().alert().accept();

		driver.close();
	}

}
