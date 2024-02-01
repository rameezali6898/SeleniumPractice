package interfaceExample;

public class UnionBank extends SBI {

	public boolean emiMoreThanOneYear() {
		return true;		
	}
	
	public static void main(String[] args) {
		
		UnionBank ub = new UnionBank();
		ub.aadharMandatory();
		System.out.println(ub.minimumAmount);
		ub.panMandatory();
		ub.interestFreeLoan();
		
		boolean emiOption = ub.emiMoreThanOneYear();
		System.out.println(emiOption);
	}
}
