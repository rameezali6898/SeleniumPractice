package InheritanceExample;

public class Bike extends Vehicle {

	public void mileage() {
		System.out.println("45");
	}
	
	public boolean LPG() {
		return false;
	}
	
	public static void main(String[] args) {
		Bike bi = new Bike();
		bi.mileage();
		boolean isLPG = bi.LPG();
		System.out.println(isLPG);
		bi.applyBrake();
		bi.hornSound();
	}
}
