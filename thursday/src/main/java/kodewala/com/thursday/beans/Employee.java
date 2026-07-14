package kodewala.com.thursday.beans;

public class Employee {
	private String firstName;
	private String lastName;
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void display() {
		System.out.println( "Employee [firstName=" + firstName + ", lastName=" + lastName + "]");
	}
	
	
	

}
