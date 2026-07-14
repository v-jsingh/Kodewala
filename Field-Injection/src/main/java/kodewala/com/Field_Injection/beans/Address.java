package kodewala.com.Field_Injection.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component//Adress becomes spring managed bean
public class Address {
	@Value("12th main")
	private String line1;
	@Value("Btm Stage 2")
	private String line2;
	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", line2=" + line2 + "]";
	}
	
	

}
