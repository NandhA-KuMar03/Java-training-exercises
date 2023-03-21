package evenodd;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EvenOdd {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		PrintValues ps = new PrintValues();
		for(int i=0;i<50;i++) {
			es.execute(()->{
				ps.odd();
			});
			
			es.execute(()->{
				ps.even();
			});
		}
		es.shutdown();
	}
}
class PrintValues{
	int oddNum = 1;
	int evenNum = 2;
	public void odd() {
		System.out.println(oddNum);
		oddNum += 2;
	}
	public void even() {
		System.out.println(evenNum);
		evenNum += 2;
	}
}