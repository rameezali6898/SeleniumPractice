package InheritanceExample;

public class Vehicle {


	public void applyBrake(){

		System.out.println("Brake applied");
	}

	public void hornSound() {
		System.out.println("Yeah Horned");
	}

	public static void main(String[] args) {
		
		Vehicle ve = new Vehicle();
		ve.applyBrake();
		ve.hornSound();
		
	}
}
