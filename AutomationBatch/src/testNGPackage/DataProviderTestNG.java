package testNGPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestNG {

	@Test(dataProvider = "Credentials", groups ={"Sanity","Reg"})
	public void orangeHRMLogin(String username, String password)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VD57\\Downloads\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://opensource.demo.orangehrmlive.com/index.php/dashboard");
		
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();		
	}
	
	@DataProvider(name = "Credentials")
	public static Object[][] credentials()
	{
		return new Object[][] {{"Admin", "admin"}};
	}
}
