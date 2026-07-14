package kodewala.com.Bean;
//Setter injection
public class Employee {
	private String name;
	private String age;
	private String salary;
	Address address;
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public void setAddress(Address address)
	{
		this.address=address;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	

}
