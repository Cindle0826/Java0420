package SourcePackage.com.myjava.ocp.lab11;

import java.util.HashSet;

public class SetDemo {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();//泛型 只能有一種類別
		hs.add("英文");
		hs.add("國文");
		hs.add("數學");
		System.out.println(hs);
		
		HashSet<Pen> hs2= new HashSet<>();
		hs2.add(new Pen("Red",10));
		hs2.add(new Pen("blue",10));
		hs2.add(new Pen("Red",10));
		System.out.println(hs2);
		//Java 7
		for(Pen pen:hs2) {
			System.out.println(pen);
		}
		//Java 8 forEach
		hs2.forEach(pen->System.out.println(pen.getColor()));
	}
	
}
