package primenumber;

public class PrimeNumber {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			boolean flag = true;
			for(int j=2;j<=i/2;j++) {
				if(i%j == 0)
					flag = false;
			}
			if(flag)
				System.out.println(i + " is a Prime Number");
		}
	}
	
}
