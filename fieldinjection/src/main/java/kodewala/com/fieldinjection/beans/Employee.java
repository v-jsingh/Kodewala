package kodewala.com.fieldinjection.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component  //
public class Employee {
	@Value("Vishavjit")
	private String firstName;
	@Value("Singh")
	private String lastName;
	@Value("24")
	private String age;
	
	//field injection
	@Autowired
	private Address address;

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", address=" + address
				+ "]";
	}
	
	
	

}
