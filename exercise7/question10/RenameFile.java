package question10;

import java.io.File;

public class Rename {
	public static void main(String[] args) {
		File file = new File("src/question10/sample1.txt");
		File newFile = new File("src/question10/sample2.txt");
		boolean success = file.renameTo(newFile);
		if(success) {
			System.out.println("File renamed");
		}
	}
}