package file_handling;import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class WriteData {
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\User\\Desktop\\FileHandlingCapgemini\\Java\\text.txt";
		File file = new File(path);
		//FileOutputStream fos = new FileOutputStream(file,true); 
		String message = "\nIm the Cult of Personality";
	//	byte[] arr = message.getBytes();
//		System.out.println(Arrays.toString(arr));
//		fos.write(arr);
		FileWriter fw = new FileWriter(file,true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		for(int i = 0; i < message.length(); i++)
			bw.write(message.charAt(i));
		bw.flush();
		fw.flush();
		
	}
}
