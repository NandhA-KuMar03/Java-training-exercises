package contentsofafile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ContentsOfaFile {
	public static void main(String[] args) throws IOException {
		File file = new File("/Users/nandhakumar/Documents/java/exercise7/src/contentsofafile/sample"); 
		BufferedReader br = new BufferedReader(new FileReader(file));
		String str;
		while((str = br.readLine()) !=null) {
			System.out.println(str);
		}
	}
}
