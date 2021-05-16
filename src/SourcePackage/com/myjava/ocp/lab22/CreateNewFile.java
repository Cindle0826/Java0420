package SourcePackage.com.myjava.ocp.lab22;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {

	public static void main(String[] args) {
		File file = new File("src/SourcePackage/com/myjava/ocp/lab22/files/myfile.txt");
		System.out.printf("檔案是否存在: %b\n",file.exists());
		if(!file.exists()) {
			try {
				System.out.printf("建立檔案: %b\n",file.createNewFile());
			} catch (IOException e) {
				System.out.printf("建立失敗: %b\n",e.toString());
			}
		}
	}

}
