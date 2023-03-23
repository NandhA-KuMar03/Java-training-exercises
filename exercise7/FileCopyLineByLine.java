package copycontentslinebyline;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyContentsLineByLine {
	public static void main(String[] args) throws IOException{
		File file = new File("/Users/nandhakumar/Documents/java/exercise7/src/contentsofafile/sample");
		File newFile = new File("/Users/nandhakumar/Documents/java/exercise7/src/copycontentslinebyline/CopyFile.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		BufferedWriter br1 = new BufferedWriter(new FileWriter(newFile));
		String str;
		while((str = br.readLine()) !=null) {
			br1.write(str);
			System.out.println(str);
			System.out.println("==========");
		}
		br1.close();
		System.out.println("Copied successfully");
	}
}
