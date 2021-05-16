package SourcePackage.com.myjava.ocp.lab22;

import java.io.File;

public class FileOrDir {

	public static void main(String[] args) {
		File f = new File("src/SourcePackage/com/myjava/ocp/lab22/files");
		File[] files=f.listFiles();
		for(File file:files) {
			System.out.printf("(%s) %s\n",file.isFile()?"檔案":"目錄",file);
		}

	}

}
