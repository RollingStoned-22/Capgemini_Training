package annotations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingData {
	public static void main(String[] args) throws IOException
	{ 
		File file = new File("C:\\Users\\User\\Desktop\\FileHandlingCapgemini\\Java\\text.txt");
		FileInputStream fis = new FileInputStream(file);
		
		int x;
		
		while((x = fis.read()) != -1)
			System.out.println((char)x);
	}
}
