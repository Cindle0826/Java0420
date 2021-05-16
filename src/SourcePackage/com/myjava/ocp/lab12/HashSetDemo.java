package SourcePackage.com.myjava.ocp.lab12;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {

		Pen pen = new Pen();
		pen.setColor("blue");
		Paper paper = new Paper();
		paper.setSize("A5");

		HashSet hs = new HashSet(); // 預設泛型 Object
		hs.add(pen);
		hs.add(paper);
		System.out.println(hs);
		//使用Iterator
		Iterator it=hs.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
		}
		it=hs.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			if(object instanceof Paper) {
				it.remove();
			}
		}
		System.out.println(hs);
	}

}
