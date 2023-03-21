package digitalclock;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DigitalClock{
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		Timer t = new Timer();

			executorService.execute(()->{
				while(true)
				t.Second();
			});

			System.out.println();
			
			executorService.execute(()->{
				while(true) {
					t.Minute();
				}
			});

			executorService.execute(()->{
				while(true) {
					t.Hour();
				}
			});
			executorService.shutdown();
			
	}
}

class Timer{	
	
	int hour =0;
	int minute=0;
	int second=0;

	synchronized public void Hour() {
		try {
			wait();	
			if(minute == 59){
				minute=0;
				++hour;
				if(hour == 24) {
					hour=0;
				}
			}
			else {
				minute++;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized public void Minute() {
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized public void Second() {
		try {
			wait(1000);
			if(second == 59) {
				notifyAll();
			}
			if(second == 60) {
				second=0;
			}
			System.out.println(hour + " " + minute + " " + second);
			++second;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
