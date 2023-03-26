package question10;

import java.io.File;

public class Delete {
	public static void main(String[] args) {
		File file = new File("src/sample1.txt");
		if (file.delete()) {
            System.out.println("File deleted successfully");
        }
	}
}