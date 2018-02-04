package libraries;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenshot {

	public static void captureScreenshot(WebDriver driver, String screnshotName)
	{
		try
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File srcFile = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File(".\\Screenshots\\" +screnshotName +".png"));
		}
		catch(Exception e)
		{
			System.out.println("Exception occurred while capturing Screenshot" + e.getMessage());
		}
	}

}
