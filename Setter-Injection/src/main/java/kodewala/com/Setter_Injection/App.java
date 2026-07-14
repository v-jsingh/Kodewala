package kodewala.com.Setter_Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kodewala.com.Setter_Injection.beans.Employee;
import kodewala.com.Setter_Injection.beans.SpringConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        Employee emp=(Employee) context.getBean("emp");
        System.out.println(emp);
    }
}
