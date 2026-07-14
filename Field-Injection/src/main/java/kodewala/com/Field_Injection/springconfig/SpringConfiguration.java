package kodewala.com.Field_Injection.springconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "kodewala.com.Field_Injection.beans")//scan the classes which is marked with @component
public class SpringConfiguration {

}
