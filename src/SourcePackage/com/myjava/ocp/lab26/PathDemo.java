package SourcePackage.com.myjava.ocp.lab26;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {

	public static void main(String[] args) {
		Path path = Paths.get("src/SourcePackage/com/myjava/ocp/lab26/Functions.txt");
		path.forEach(System.out::println);
		System.out.println("getFileName: " + path.getFileName());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getRoot: " + path.getRoot());
		System.out.println("getNameCount: " + path.getNameCount());
		System.out.println("subpath(0, 2): " + path.subpath(0, 2));
		System.out.println("isAbsolute: " + path.isAbsolute());
		System.out.println("toAbsolutePath: " + path.toAbsolutePath());
		System.out.println("toUri: " + path.toUri());
	}

}
