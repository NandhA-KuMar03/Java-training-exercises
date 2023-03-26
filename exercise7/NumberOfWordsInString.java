package numberofwords;
import java.util.Scanner;
public class NumberOfWords {
	public static void main(String[] args) {
		String string = "";
		Scanner scanner = new Scanner(System.in);
		string = scanner.nextLine();
		String arr[] = string.trim().split(" ");
		System.out.println(arr.length);
		scanner.close();
	}
}