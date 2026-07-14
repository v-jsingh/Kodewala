package kodewala.com.Setter_Injection.beans;

public class Address {
	private String line1;
	private String line2;
	
	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", line2=" + line2 + "]";
	}
	

}
