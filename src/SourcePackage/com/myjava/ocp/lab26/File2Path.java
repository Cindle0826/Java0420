package SourcePackage.com.myjava.ocp.lab26;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class File2Path {

	public static void main(String[] args)throws Exception {
		File file = new File("src/SourcePackage/com/myjava/ocp/lab26/data.txt");
		Path path = file.toPath();
		byte[] bytes = Files.readAllBytes(path);
		String data = new String(bytes,"UTF-8");
		System.out.println(data);
	}

}
