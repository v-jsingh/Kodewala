package kodewala.com.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import kodewala.com.beans.Employee;

@Component
public class EmployeeService {
	@Autowired
	
	private Employee employee;
	
	public void displayEmpDetails()
	{
		employee.display();
		System.out.println("Employee details");
	}
	

}
