package question10;

import java.io.File;

public class Rename {
	public static void main(String[] args) {
		File file = new File("/Users/nandhakumar/Documents/java/exercise7/src/sample1");
		File file2 = new File("/Users/nandhakumar/Documents/java/exercise7/src/sample2");
		boolean success = file.renameTo(file2);
		if(success) {
			System.out.println("File renamed");
		}
	}
}
