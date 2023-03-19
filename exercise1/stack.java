package stack;
import java.util.*;

/**
 * 
 * @author nandhakumar
 *Interface fixed has three abstract methods push pop and print
 * class fixedStack implements the interface and overrides the methods
 *method push,pop,print - stack functionalities
 */
interface fixed{
	void push(int number);
	void pop();
	void print();
}

/**
 * 
 * @author nandhakumar
 *class FixedStack
 *method push - pushing elements to stack
 */
class FixedStack implements fixed{
	int top=0;
	int[] arr;
	public FixedStack(int n) {
		arr = new int[n];
	}
	@Override
	public void push(int number) {
		if(top == arr.length)
			System.out.println("array full");
		else {
			arr[top] = number;
			System.out.println(number + " inserted at position " + top);
			top++;
		}
	}

	@Override
	public void pop() {
		if(top == 0)
			System.out.println("array already empty");
		else {
			arr[top] = 0;
			System.out.println("Number deleted");
			top--;
		}	
	}

	@Override
	public void print() {
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}
	
}

/**
 * 
 * @author nandhakumar
 *class Stack
 *input user and do the function appropiately.
 */
public class Stack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		FixedStack fs = new FixedStack(n);
		while(true) {
			System.out.println("1 for push 2 for pop 3 for print");
			int s = sc.nextInt();
			switch(s) {
			case 1:
				int number = sc.nextInt();
				fs.push(number);
				break;
			case 2:
				fs.pop();
				break;
			case 3:
				fs.print();
				break;
			default:
				System.out.println("Invalid choice");
			}
			
		}
	}
}
