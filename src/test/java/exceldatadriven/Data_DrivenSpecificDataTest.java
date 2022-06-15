package exceldatadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Data_DrivenSpecificDataTest
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		String path = "./src/test/resources/dataExcel.xlsx";
		FileInputStream fis=new	FileInputStream(path);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(1);
		String value1 = cell.toString();
		String value2 = cell.toString();
		
		if(value1.equals("Suresh"))
		{
			System.out.println("Not Printing...!");
		}else
		{
			
			System.out.println(value2);
		}	
	}
}
