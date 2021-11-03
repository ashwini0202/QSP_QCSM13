package pomClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {
	public String getPropertyData(String filePath,String key) throws IOException {
	FileInputStream file = new FileInputStream(filePath);
	Properties properties = new Properties();
	properties.load(file);
	return properties.getProperty(key);
	}
	

}
