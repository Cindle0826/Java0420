package SourcePackage.com.myjava.ocp.lab13;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkListDemo {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(100);
		list.add(0, 80);
		list.add(90);
		System.out.println(list);
		System.out.println(list.size());
		// 輪詢顯示集合內容
		for (Integer i : list) {
			System.out.println(i);
		}
		ListIterator<Integer> iter = list.listIterator();
		while (iter.hasNext()) {
			Integer index = (Integer) iter.next();
			Integer value = iter.next();
			System.out.printf("%d : %d\n", index, value);
		}
		while (iter.hasPrevious()) {
			Integer index = iter.previousIndex();
			Integer value = iter.previous();
			System.out.printf("%d : %d\n", index, value);
		}
		//Java 8 輪詢顯示集合
		list.forEach(System.out::println);
		list.forEach(e -> System.out.println(e));
	}

}
