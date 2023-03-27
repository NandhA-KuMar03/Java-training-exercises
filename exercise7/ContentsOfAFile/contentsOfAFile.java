package contentsofafile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ContentsOfaFile {
	public static void main(String[] args) throws IOException {
		
		File path = new File("src/contentsofafile/sample.txt");
		BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
		String string;
		while((string = bufferedReader.readLine()) !=null) {
			System.out.println(string);
		}
		bufferedReader.close();
//		   File directory = new File("./");
//		   System.out.println(directory.getAbsolutePath());
	}
}