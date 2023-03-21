package message;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MessageDesignPrint {
public static void main(String[] args) {
	ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		executorService.execute(()->{
				String s = "[-----Mes";
				display(s);

		});
		executorService.execute(()->{
				String s = "sage--";
				display(s);

		});
		executorService.execute(()->{
			String s = "---]";
				display(s);
		});
		
		executorService.shutdown(); 
}

synchronized public static void display(String msg1) {
	System.out.print(msg1);
	}
}