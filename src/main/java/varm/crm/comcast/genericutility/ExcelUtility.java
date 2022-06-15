package varm.crm.comcast.genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility
{
	public String getExcelData(String sheetName,int rowNum,int cellNum) throws Exception
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/dataExcel.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String sh = wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).toString();
		/*Row row=sh.getRow(rowNum);
		String data = row.getCell(cellNum).getStringCellValue();
		return data;*/
		return sh;

	}
	public int getRowCount(String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/dataExcel.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		wb.close();
		return sh.getLastRowNum();
	}
	public void setDataExcel(String sheetName,int rowNum,int cellNum,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/dataExcel.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		Cell cel = row.createCell(cellNum);
		cel.setCellValue(data);
		FileOutputStream fout=new 	FileOutputStream("./src/test/resources/dataExcel.xlsx");
		wb.write(fout);
		wb.close();

	}
}
