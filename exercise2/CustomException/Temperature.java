package customexception;
/**
 * 
 * @author nandhakumar
 *class - temperature
 * constructor - user passed message will be passed as the exception message
 */
public class Temperature extends Exception{  
	public Temperature(String str) {
		super(str);
	}
}  