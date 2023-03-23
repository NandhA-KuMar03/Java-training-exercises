package copycontentsoffile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyContentsOfFile {
	public static void main(String[] args) throws IOException{
		File file = new File("/Users/nandhakumar/Documents/java/exercise7/src/contentsofafile/sample");
		File newFile = new File("/Users/nandhakumar/Documents/java/exercise7/src/copycontentsoffile/CopyFile.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		BufferedWriter br1 = new BufferedWriter(new FileWriter(newFile));
		int str;
		while((str = br.read()) !=-1) {
			br1.write((char)str);
		}
		br1.close();
		System.out.println("Copied successfully");
	}
}
