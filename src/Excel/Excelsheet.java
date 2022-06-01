package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelsheet
{public static void main(String[] args) throws IOException {
	

{
	//String path = "E:\\Group B_Mock 1_May.xlsx";
	
	//file read
	FileInputStream file = new FileInputStream("E:\\Group B_Mock 1_May.xlsx");       //exception accept

	//workbook read
	XSSFWorkbook workbook = new XSSFWorkbook(file);             //exception accept

	//read sheet
	XSSFSheet sheet = workbook.getSheet("Sheet2");

	//read row
	 String name = sheet.getRow(7).getCell(4).getStringCellValue();

	//read cell
//	XSSFCell cell = row

	//data read
//	String data = cell
	System.out.println(name);
}
}
}