package interfaceExample;

public class SBI implements RBI{

	
	
	public void aadharMandatory() {
		System.out.println("Yes Mandatory");
	}

	
	public void panMandatory() {
		System.out.println("SomeTimes");
	}
	
	public void interestFreeLoan() {
		System.out.println("Based on Salary");
	}
	
	public static void main(String[] args) {
		
		SBI sbi = new SBI();
		sbi.aadharMandatory();
		sbi.panMandatory();
		sbi.interestFreeLoan();
		System.out.println(RBI.minimumAmount);
	}
	
}
