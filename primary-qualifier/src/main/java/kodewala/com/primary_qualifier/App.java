package kodewala.com.primary_qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kodewala.com.primary_qualifier.employeeservice.EmployeeService;
import kodewala.com.springconfig.SpringConfig;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
       EmployeeService employeeService=context.getBean(EmployeeService.class);
       employeeService.displayEmpDetails();
    }
}
