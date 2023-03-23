package imagecopy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyImageCharByChar {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream(new File("/Users/nandhakumar/Documents/java/exercise7/src/comments.png"));
		OutputStream os = new FileOutputStream(new File("/Users/nandhakumar/Documents/java/exercise7/src/comments1.png"));
		byte[] buffer = new byte[1];
        int length;
        while ((length = is.read(buffer)) > 0) {
        	System.out.println("bytebybyte");
            os.write(buffer, 0, length);
        }
        System.out.println("Copied ");
	}
}
