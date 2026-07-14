package kodewala.com.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kodewala.com.injection.SpringConifg.SpringConfig;
import kodewala.com.injection.beans.Employee;

public class Driver {
	public static void main(String args[])
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
		Employee employee= (Employee) context.getBean("emp");
		System.out.println(employee);
		
	}

}
