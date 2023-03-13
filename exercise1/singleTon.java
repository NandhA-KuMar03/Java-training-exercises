package singletonclass;

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


class MySingleTon{
	private MySingleTon() {
		System.out.println("singleton object created...");
	}
	private static MySingleTon obj;
	synchronized public static MySingleTon createInstance() {
		if(obj==null) {
//			System.out.println("first time");
			obj=new MySingleTon();
//			System.out.println(obj);
		}else {
//			System.out.println("From second time");
//			System.out.println(obj);
			return obj;
		}
		return obj;
	}
}