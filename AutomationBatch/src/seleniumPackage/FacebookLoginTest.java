package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VD57\\Downloads\\SeleniumDrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("karthiktelajala@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("dkdiidkd");
		driver.findElement(By.id("loginbutton")).click();

	}

}
