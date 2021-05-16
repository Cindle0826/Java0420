package SourcePackage.com.myjava.ocp.lab14;


import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, Integer> exam=new HashMap<>();
		exam.put("國文", 100);
		exam.put("數學", 80);
		exam.put("英文", 100);
		/*
		System.out.println(exam);
		System.out.println(exam.get("國文"));
		System.out.println(exam.keySet());//set
		System.out.println(exam.values());//List
		//Java 7
		Set<String> keys=exam.keySet();
		for(String Key:keys) {
			System.out.printf("Key: %s value: %d\n", Key,exam.get(Key));
		}
		*/
		//Java 8 (e) Entry 物件(裡面存放 Map的元素資料(Key==Value)
		exam.entrySet().stream().forEach((e)->System.out.println(e));
		exam.entrySet().stream().forEach(System.out::println); //方法參照 可以降低程式碼許多結構上的邏輯
		
		exam.entrySet().stream().forEach((e)->System.out.println(e.getKey()));
		exam.entrySet().stream().forEach(Entry::getKey);
		
		exam.entrySet().stream().forEach((e)->System.out.println(e.getValue()));
		exam.entrySet().stream().forEach(Entry::getValue);
	}

}
