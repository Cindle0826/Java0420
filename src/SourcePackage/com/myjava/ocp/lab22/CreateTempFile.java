package SourcePackage.com.myjava.ocp.lab22;

import java.io.File;
import java.io.IOException;

public class CreateTempFile {

	public static void main(String[] args) throws IOException {
		File path = new File("src/SourcePackage/com/myjava/ocp/lab22/files");
		File file = File.createTempFile("temp", ".txt",path);
		System.out.printf("暫存檔案是否存在: %b\n",file.exists());
	}

}
