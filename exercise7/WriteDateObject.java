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
		Date dateObject = new Date();
		OutputStream file = new FileOutputStream("/Users/nandhakumar/Documents/java/exercise7/src/writedateobject/dateObj.txt");
		ObjectOutputStream outputStream = new ObjectOutputStream(file);
		outputStream.writeObject(dateObject);
		
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("/Users/nandhakumar/Documents/java/exercise7/src/writedateobject/dateObj.txt"));
		System.out.println(objectInputStream);
		outputStream.close();
	}
}