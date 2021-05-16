package SourcePackage.com.myjava.ocp.lab22;

import java.io.File;

public class Lab {
	public static void main(String[] args) {
		/*
		 * 找出mouse.txt
		 */
		File path = new File("src/SourcePackage/com/myjava/ocp/lab22/files");
		mouse(path);
	}

	public static File mouse(File f2) {
		File[] files = f2.listFiles();// files = path.listFiles()
		for (File f : files) {
			if (f.isFile()) {
				System.out.printf("檔案 %s\n", f);
			} else {
				System.out.printf("目錄 %s\n", f);
				 return mouse(f);
			}
		}
		return null;
	}
}
