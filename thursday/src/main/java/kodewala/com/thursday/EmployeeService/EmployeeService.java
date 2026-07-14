package kodewala.com.thursday.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import kodewala.com.thursday.beans.Employee;

@Component//this will be managed by ioc and will make bean of this class
public class EmployeeService {
	@Autowired//used inside spring managed class will automatically inject beans
	@Qualifier("emp")//used to prioritize a bean if we have multiple beans of same type
	private Employee employee;
	public void displayEmployeeDetails()
	{
		System.out.println("employeedetails.display()");
		employee.display();
	}
	
	
	
	

}
