package divisor;
import java.util.*;
public class Divisor {
	public static void main(String[] args) {
			while(true)
				run();
		}
	
		public static void run() {
			Scanner sc = new Scanner(System.in);
				try {
					System.out.println("enter numerator");
					int num = sc.nextInt();
					System.out.println("enter denominator");
					int den = sc.nextInt();
					System.out.println(num/den);
				}
				catch(InputMismatchException e){
					char a = sc.next().charAt(0);
					if(a=='q' || a=='Q') {
						System.exit(0);
					}
					System.out.println(e);
				}
				catch(ArithmeticException e) {
					System.out.println("Do not enter zero");

				}
				catch(Exception e) {
					System.out.println(e);
				}
		}
	}
