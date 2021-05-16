package SourcePackage.com.myjava.ocp.lab15;

import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toSet;

public class Grouping3 {
	public static void main(String[] args) {
		String[] fruits = { "apple", "apple", "banana", "watermelon", "apple", "orange", "watermelon", "banana",
		"cocount" };
		// map1:{orange=1, banana=2, apple=3, cocount=1, watermelon=2}
		// map2:{orange=1, banana=2, apple=3, cocount=1, watermelon=2}
		System.out.println("map2:  " +
		Stream.of(fruits).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.collect(Collectors.groupingBy(Entry::getValue, Collectors.mapping(Entry::getKey, toSet())))
				);
	}

}
