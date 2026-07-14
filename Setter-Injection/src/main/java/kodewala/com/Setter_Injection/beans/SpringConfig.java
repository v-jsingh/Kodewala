package kodewala.com.Setter_Injection.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class SpringConfig {
	
	@Bean
	public Address createAddress()
	{
		Address address=new Address();
		address.setLine1("Btm Stage 2");
		address.setLine2("near vega mall");
		return address;
	}
	@Bean("emp")
	public Employee createEmployee()
	{
		Employee employee=new Employee();
		employee.setFirstName("Vishav");
		employee.setLastName("Singh");
		employee.setAddress(createAddress());
		return employee;
	}
	
	

}
