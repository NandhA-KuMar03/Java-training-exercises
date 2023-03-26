package copycontentsoffile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyContentsOfFile {
	public static void main(String[] args) throws IOException{
		File file = new File("src/copycontentsoffile/sample.txt");
		File newFile = new File("src/copycontentsoffile/CopyFile.txt");
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(newFile));
		int character;
		while((character = bufferedReader.read()) != -1) {
			bufferedWriter.write((char)character);
		}
		bufferedReader.close();
		bufferedWriter.close();
		System.out.println("Copied successfully");
	}
}