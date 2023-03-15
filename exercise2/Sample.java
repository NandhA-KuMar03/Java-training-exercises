package sample;

public class Sample {
	public void mth1() {
		mth2();
		System.out.println("caller");
	}
	public void mth2() {
		try {
			System.exit(0);
//			return;
		}
		catch(Exception e) {
			System.out.println("catch-mth2");
		}
		finally {
			System.out.println("finally-mth2");
		}
	}
	public static void main(String[] args) {
		Sample s= new Sample();
		s.mth1();
	}
}