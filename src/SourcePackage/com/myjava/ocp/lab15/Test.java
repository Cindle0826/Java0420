package SourcePackage.com.myjava.ocp.lab15;

import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toSet;

public class Test {
	public static void main(String[] args) {
		String [] names= {"Tom","John","Helen","Jane","Mary"};
		System.out.println("map"+
		Stream.of(names)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream()
				.collect(Collectors.groupingBy(Entry::getValue,Collectors.mapping(Entry::getKey, toSet())))
		);
	}

}
