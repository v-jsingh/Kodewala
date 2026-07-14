package kodewala.com.Field_Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kodewala.com.Field_Injection.beans.Employee;
import kodewala.com.Field_Injection.springconfig.SpringConfiguration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Employee e1= context.getBean(Employee.class);
        System.out.println(e1);
    }
}
