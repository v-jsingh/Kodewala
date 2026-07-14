package kodewala.com.Field_Injection.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Employee {
	@Value("Vishav")
	private String firstName;
	@Value("Singh")
	private String lastName;
	@Autowired //injecting using field(automatically injected)
	private Address address;
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
	}

}
