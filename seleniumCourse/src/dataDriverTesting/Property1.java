
package dataDriverTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Property1 {

	private static final char[] UserName = null;

	public static void main(String[] args) throws Throwable {
		String filepath="./resources/prop.properties";
		//pass the physical path to the constructor pf fileinputstream
		FileInputStream file = new FileInputStream(filepath);
		//object of properties class from java to load the physical file
		Properties properties = new Properties();
        // load the file
		properties.load(file);
		//fetch all data using key givenin the property file
		String URL=properties.getProperty("url");
		String username=properties.getProperty("username");
		String password=properties.getProperty("password");
		
		//print the value
		
		System.out.println(URL);
		System.out.println(username);
		System.out.println(password);
	}

}
