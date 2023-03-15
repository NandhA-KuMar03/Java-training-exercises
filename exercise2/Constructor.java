package constructor;

public class Constructor {
	public static void main(String[] args) {
		DerivedClass obj = new DerivedClass();
	}
}

class BaseClass{
	public BaseClass() throws ArithmeticException{
		throw new ArithmeticException();
	}
}

class DerivedClass extends BaseClass{
	public DerivedClass() {
		try {
			
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("IN CATCH BLOCK");
		}
	}
}