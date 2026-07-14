package kodewala.com.spring_dependency_injection.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	@Bean("address")
	public Address address()
	{
		Address address=new Address("Line-1","Line-2","BLR","KA");
		return address;
		
	}
	
	@Bean("employee")
	public Employee emp()
	{
		Employee emp=new Employee("Vishav","Singh",address());
		return emp;
		
	}
	
	

}
