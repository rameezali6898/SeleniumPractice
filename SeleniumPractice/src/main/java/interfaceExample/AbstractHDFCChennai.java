package interfaceExample;

public class AbstractHDFCChennai extends AbstractHDFCHead{

	@Override
	public void panMandatory() {

		System.out.println("Compulsory its mandatory");
	}
	
	public void jointAccount() {
		System.out.println("Its Possible");
	}

	public static void main(String[] args) {
		AbstractHDFCChennai chennai = new AbstractHDFCChennai();
		chennai.aadharMandatory();
		chennai.panMandatory();
		chennai.jointAccount();
	}
}
