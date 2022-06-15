package exceldatadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Data_DrivenFecthMultipleDataTest

{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		String path = "./src/test/resources/dataExcel.xlsx";
		FileInputStream fis=new	FileInputStream(path);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet1");
		int line = sheet.getPhysicalNumberOfRows();
		for (int i=0; i <line; i++) 
		{
			Row row = sheet.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++)
			{

				System.out.println(row.getCell(j).toString());
			}

		}	
	}
}
