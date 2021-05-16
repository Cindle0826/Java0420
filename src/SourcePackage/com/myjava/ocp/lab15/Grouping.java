package SourcePackage.com.myjava.ocp.lab15;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toSet;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toList;


public class Grouping {

	public static void main(String[] args) {
		String[] fruits= {"apple","apple","banana","watermelon","apple","orange",
							"watermelon","banana","cocount"};
		
		//Java 7
		Set<String> fruitNameset= new HashSet<>();
		for(String name:fruits) {
			fruitNameset.add(name);
		}
		System.out.println(fruitNameset);
		//Java 8 toSet()
		fruitNameset =Stream.of(fruits).collect(toSet());
		System.out.println(fruitNameset);
		//Java8 toList()
		List<String> fruitNamesList=Stream.of(fruits).collect(toList());
		System.out.println(fruitNamesList);
		//Java8 toMap()
		//Key 不可重複，所以我們可以藉由 
		Map<String, Integer> fruitsNameMap=fruitNameset.stream()
													   .collect(toMap(String::toString,String::length));
		System.out.println(fruitsNameMap);
		
	}

}
