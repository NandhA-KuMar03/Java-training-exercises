package nonalphabetic;

import java.io.IOException;
import java.util.Scanner;
public class NonAlphabeticCharacters {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		AcceptValue av = new AcceptValue();
		while(true) {
			System.out.println("Enter the input");
			String s = sc.next();
			for(int i=0;i<s.length();i++) {
				try {
					av.CheckValue(s.charAt(i));
				} catch (NonAlphabeticCustom e) {
					System.out.println(e);
				}
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