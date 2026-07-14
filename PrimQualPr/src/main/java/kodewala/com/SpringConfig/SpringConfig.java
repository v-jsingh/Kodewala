package kodewala.com.SpringConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import kodewala.com.beans.Employee;

@Configuration
@ComponentScan(basePackages = "kodewala.com.EmployeeService")
public class SpringConfig {
	
	@Bean("emp1")
	public Employee createEmp()
	{
	Employee emp=new Employee("Vishav","16 lakhs");
			return emp;
	}
	@Bean("emp2")
	@Primary
	public Employee createEmp2()
	{
		Employee emp1=new Employee("Captain","28 lakhs");
		return emp1;
	}
}
