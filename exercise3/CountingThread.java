package countingthread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountingThread {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		PrintValues printValues = new PrintValues();
		for(int i=0;i<100;i++) {
			executorService.execute(()->{
				printValues.display();
			});
		}
	}
}

class PrintValues{
	int i=1;
	public void display() {
		if(i%10==0) {
			System.out.println("String");
			i++;
		}
		else {
			System.out.println(i++);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}