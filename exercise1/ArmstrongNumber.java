package primenumber;

import java.util.Scanner;
/**
 * 
 * @author nandhakumar
 *class - armstrong 
 *method armstrong checks the condition for armstrong number and prints whether the number is armstrong or not
 *method perfect checks condition for perfect number and prints whether the number is perfect or not
 *method palindrome checks condition for palindrome and prints whether the number is palindrome or not
 */
public class ArmstrongNumber {

	public static void armstrong(int number , int length) {
		int sum=0;
		int cube1 = 0;
		int number1 = number;
		while(number > 0) {
			int temp = number%10;
			cube1 = (int) Math.pow(temp , length);
			sum+= cube1;

			number/=10;
		}
		if(sum == number1)
			System.out.println("Armstrong Number");
		else{
			System.out.println("not a armstrong number");
		}
	}
	
	public static void perfect(int number) {
		int sum=0;
		for(int i=1;i<number;i++) {
			if(number % i==0)
				sum += i;
		}	
		if(number == sum)
			System.out.println("Perfect Number");
		else{
			System.out.println("not a perfect number");
		}
	}
	
	public static void palindrome(int number) {
		String val = String.valueOf(number);
		boolean flag = true;
		for(int i=0,j=val.length()-1; i<j;i++,j--) {
			if(val.charAt(i) != val.charAt(j)) {
				flag=false;
			}
		}
		if(flag) {
			System.out.println("Palindrome");
		}
		else{
			System.out.println("not a palindrome");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int length = String.valueOf(n).length();
		armstrong(n , length);
		perfect(n);
		palindrome(n);
		sc.close();
	}
}


