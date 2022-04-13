package testNG.pack1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sample3 {
	
		@Test(groups= {"Smoke"})
		public void display()
		{
			System.out.println("Dsiplay3");
			
		}
		@org.testng.annotations.BeforeTest
		public void BeforeTest()
		{
			System.out.println("Before Test sample 3");
			
		}
		@Test(dataProvider = "getdata") 
		public void runSample(String  username, String password)
		{
			
			System.out.println(username + " " +password);
		}
	@DataProvider
	public Object getdata()
	{
		//method will run 3 times for 2 values each time
		Object[][] val=new Object[3][2];
		
		val[0][0]= "username1";
		val[0][1]="password1";
		val[1][0]="username2";
		val[1][1]="password2";
		val[2][0]="username3";
		val[2][1]="password3";
		
		return val;
	}

}
