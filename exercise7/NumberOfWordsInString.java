package numberofwords;
import java.util.Scanner;
public class NumberOfWords {
	public static void main(String[] args) {
		String s = "";
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		String arr[] = s.split(" ");
		System.out.println(arr.length);
	}
}
