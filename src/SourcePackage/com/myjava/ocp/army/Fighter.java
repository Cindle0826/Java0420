package SourcePackage.com.myjava.ocp.army;

public class Fighter extends Airplane implements Weapon{

	public Fighter() {
		System.out.println("Fighter");
		
	}
	
	public void move() {
		System.out.println("-----");
	}

	@Override
	public void shoot() {
		System.out.println("攻擊敵人");
		
	}
	
}
