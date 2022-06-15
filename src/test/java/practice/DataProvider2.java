package practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import varm.crm.comcast.genericutility.ExcelUtility;

public class DataProvider2 
{

	//data added by sdet35-1 branch

	
	//data added by java-program branch

	@DataProvider
	public Object[][] fetchDataFromExcel() throws Exception
	{
		ExcelUtility elib=new ExcelUtility();
		String src1=elib.getExcelData("Sheet1", 3, 2);
		String  dest1= elib.getExcelData("Sheet1", 4, 2);
		String ticket1= elib.getExcelData("Sheet1", 5, 2);

		String src2=elib.getExcelData("Sheet1", 3, 3);
		String dest2= elib.getExcelData("Sheet1", 4, 3);
		String ticket2= elib.getExcelData("Sheet1", 5, 3);

		String src3= elib.getExcelData("Sheet1", 3, 4);
		String dest3=elib.getExcelData("Sheet1", 4, 4);
		String ticket3= elib.getExcelData("Sheet1", 5, 4);

		Object[][] objarr=new Object[3][3];
		objarr[0][0]=src1;
		objarr[0][1]=dest1;
		objarr[0][2]=ticket1;

		objarr[1][0]=src2;
		objarr[1][1]=dest2;
		objarr[1][2]=ticket2;

		objarr[2][0]=src3;
		objarr[2][1]=dest3;
		objarr[2][2]=ticket3;

		return objarr;

	}

	@Test(dataProvider = "fetchDataFromExcel")
	public void fecthedDataProvided(String src,String dest,String ticket)
	{
		System.out.println("src is: "+src+" dest is:"+dest+" tickets is:"+ticket);

	}

}

