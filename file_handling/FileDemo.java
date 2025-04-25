package file_handling;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		String oldpath = "C:\\Users\\User\\Desktop\\FileHandling";
		String newPath = "C:\\Users\\User\\Desktop\\RenamedFile";
		String path = "C:\\Users\\User\\Desktop\\FileHandlingCapgemini\\Java\\text.txt";
		File file = new File(path);
		File file1 = new File(oldpath);
		File file2 = new File(newPath);
		
//		file1.mkdir();
//		file1.mkdirs();
		
//		file1.renameTo(file2);
		
//		file1.delete();
//		file2.delete();
		
		file1.mkdir();
//		System.out.println(file2.getAbsolutePath());
//		System.out.println(file1.exists());
//		System.out.println(file.getParent());
		file.createNewFile();
//		String[] files = file.list();
//		System.out.println(Arrays.toString(files));
		System.out.println(file.canExecute());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getTotalSpace());
		System.out.println(file.getFreeSpace());
		System.out.println(file.isHidden());
		
		}
}
