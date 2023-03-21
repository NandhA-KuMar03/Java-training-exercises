package producerconsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProducerConsumer {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		Market market = new Market();
			executorService.execute(()->{
				for(int i=0;i<5;i++) {
					market.produce();
				}
			});
			executorService.execute(()->{
				for(int i=0;i<5;i++) {
					market.consume();	
				}
			});
			executorService.shutdown();
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