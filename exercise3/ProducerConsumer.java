package producerconsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ProducerConsumer {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		Market mr = new Market();
			es.execute(()->{
				for(int i=0;i<5;i++) {
					mr.produce();
				}
			});
			es.execute(()->{
				for(int i=0;i<5;i++) {
					mr.consume();	
				}
			});
			es.shutdown();
		}
}

class Market{
	boolean flag;
	synchronized public void produce() {
		if(flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Produced");
//		try {
//		Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		flag=true;
		notify();


	}
	
	synchronized public void consume() {
		if(!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("consumed");
		flag=false;
		notify();

		
	}
}