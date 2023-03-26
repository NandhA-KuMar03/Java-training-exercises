package numberOfCharacters;
import java.util.Scanner;

public class NumberOfCharacters {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count=0;
		System.out.println("Enter the input");
		while(scanner.hasNext()) {
			char character = scanner.next().charAt(0);
				count++;
		}
		System.out.println("Program exited " + count);
		scanner.close();
	}
}