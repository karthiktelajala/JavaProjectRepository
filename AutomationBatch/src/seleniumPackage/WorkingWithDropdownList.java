package seleniumPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithDropdownList {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VD57\\Downloads\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement monthDropdown = driver.findElement(By.id("month"));
		
		Select sel = new Select(monthDropdown);
		//sel.selectByVisibleText("Apr");
		//sel.selectByIndex(4);
		System.out.println(sel.isMultiple());
		List<WebElement> monthList = sel.getOptions();
		System.out.println(monthList.size());
		System.out.println(monthList.get(4).getText());
		for(int i =0;i<monthList.size();i++)
		{
			String month = monthList.get(i).getText();
			if(month.equalsIgnoreCase("Apr"))
			{
				sel.selectByVisibleText("Apr");
			}
		}
	
		driver.close();
	}
}
