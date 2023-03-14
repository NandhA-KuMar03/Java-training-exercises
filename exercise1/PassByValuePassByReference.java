package passbyvaluepassbyreference;

public class PassByValuePassByReference {
	
	int size = 35;
	
	public PassByValuePassByReference() {
		System.out.println(size);
	}

	public static void main(String[] args) {
		int intValue = 10;
		float floatValue = 1.8f;
		byte byteValue = 127;
		char charValue = 'a';
		boolean boolValue = false;
		double doubleValue = 1.2345675432d;
		long longValue = 12343567L;
		short shortValue = 1234;
		System.out.println("Primitive data types");
		System.out.println("Before Passing");
		System.out.println(intValue + " : Int value");
		System.out.println(floatValue + " : Float Value");
		System.out.println(byteValue + " : Byte value");
		System.out.println(charValue + " : Character value");
		System.out.println(boolValue + " : Boolean value");
		System.out.println(doubleValue + " : Double value");
		System.out.println(longValue + " : Long value");
		System.out.println(shortValue + " : Short value");
		System.out.println("====================================");
		System.out.println("After Passing");
		System.out.println(intValue + " : Int value");
		System.out.println(floatValue + " : Float Value");
		System.out.println(byteValue + " : Byte value");
		System.out.println(charValue + " : Character value");
		System.out.println(boolValue + " : Boolean value");
		System.out.println(doubleValue + " : Double value");
		System.out.println(longValue + " : Long value");
		System.out.println(shortValue + " : Short value");
		System.out.println("====================================");
		System.out.println("====================================");
		System.out.println("Objects and arrays");
		System.out.println("Before Passing");
		int[] arr = new int[5];
		for(int i:arr) {
			System.out.println(i);
		}
		passingObjects(arr);
		System.out.println("After Passing");
		for(int i:arr) {
			System.out.println(i);
		}
		
		System.out.println("====================================");
		System.out.println("====================================");
		System.out.println("Before Passing");
		
		PassByValuePassByReference obj = new PassByValuePassByReference();
		Class2 obj1 = new Class2();
		obj1.PassByReference(obj);
		System.out.println("After Passing");
		System.out.println(obj.size);
		
		
		passingPrimitive(intValue , floatValue , byteValue , charValue , boolValue , doubleValue , longValue , shortValue);

	}

	public static void passingObjects(int[] arr) {
		arr[0] = 3;
		arr[2] = 4;
		arr[1] = 54;
	}

	public static void passingPrimitive(int intValue ,float floatValue ,byte byteValue ,char charValue ,boolean boolValue ,double doubleValue ,long longValue ,short shortValue) {
		intValue = 20;
		floatValue = 2.8f;
		byteValue = -17;
		charValue = 'c';
		boolValue = true;
		doubleValue = 121.345632d;
		longValue = 2312435L;
		shortValue = 124;
	}

}

class Class2{
	public void PassByReference(PassByValuePassByReference obj) {
		obj.size = 10;
	}
}