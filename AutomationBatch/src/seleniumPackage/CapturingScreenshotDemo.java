package seleniumPackage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import libraries.ExcelFile;
import libraries.TakeScreenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingScreenshotDemo {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VD57\\Downloads\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://opensource.demo.orangehrmlive.com/index.php/dashboard");
		
		ExcelFile excel = new ExcelFile();
		String username = excel.readExcelFile(0, 1, 0);
		String password = excel.readExcelFile(0, 1, 1);
		
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		TakeScreenshot.captureScreenshot(driver,"OrangeHRM");
		
		
	}

}
