package kodewala.com.thursday.SpringConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import kodewala.com.thursday.beans.Employee;

@Configuration
@ComponentScan(basePackages = "kodewala.com.thursday.beans")
public class SpringConfiguration {
	@Bean("emp1")
	@Primary
	public Employee employee()
	{
		Employee emp=new Employee("Vishav","Singh");
		return emp;
	}
	@Bean("emp2")
	public Employee employee2()
	{
		Employee emp2=new Employee("Ananya","Chowdhary");
		return emp2;
	}
	
	

}
