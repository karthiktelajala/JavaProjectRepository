package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VD57\\Downloads\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://opensource.demo.orangehrmlive.com/index.php/dashboard");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		
		Actions act = new Actions(driver);
		
		WebElement admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
		act.moveToElement(admin).build().perform();
		WebElement userManagement = driver.findElement(By.id("menu_admin_UserManagement"));
		act.moveToElement(userManagement).build().perform();
		
		driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
		//driver.close();
		
		
	}

}
