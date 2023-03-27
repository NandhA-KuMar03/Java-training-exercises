package copycontentslinebyline;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyContentsLineByLine {
	public static void main(String[] args) throws IOException{
		File file = new File("src/copycontentslinebyline/sample.txt");
		File newFile = new File("src/copycontentslinebyline/CopyFile.txt");
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(newFile));
		String string;
		while((string = bufferedReader.readLine()) != null) {
			bufferedWriter.write(string);
			bufferedWriter.newLine();
			System.out.println(string);
			System.out.println("==========");
		}
		bufferedReader.close();
		bufferedWriter.close();
		System.out.println("Copied successfully");
	}
}