package testNG.pack1;

import org.testng.annotations.Test;

public class Sample {

	
	public static void main(String[] args)
	{
		System.out.println("hello1");
	}
	@Test(groups= {"Smoke"})
	public void display()
	{
		System.out.println("Dsiplay1");
		
	}
@Test
public void display1()
{
	System.out.println("Done1");
	
}
}
