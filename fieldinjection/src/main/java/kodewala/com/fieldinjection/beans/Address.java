package kodewala.com.fieldinjection.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("12th main")
	private String line1;
	@Value("Btm Layout")
	private String line2;
	@Value("Bangalore")
	private String city;
	@Value("23")
	private String age;

	

}
