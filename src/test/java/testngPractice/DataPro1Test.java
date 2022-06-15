package testngPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPro1Test
{
	@DataProvider(name = "getProductsIds")
	public Iterator<String> testData()//for List,queue,set ...we should use Iterator
	{
		List<String> productIdsList=new ArrayList<String>();//for Dynamic Array..
		productIdsList.add("id_product=10"); 
		productIdsList.add("id_product=10"); 
		productIdsList.add("id_product=10"); 
		productIdsList.add("id_product=10"); 
		productIdsList.add("id_product=10"); 
		
		return productIdsList.iterator() ;
	}
	@Test(dataProvider = "getProductsIds" )

	public void testProducts(String productId)
	{
		System.out.println("From Test Case:"+productId);	
	}
}
