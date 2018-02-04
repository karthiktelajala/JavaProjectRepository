package seleniumPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingDemo {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VD57\\Downloads\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://opensource.demo.orangehrmlive.com/index.php/dashboard");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		
		//using java Script 
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("window.scroll(0,200)");
		
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		robot.keyPress(KeyEvent.VK_WINDOWS);
		robot.keyPress(KeyEvent.VK_D);
		
		robot.keyRelease(KeyEvent.VK_WINDOWS);
		robot.keyRelease(KeyEvent.VK_D);

	}

}
