package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CSVWrite {
public static void main(String[] args) throws Exception{
	String path ="C:\\Users\\User\\Desktop\\FileHandlingCapgemini\\Java\\studentData.csv";
	File file = new File(path);
	file.createNewFile();
	
	try(FileWriter writer = new FileWriter(file)){
		writer.append("id,name,age\n");
		writer.append("2,Supriyo,22\n");
		writer.append("3,Sam,22\n");
		writer.append("4,Shuvam,22\n");
		
		System.out.println("CSV file writen!");
	}catch(IOException e) {
		e.printStackTrace();
	}
}
}
