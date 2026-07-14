package kodewala.com.SpringPractise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kodewala.com.Bean.Employee;
import kodewala.com.SpringConfig.SpringConfig;

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
