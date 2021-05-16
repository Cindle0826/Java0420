package SourcePackage.com.myjava.ocp.lab10;

interface Dog{
	void play();
}

public class PetStore {
	public static void main(String[] args) {
		Dog d=new Dog() {//{}實作  {}前面沒有class可以實作就是匿名類別
			public void play() {
				System.out.println("握手");
			}
			public void eat() {
				System.out.println("骨頭");
			}
		};
		d.play();
		//((PetStore$1)d).eat(); java 6 7 可以
	}
}
