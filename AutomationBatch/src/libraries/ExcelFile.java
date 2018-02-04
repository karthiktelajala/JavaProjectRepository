package libraries;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFile {

	String filePath = "C:\\Users\\VD57\\Desktop\\ScriptTestData\\Credentials.xlsx";
	String testData;
	public String readExcelFile(int sheeNum, int rowNum, int cellNum)
	{
		try
		{
		FileInputStream fis = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheetAt(sheeNum);
		Row row = sheet.getRow(rowNum);
		testData = row.getCell(cellNum).getStringCellValue();
		}
		catch(Exception e)
		{
			System.out.println("Exception occurred while reading Excel" + e.getMessage());
		}
		return testData;
	}
	
	public String writeExcelFile(int sheeNum, int rowNum, int cellNum, String testResult)
	{
		try
		{
			FileInputStream fis = new FileInputStream(filePath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheetAt(sheeNum);
			Row row = sheet.getRow(rowNum);
			row.createCell(cellNum).setCellValue(testResult);
			FileOutputStream fos = new FileOutputStream(filePath);
			wb.write(fos);
		}
		catch(Exception e)
		{
			System.out.println("Exception occurred while writing to Excel" + e.getMessage());
		}
		return testResult;
	}

}
