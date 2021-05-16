package SourcePackage.com.myjava.ocp.army;

public interface Weapon {
	
	public void shoot();
	
	public default void copyright() { //有default可以實作
		
	}

}
