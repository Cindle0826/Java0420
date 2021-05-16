package SourcePackage.com.myjava.ocp.lab10;

public class Method {

	public void foo() {
		int x =100;
		final int y=200;
		
		class Bar{
			//x=300; x是final 
			public void foo() {
				System.out.println(y);
				System.out.println(x); //java 7要加final 8以後不用
			}
		}
		new Bar().foo();
	}
	
	public static void main(String[] args) {
		new Method().foo();
	}
}
