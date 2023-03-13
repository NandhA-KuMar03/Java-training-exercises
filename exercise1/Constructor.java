package constructor;

public class Constructor {

	public static void main(String[] args) {
		C c = new C();

	}

}

class B {
	public B() {
		System.out.println("in B");
	}
}

class A {
	public A() {
		System.out.println("in A");
	}
}
class C extends A{
	B b = new B();
}