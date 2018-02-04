package seleniumPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import libraries.ExcelFile;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithExcelDemo {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VD57\\Downloads\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://opensource.demo.orangehrmlive.com/index.php/dashboard");
		
		ExcelFile excel = new ExcelFile();
		String username = excel.readExcelFile(0, 1, 0);
		String password = excel.readExcelFile(0, 1, 1);
		System.out.println(username+" "+ password);
		
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		
		String expTitle = "OrangeHRM";
		String actTitle = driver.getTitle();
		
		if(actTitle.equalsIgnoreCase(expTitle))
		{
			excel.writeExcelFile(0, 1, 2, "Passed");
		}
	}

}
