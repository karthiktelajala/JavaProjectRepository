package seleniumPackage;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindowsDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VD57\\Downloads\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		driver.findElement(By.xpath("//div[@id='bluemenu']/ul/li[2]/a[contains(text(),'Tourism')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Accommodations')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Hotels & Lounge')]")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String currentWindow:allWindows)
		{
			if(!(parentWindow==currentWindow))
			{
				driver.switchTo().window(currentWindow);	
			}
			
		}
		
		driver.findElement(By.xpath("//a[text()='Retiring Room']")).click();
		driver.close();
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		
	}

}
