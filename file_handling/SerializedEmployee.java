package file_handling;
import java.io.*;

public class SerializedEmployee {
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\User\\Desktop\\Serializability\\serialize.txt";
		File file = new File(path);
		
		file.createNewFile();
		
		Employee employee = new Employee(63, "Shuvam", 90000);
		
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(employee);
		oos.flush();
		
		oos.close();
		fos.close();
	}
}
