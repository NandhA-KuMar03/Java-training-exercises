package numberOfCharacters;
import java.util.Scanner;

public class NumberOfCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		int count=0;
		while(true) {
			System.out.println("Enter the input");
			char s = sc.next().charAt(0);
			if(s=='q') {
				System.out.println(count + " : Number of letters passed");
			}
			else {
				count++;
			}
		}
	}
}