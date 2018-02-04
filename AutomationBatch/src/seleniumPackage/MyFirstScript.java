package seleniumPackage;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class MyFirstScript {

	public static void main(String[] args) throws InterruptedException {
		
		
		//to open Firefox browser
		File pathBinary = new File("C:\\Users\\VD57\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();       
		WebDriver driver = new FirefoxDriver(firefoxBinary, firefoxProfile);
		//to maximize the browser
		driver.manage().window().maximize();
		//navigate to URL
		driver.navigate().to("http://www.gmail.com");
		driver.findElement(By.xpath("//button[contains(text(),'email?')]")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		//identifying a webelement from the page
//		driver.findElement(By.id("identifierId")).sendKeys("karthiktelajala@gmail.com");
//		driver.findElement(By.xpath("//span[text()='Next']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.name("password")).sendKeys("xyxpasword");
//		driver.findElement(By.xpath("//span[text()='Next']")).click();
		

	}

}
