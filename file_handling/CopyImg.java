package file_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class CopyImg {
	public static void main(String[] args) throws IOException {
		String destimgPath = "C:\\Users\\User\\Desktop\\FileHandlingCapgemini\\Java\\DT.jpg";
		File destinationfile = new File(destimgPath);
		destinationfile.createNewFile();
		
		String srcPath = "‪‪‪‪C:\\Users\\Public\\Pictures\\DT.jpg";
		File srcFile = new File(srcPath);
		
		FileInputStream fis = new FileInputStream(srcFile);
		byte[] arr = new byte[(int)srcFile.length()];
		
		fis.read(arr);
		
		
		FileOutputStream fos = new FileOutputStream(destinationfile);
		fos.write(arr);
		fis.close();
		fos.close();
		
	}
}	
