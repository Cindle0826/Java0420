package SourcePackage.com.myjava.ocp.lab26;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesCopyAndDelete {
	public static void main(String[] args) {
		Path source = Paths.get("src/SourcePackage/com/myjava/ocp/lab26/data.txt");
		Path dest	= Paths.get("src/SourcePackage/com/myjava/ocp/lab26/data.txt");
		try {
			Files.copy(source, dest,StandardCopyOption.REPLACE_EXISTING);
			Files.delete(source);
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
		

	}

}
