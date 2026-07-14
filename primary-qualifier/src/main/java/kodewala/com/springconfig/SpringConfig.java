package kodewala.com.springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import kodewala.com.primary_qualifier.beans.Employee;


@Configuration
@ComponentScan(basePackages = "kodewala.com.primary_qualifier")
public class SpringConfig {
	@Bean("emp1")
	
	public Employee createEmp1()
	{
		Employee e=new Employee("Kodewala","Academy","engineeting");
		return e;
	}
	@Bean("emp2")
	@Primary
	public Employee createEmp2()
	{
		Employee e=new Employee("Kodewala2","Academy2","Engineering");
		return e;
	}

}
