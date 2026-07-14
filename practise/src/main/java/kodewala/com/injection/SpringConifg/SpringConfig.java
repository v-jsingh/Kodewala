 package kodewala.com.injection.SpringConifg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kodewala.com.injection.beans.Address;
import kodewala.com.injection.beans.Employee;


@Configuration
public class SpringConfig {
	@Bean("Add")
	public Address createAddress()
	{
		Address address=new Address("Btm Stage 2","Dollar layout");
		return address;
		
	}
	@Bean("emp")
	public Employee createEmployee()
	{
		Employee emp=new Employee("Vishavjit","Singh",createAddress());
		return emp;
	}

}
