package SourcePackage.com.myjava.ocp.lab24;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class SetOutDemo {
	public static void main(String[] args) {
		String path = "src/SourcePackage/com/myjava/ocp/lab24/log.txt";
		try(FileOutputStream fos = new FileOutputStream(path,true);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			PrintStream out = new PrintStream(bos)	) {
			
			System.setOut(out);
			System.out.println("Hello Java");
			System.out.println("Hello Python");
		} catch (Exception e) {
			
		}
	}
}
