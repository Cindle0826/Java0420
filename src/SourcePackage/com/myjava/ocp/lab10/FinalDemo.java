package SourcePackage.com.myjava.ocp.lab10;

class Student{
	String name;
}

public class FinalDemo {
	/**
	 * 方法final 不能被覆寫 class final不能被繼承
	 * @param args
	 */
	public static void main(String[] args) {
		final int x=100;
		final Student s=new Student(); //只是物件格式不能改變屬性能修改
		s.name="Mary";
		s.name="John";
		System.out.println(x);
		System.out.println(s.name);
		
	}
}
