package dynamicstack;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 
 * @author nandhakumar
 *interface dynamic has three abstract methods push pop and print
 *class dynamicStack implements the interface and overrides the methods
 *method push,pop,print - stack functionalities
 */
interface dynamic{
	void push(int number);
	void pop();
	void print();
}

class dynamicStack1 implements dynamic{
	int top=0;
	int[] arr;
	public dynamicStack1() {
		arr = new int[0];
	}
	@Override
	public void push(int number) {
		int copy[] = Arrays.copyOf(arr, ++top);
		arr = copy;
		copy[top-1] = number;
		System.out.println(number + " inserted at position " + (top));
	}
	@Override
	public void pop() {
		if(top == 0)
			System.out.println("array already empty");
		else {
			int copy[] = Arrays.copyOf(arr, --top);
			arr = copy;
			System.out.println("Number deleted");
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
 *class dynamicStack
 *user input and call the functionalities
 */
public class DynamicStack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		dynamicStack1 ds = new dynamicStack1();
		while(true) {
			System.out.println("1 for push 2 for pop 3 for print");
			int s = sc.nextInt();
			switch(s) {
			case 1:
				int number = sc.nextInt();
				ds.push(number);
				break;
			case 2:
				ds.pop();
				break;
			case 3:
				ds.print();
				break;
			default:
				System.out.println("Invalid choice");
			}
		}
	}
}
