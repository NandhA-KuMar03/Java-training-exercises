package numbeformatexception;
import java.util.*;
public class NumberFormatExeption1 {
	
	static void validate(int mark) throws NegativeRangeException {
		if(mark<0) {
			throw new NegativeRangeException("Please enter a valid number between 0 and 100");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int marks[] = new int[10];
		float sum=0;
		int counter=0;
		System.out.println("Enter ten numbers for calculating average");
		while(counter<10) {
			System.out.println("Enter number");
			try {
				int n = sc.nextInt();
				validate(n);
				marks[counter] = n;
				counter++;
			}
			catch(NegativeRangeException e) {
				System.out.println(e);
				continue;
			}
			catch(Exception e) {
				System.out.println("Exception :Enter a number");
				sc.next();
			}		
			}
			for(int i=0;i<10;i++) {
				sum+=marks[i];
			}
			System.out.println(sum/10);
	}
}
