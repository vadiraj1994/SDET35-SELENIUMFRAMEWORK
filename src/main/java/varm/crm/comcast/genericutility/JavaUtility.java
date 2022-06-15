package varm.crm.comcast.genericutility;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;

public class JavaUtility
{
	public static int getRanDomNumber()
	{
		Random ranDom=new Random();
		int ranDomNum=ranDom.nextInt(1000);
		return ranDomNum;
	}
	public String getSystemDate()
	{
		String timeStamp = LocalDateTime.now().toString().replace(':', '-');
		return timeStamp;
	}
}
