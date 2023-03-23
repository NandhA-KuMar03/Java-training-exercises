package question10;

import java.io.File;

public class Delete {
	public static void main(String[] args) {
		File file = new File("/Users/nandhakumar/Documents/java/exercise7/src/sample2");
		if (file.delete()) {
            System.out.println("File deleted successfully");
        }
	}
}
