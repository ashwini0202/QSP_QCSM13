package dataDriverTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class ReadMulptipleData {

	public static void main(String[] args) throws Throwable {
		String filepath="./resources/prop.properties";
		FileInputStream file = new FileInputStream(filepath);
		Properties properties = new Properties();
		properties.load(file);
		
		Set<Object> KeySet = properties.keySet();
		for(Object key:KeySet) {
			System.out.println(key);
			System.out.println(properties.get(key));
		}

	}

}
