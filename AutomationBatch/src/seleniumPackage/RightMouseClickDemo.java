package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightMouseClickDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VD57\\Downloads\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClickButton = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		
		Actions act = new Actions(driver);
		act.contextClick(rightClickButton).build().perform();
		
		driver.findElement(By.xpath("//ul/li[1]/span[text()='Edit']")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

}
