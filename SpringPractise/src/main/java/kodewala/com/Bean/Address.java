package kodewala.com.Bean;

public class Address {
	private String line1;
	private String line2;
	
	public Address(String line1, String line2) {
		super();
		this.line1 = line1;
		this.line2 = line2;
	}

	public void displayaddress()
	{
		
	
		System.out.println("Address [line1=" + line1 + ", line2=" + line2 + "]");
	
	}
}
