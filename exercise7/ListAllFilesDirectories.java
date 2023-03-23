package listallfiles;

import java.io.File;

public class ListAllFilesDirectories {
	public static void main(String[] args) {
		File file = new File("/Users/nandhakumar/Documents/java/exercise7/src");
		String filesFolders[] = file.list();
		for(int i=0;i<filesFolders.length;i++) {
			System.out.println(filesFolders[i]);
		}
	}
}
