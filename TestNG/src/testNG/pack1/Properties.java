package testNG.pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Properties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		java.util.Properties prop=new java.util.Properties();
		FileInputStream file=new FileInputStream("D:\\workspace\\TestNG\\src\\testNG\\pack1\\name.properties");
	prop.load(file);
System.out.println(	prop.getProperty("url"));
	
prop.setProperty("url", "firefox.com");
System.out.println(	prop.getProperty("url"));
FileOutputStream fos=new FileOutputStream("D:\\workspace\\TestNG\\src\\testNG\\pack1\\name.properties");
	prop.store(fos, null);
	System.out.println(	prop.getProperty("url"));
	}

}
