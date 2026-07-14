package kodewala.com.spring_dependency_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kodewala.com.spring_dependency_injection.beans.Employee;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new  AnnotationConfigApplicationContext();
        Employee emp=(Employee)context.getBean("emp");
        System.out.println(emp.toString());
    }
}
