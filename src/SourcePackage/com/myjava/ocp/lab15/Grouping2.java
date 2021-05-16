package SourcePackage.com.myjava.ocp.lab15;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Grouping2 {

	public static void main(String[] args) {
		String[] fruits = { "apple", "apple", "banana", "watermelon", "apple", "orange", "watermelon", "banana",
				"cocount" };
		Map<String, Long> map1 = Stream.of(fruits)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("map:"+map1);
		
		Map<String, Long> map2 = Stream.of(fruits)
				.collect(Collectors.groupingBy(fruit->fruit, Collectors.counting()));
		System.out.println("map:"+map2);
		
		Map<String, Long> map3 = Stream.of(fruits)
				.collect(Collectors.groupingBy(String::toString, Collectors.counting()));
		System.out.println("map:"+map3);
		
	}

}
