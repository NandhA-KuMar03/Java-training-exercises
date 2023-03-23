package nonalphabetic;

import java.io.IOException;
import java.util.Scanner;

public class NonAlphabeticCharacters {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		AcceptValue acceptValues = new AcceptValue();
		String str = "";
		int count=0;
		while(true) {
			System.out.println("Enter the input");
			char s = sc.next().charAt(0);
			if(s=='q') {
				System.out.println(count + " : Number of letters passed");
				System.out.println(str +" : Total String ");
			}
				try {
					acceptValues.CheckValue(s);
					str+=s;
					count++;
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
