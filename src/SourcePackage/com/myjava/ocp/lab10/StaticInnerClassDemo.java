package SourcePackage.com.myjava.ocp.lab10;

class Outer{
	static int sx=9;
	int x=7;
	//一般內部類別 不能有static 
	class Inner{
		void print() {
			System.out.println("Inner class"+sx+""+x);
			SInner.print(); //一般內部類別可以叫static 內部類別
		}
	}
	
	//static內部類別
	static class SInner{
		static void print() {
			System.out.println("SInner class");
		}
	}
	
}

public class StaticInnerClassDemo {
	public static void main(String[] args) {
		Outer.Inner in = new Outer().new Inner();
		in.print();
		Outer.SInner sin=new Outer.SInner(); //透過Outer帶出Sinner所以不用()
		sin.print();
	}
}
