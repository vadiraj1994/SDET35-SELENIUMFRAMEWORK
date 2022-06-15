package practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderHardCodedTest 
{
	@DataProvider
	public Object[][] bookTicketDataProvider()
	{
		Object[][] objArr=new Object[3][3];
		objArr[0][0]="Bangalore";
		objArr[0][1]="Mysore";
		objArr[0][2]=10;

		objArr[1][0]="Bangalore";
		objArr[1][1]="Vijaypur";
		objArr[1][2]=20;

		objArr[2][0]="Bangalore";
		objArr[2][1]="Kerala";
		objArr[2][2]=30;

		return objArr;
	}
	@Test(dataProvider="bookTicketDataProvider")
	public void bookTicket(String src,String dest,int ticket)
	{
		System.out.println("src is:"+src+"dest is:"+dest+"tickets is:"+ticket);
	}

}
