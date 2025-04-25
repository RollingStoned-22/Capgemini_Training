package file_handling;
import java.io.*;

public class DeserializableEmployee {
	public static void main(String[] args) throws Exception {
		String path = "C:\\Users\\User\\Desktop\\Serializability\\serialize.txt";
		File file = new File(path);
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Employee emp = (Employee)ois.readObject();
		System.out.println(emp);
	}
}
