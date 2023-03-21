package threadstart;

public class ThreadStart {
	public static void main(String[] args) {
		Thread displayThread = new Thread(new Runnable() {

			@Override
			public void run() {
				display();
			}

		});
		displayThread.start();
		displayThread.suspend();
		displayThread.start();
	}
	
	public static void display() {
		System.out.println("in java thread");
	}
}
