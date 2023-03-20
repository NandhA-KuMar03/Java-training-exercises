package extendthread;

public class ExtendThread extends Thread{
	StringBuffer a;
	public ExtendThread(StringBuffer a){
		this.a = a;
	}
	
	@Override
	public void run() {
		synchronized(a) {
			System.out.println(Thread.currentThread().getName());
			for(int i=0;i<100;i++) {
				System.out.print(a);
			}
			char c1 = a.charAt(0);
			a.replace(0, 1, Character.toString(++c1));

		}
		super.run();
	}
	
	public static void main(String[] args) {
		StringBuffer a= new StringBuffer("A");
		
		ExtendThread obj1 = new ExtendThread(a);
		ExtendThread obj2 = new ExtendThread(a);
		ExtendThread obj3 = new ExtendThread(a);
		obj1.start();
		obj2.start();
		obj3.start();
	}
}
