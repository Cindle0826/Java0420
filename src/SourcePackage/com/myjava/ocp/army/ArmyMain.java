package SourcePackage.com.myjava.ocp.army;

public class ArmyMain {

	public ArmyMain() {
		
	}
	
	public static void main(String[] args) {
		Airplane airplanes= new Fighter();
		
		Car car1=new Truck();
		Car car2=new Tank();
		
		if(car1 instanceof Weapon) {
			Weapon w= (Weapon) car1;
			w.shoot();
		}
		
		if(car2 instanceof Weapon) {
			Weapon w= (Weapon) car2;
			w.shoot();
		}
		
		
		if(airplanes instanceof Weapon) {
			Weapon w= (Weapon) airplanes;
			w.shoot();
		}
	}
	
	


}
