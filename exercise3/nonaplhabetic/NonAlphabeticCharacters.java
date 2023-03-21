package nonalphabetic;

import java.io.IOException;
import java.util.Scanner;

public class NonAlphabeticCharacters {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		AcceptValue acceptValues = new AcceptValue();
		while(true) {
			System.out.println("Enter the input");
			char s = sc.next().charAt(0);
				try {
					acceptValues.CheckValue(s);
				} 
				catch (NonAlphabeticCustom e) {
					System.out.println(e);
				}
		}
	}
}

class AcceptValue{
	public void CheckValue(char name) throws NonAlphabeticCustom{
			if(name  <97) {
				throw new NonAlphabeticCustom("Invalid Character");
			}
	}
}
