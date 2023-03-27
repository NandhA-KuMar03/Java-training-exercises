package question10;

import java.io.File;

public class Length {
	public static void main(String[] args) {
		File file = new File("src/question10/sample1.txt");
		System.out.println(file.length()+" bytes");
	}
}