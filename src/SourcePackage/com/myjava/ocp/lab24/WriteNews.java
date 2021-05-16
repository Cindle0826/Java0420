package SourcePackage.com.myjava.ocp.lab24;

import java.io.FileWriter;
import java.io.IOException;

public class WriteNews {

	public static void main(String[] args) {
		String path = "src/SourcePackage/com/myjava/ocp/lab24/news.txt";
		try(FileWriter fw = new FileWriter(path,true)) { //預設是false 會覆蓋檔案內容 true會保留之前的資料
			String data = "Welcome vs wellcome";
			fw.write(data);
		} catch (IOException e) {

		}
	}

}
