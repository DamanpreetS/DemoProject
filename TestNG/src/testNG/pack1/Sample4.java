package testNG.pack1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample4 {
	
		
		
		@BeforeTest
		public void display5()
		{
			System.out.println("Before Test sample 4");
			
		}
		@AfterTest
		public void display6()
		{
			System.out.println("After test sample 4");
			
		}
		
		@Test(dependsOnMethods = {"done45","display5"}, groups = "Smoke")
		
	public void done4()
	{
		System.out.println("Done4");
		
	}
		@Test(groups = "Smoke")
		public void done45()
		{
			System.out.println("Done45");
			
		}
		
		@Test
		public void done46()
		{
			System.out.println("Done46");
			
		}
	

}
