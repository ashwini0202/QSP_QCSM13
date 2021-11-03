package dataDriverTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import com.opencsv.CSVReader;

public class ReadTheDataFromCsvFile {

	public static void main(String[] args) throws Throwable {
		String filepath="./resources/csvData.csv";
		FileReader fileReader = new FileReader(filepath);
		CSVReader csvReader=new CSVReader(fileReader);
		String[] arr=csvReader.readNext();
		for(String data:arr ) {
			System.out.println("data");
		}
		

           csvReader.close();
	}

}
