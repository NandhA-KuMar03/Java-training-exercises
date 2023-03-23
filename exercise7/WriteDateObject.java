package writedateobject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Date;

public class WriteDateObject {
	public static void main(String[] args) throws IOException {
		Date d1 = new Date();
		OutputStream file = new FileOutputStream("/Users/nandhakumar/Documents/java/exercise7/src/writedateobject/dateObj.txt");
		ObjectOutputStream fw = new ObjectOutputStream(file);
		fw.writeObject(d1);
		
		ObjectInputStream oi = new ObjectInputStream(new FileInputStream("/Users/nandhakumar/Documents/java/exercise7/src/writedateobject/dateObj.txt"));
		System.out.println(oi);
	}
}