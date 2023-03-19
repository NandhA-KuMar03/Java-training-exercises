package constructor;
/**
 * 
 * @author nandhakumar
 *class - constructor
 *main method creates a object of derived class
 */
public class Constructor {
	public static void main(String[] args) {
		DerivedClass obj = new DerivedClass();
	}
}
/**
 * 
 * @author nandhakumar
 *class - baseclass
 *constructor throws a exception
 */
class BaseClass{
	public BaseClass() throws ArithmeticException{
		System.out.println("Here");
		throw new ArithmeticException();

	}
}

/**
 * 
 * @author nandhakumar
 *class - Derived Class
 *constructor tries to catch the base class constructor
 *
 */
class DerivedClass extends BaseClass{
	public DerivedClass() {
		try {
			
		}
		catch(ArithmeticException e) {
			System.out.println("IN CATCH BLOCK");
			e.printStackTrace();

		}
	}
}