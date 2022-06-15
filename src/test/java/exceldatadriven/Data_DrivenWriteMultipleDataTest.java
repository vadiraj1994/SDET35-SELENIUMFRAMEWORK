package exceldatadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Data_DrivenWriteMultipleDataTest 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		String path = "./src/test/resources/dataExcel.xlsx";
		FileInputStream fis=new	FileInputStream(path);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet1");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> link = driver.findElements(By.xpath("//a"));
		for (int i=0; i <link.size(); i++) 
		{
			Row row = sheet.createRow(i);
			Cell cell = row.createCell(0);
			cell.setCellValue(link.get(i).getAttribute("href"));
			FileOutputStream fout=new FileOutputStream(path);
			book.write(fout);

		}

	}	
}
