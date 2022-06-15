package exceldatadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Data_DrivenWriteSingleDataTest
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		String path = "./src/test/resources/dataExcel.xlsx";
		FileInputStream fis=new	FileInputStream(path);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.createRow(6);
		Cell cell = row.createCell(0);
		cell.setCellValue("Jarasandha");
		FileOutputStream fout=new FileOutputStream(path);
		book.write(fout);
		book.close();
		

	}
}
