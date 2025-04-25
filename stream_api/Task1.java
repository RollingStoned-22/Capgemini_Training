package stream_api;
import java.util.*;
import java.util.stream.Stream;

public class Task1 {
	public static void main(String[] args) {
		
		int s = 0;
		List<Integer> list = Arrays.asList(5,9,6,3,4,8);
		System.out.println(list.stream().mapToInt(Integer::intValue).average());
	}
}
