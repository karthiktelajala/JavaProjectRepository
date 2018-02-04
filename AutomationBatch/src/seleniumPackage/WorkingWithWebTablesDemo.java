package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithWebTablesDemo {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VD57\\Downloads\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://opensource.demo.orangehrmlive.com/index.php/dashboard");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		
		Actions act = new Actions(driver);
		
		WebElement admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
		act.moveToElement(admin).build().perform();
		
		WebElement job = driver.findElement(By.id("menu_admin_Job"));
		act.moveToElement(job).build().perform();
		
		driver.findElement(By.id("menu_admin_viewJobTitleList")).click();
		
		String expText = "CEO";
		String actText = driver.findElement(By.xpath("//a[text()='CEO']")).getText();
		
		if(actText.equalsIgnoreCase(expText))
		{
			WebElement chkBox = driver.findElement(By.xpath("//a[text()='CEO']/parent::td/preceding-sibling::td/input[@name='chkSelectRow[]']"));
			if(!(chkBox.isSelected()))
			{
				chkBox.click();
				driver.findElement(By.id("btnDelete")).click();
			
				driver.findElement(By.xpath("//div[@id='deleteConfModal']/div/input[@value='Cancel']")).click();
			}
			
		}
		
	}

}
