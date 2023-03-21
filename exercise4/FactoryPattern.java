package factory;
import java.util.Scanner;

public class FactoryPattern {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		ObjectForFactory obj = new ObjectForFactory();
		Phone phone = obj.ObjectFactory();
		phone.FeaturesOfPhone();
	}
}

class ObjectForFactory{
	public Phone ObjectFactory() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the type of Phone");
		String s = sc.next();
		Phone obj1 = (Phone) Class.forName("factory."+s).newInstance();
		return obj1;
	}
}

interface Phone{
	abstract void FeaturesOfPhone();
}

class Android implements Phone{
	@Override
	public void FeaturesOfPhone() {
		System.out.print("Hello moto! You can set custom ringtone ");
	}
}

class Iphone implements Phone{
	@Override
	public void FeaturesOfPhone() {
		System.out.print("Welcome to Iworld! ");
	}	
}