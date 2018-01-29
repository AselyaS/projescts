package newPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadKeysValues {

	public static void main(String[] args) throws Exception{
		Properties prop = new Properties();
		prop.load(new FileInputStream("C:\\Users\\Simion\\eclipse-workspace\\Config.txt"));
String os = prop.getProperty("OS");
String cl= prop.getProperty("class");
System.out.println("OS: " + os + "class" + cl );
	}

}
