package singleton;


/*
 * class - singleton
 * main method creates two thread and start
 */
public class SingleTonClass {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				MySingleTon.createInstance();
				
			}
		}).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				MySingleTon.createInstance();
			}
		}).start();
//		MySingleTon.createInstance();
//		MySingleTon.createInstance();
	}
}

/**
 * 
 * @author nandhakumar
 *class - mysingleton
 *constructor printing the object creation
 *createInstance method returns new object if object is null and same object if object is already created.
 */
class MySingleTon{
	private MySingleTon() {
		System.out.println("singleton object created...");
	}
	private static MySingleTon obj;
	synchronized public static MySingleTon createInstance() {
		if(obj==null) {
//			System.out.println("first time");
			obj=new MySingleTon();
			System.out.println(obj);
		}else {
//			System.out.println("From second time");
			System.out.println(obj);
			return obj;
		}
		return obj;
	}
}
