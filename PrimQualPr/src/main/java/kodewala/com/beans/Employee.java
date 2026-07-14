package kodewala.com.beans;

public class Employee {
	private String name;
	private String salary;
	public Employee(String name, String salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public void display()
	{
		
	
		System.out.println("Employee [name=" + name + ", salary=" + salary + "]");
	}
	

}
