package SourcePackage.com.myjava.ocp.lab22;

import java.io.File;
import java.io.IOException;

//建立 fruit/apple.txt
public class CreateNewFile2 {

	public static void main(String[] args) throws IOException {
		File path = new File("src/SourcePackage/com/myjava/ocp/lab22/files/fruit/apple.txt");
		System.out.printf("檔案是否存在: %b\n", path.exists());//確認檔案
		if (!path.exists()) {
			boolean check = path.mkdir();// 建立路徑  兩層以上mkdirs
			System.out.printf("建立路徑: %b\n", check); 
			if(check) { //建立路徑是否成功
				File file = new File("src/SourcePackage/com/myjava/ocp/lab22/files/fruit");
				System.out.printf("建立檔案成功 %b\n",file);
			}
		}
	}

}
