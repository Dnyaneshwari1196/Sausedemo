package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.log4j.chainsaw.Main;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Excelsheet2
{
   static WebDriver driver;
   
   public static void screenshot() throws IOException
   {
	   Date d = new Date();
	   DateFormat d1 = new SimpleDateFormat ("MM-DD-YY & HH-MM-SS");
	   String date = d1.format(d);
	   
	   TakesScreenshot ts = (TakesScreenshot)driver;
	   File Sourcefile = ts.getScreenshotAs(OutputType.FILE);
	   File destfile = new File("E:\\Automation Screenshot\\SS"+date+".jpg");
	   	FileHandler.copy(Sourcefile, destfile);
	   
   }
   public static void main(String[] args) throws IOException
   {
//	FileInputStream file = new FileInputStream ("E:\\Group B_Mock 1_May.xlsx");
//	
//	XSSFWorkbook workbook = new XSSFWorkbook(file);
//	
//	XSSFSheet sheet = workbook.getSheet("Sheet2");
	
//	String name = sheet.getRow(8).getCell(3).getStringCellValue();
//	
//	System.out.println(name);
	
	
	   FileInputStream file = new FileInputStream("E:\\Group B_Mock 1_May.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		for(int i=0 ; i<=9 ; i++ )   // row
		{
			for(int j=0 ; j<=3 ; j++)     //cell
			{
				String ExcelData = workbook.getSheet("Sheet2").getRow(i).getCell(j).getStringCellValue();
				System.out.println(ExcelData);
			}
		}
	
	
	
	
	
}
}


   

