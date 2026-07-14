package kodewala.com.primary_qualifier.employeeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import kodewala.com.primary_qualifier.beans.Employee;

@Component
public class EmployeeService {
@Autowired
@Qualifier("emp2") //emp2 will be prioritised
private Employee employee;

public void displayEmpDetails()
{
	System.out.println("EmployeeService.displayEmpDetails()");
	employee.display();
}

}
