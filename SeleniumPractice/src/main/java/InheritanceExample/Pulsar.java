package InheritanceExample;

public class Pulsar extends Bike {

	public String colour() {
		return "Black and Silver";
	}
	
	public static void main(String[] args) {
		Pulsar pul = new Pulsar();
		String getColour = pul.colour();
		System.out.println(getColour);
		
		pul.applyBrake();
		pul.hornSound();
		pul.mileage();
		boolean lpgBike = pul.LPG();
		System.out.println(lpgBike);
	}
}
