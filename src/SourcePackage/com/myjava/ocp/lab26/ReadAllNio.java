package SourcePackage.com.myjava.ocp.lab26;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadAllNio {
	public static void main(String[] args) throws Exception {
		/*
		 * 平行運算
		 */
		Path path = Paths.get("src/SourcePackage/com/myjava/ocp/lab26/data.txt");
		List<String> list = Files.readAllLines(path);
		System.out.println(list);
		Files.readAllLines(path)
						.stream()
						.forEach(System.out::println);
	}
}
