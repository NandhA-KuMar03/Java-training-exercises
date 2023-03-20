package message;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MessageDesignPrint {
public static void main(String[] args) {
	ExecutorService es = Executors.newFixedThreadPool(3);
		
		es.execute(()->{
			synchronized(es) {
				String s = "[-----Message1-----]";
				for(int i=0;i<s.length();i++) {
					display(s.charAt(i));
				}
			}

//			display(s); 

		});
		es.execute(()->{
			synchronized(es) {
				String s = "[-----Message2-----]";
				for(int i=0;i<s.length();i++) {
					display(s.charAt(i));
				}
			}
//			display(s); 
		});
		es.execute(()->{
			synchronized(es) {
				String s = "[-----Message3-----]";
				for(int i=0;i<s.length();i++) {
					display(s.charAt(i));
				}
			}
//			display(s); 
		});
		es.shutdown(); 
}


synchronized public static void display(char msg1) {
	try {
		Thread.sleep(100);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.print(msg1);
}
}
