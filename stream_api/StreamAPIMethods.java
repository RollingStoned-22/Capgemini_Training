package stream_api;

import java.util.*;
import java.util.stream.Stream;

public abstract class StreamAPIMethods {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(54);
		list.add(14);
		list.add(80);
		list.add(47);
		list.add(54);
//		Stream<Integer> s = list.stream();
//		Stream<Integer> s2 = list.stream();
//		s.forEach(n->System.out.println(n));
//		System.out.println("Distinct stream");
//		Stream<Integer> s3 = s2.distinct();
//		s3.forEach(n -> System.out.println(n));
		System.out.println(list);
		
		list.stream().distinct().forEach((n) -> System.out.println(n));
	}
}
