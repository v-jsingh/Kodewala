package kodewala.com.thursday;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kodewala.com.thursday.EmployeeService.EmployeeService;
import kodewala.com.thursday.SpringConfig.SpringConfiguration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfiguration.class);
        EmployeeService e=context.getBean(EmployeeService.class);
        e.displayEmployeeDetails();
        
    }
}
