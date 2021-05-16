package SourcePackage.com.myjava.ocp.army;

public class Tank extends Car implements Weapon{

	public Tank() {
		System.out.println("Tank");
	}

	public void move() {
		
	}

	@Override
	public void shoot() {
		System.out.println("發射一枚飛彈");
		
	}
	

}
