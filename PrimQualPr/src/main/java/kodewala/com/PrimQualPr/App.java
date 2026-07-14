package kodewala.com.PrimQualPr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kodewala.com.EmployeeService.EmployeeService;
import kodewala.com.SpringConfig.SpringConfig;
import kodewala.com.beans.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
    	EmployeeService emp=context.getBean(EmployeeService.class);
       emp.displayEmpDetails();
    }
}
