package message;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MessageDesignPrint {
public static void main(String[] args) {
	ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		executorService.execute(()->{
				String s = "Message1";
				display(s);
		});
		executorService.execute(()->{
				String s = "Message2";
				display(s);
		});
		executorService.execute(()->{
			String s = "Message3";
				display(s);
		});
		
		executorService.shutdown(); 
}
public static void display(String msg1) {
	System.out.println("[-----" + msg1 + "-----]");
	}
}