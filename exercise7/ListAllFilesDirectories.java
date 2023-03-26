package listallfiles;

import java.io.File;
//List the contents of a file
public class ListAllFilesDirectories {
	public static void main(String[] args) {
		if(args.length != 1) {
			System.exit(0);
		}
		File file = new File(args[0]);
		String filesFolders[] = file.list();
		for(int i=0 ; i<filesFolders.length ; i++) {
			System.out.println(filesFolders[i]);
		}
	}
}