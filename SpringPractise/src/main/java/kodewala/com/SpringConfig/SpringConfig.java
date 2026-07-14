package kodewala.com.SpringConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import kodewala.com.Bean.Address;
import kodewala.com.Bean.Employee;

@ComponentScan(basePackages = "kodewala.com.Bean")
public class SpringConfig {
	
	@Bean("emp")
	public Employee createEmployee()
	{
	Employee emp=new Employee();
	emp.setAge("24");
	emp.setName("Vishav");
	emp.setSalary("16 lakhs");
	emp.setAddress(createAddress());
	return emp;
	
	}
	@Bean("address")
	public Address createAddress()
	{
		Address add=new Address("Btm stage 2","Brighton");
		add.displayaddress();
		return add;
	}

}
