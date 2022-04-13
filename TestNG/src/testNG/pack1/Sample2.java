package testNG.pack1;

import org.testng.annotations.Test;

public class Sample2 {
	@Test
	public void display()
	{
		System.out.println("Dsiplay2");
		
	}
	@Test(groups= {"Smoke"})
public void display1()
{
	System.out.println("Done2");
	
}
}
