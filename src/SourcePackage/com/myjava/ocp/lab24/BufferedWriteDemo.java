package SourcePackage.com.myjava.ocp.lab24;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriteDemo {

	public static void main(String[] args) {
		/*
		 * 幫你寫入資料到你要的檔案裡
		 */
		String []rows = {"apple", "banana"};
		String path = "src/SourcePackage/com/myjava/ocp/lab24/news.txt";
		try(FileWriter fw= new FileWriter(path,true);
			BufferedWriter bw = new BufferedWriter(fw,16 * 1024)	) {
			for(String row:rows) {
				bw.write("\n"+row);
			}
		} catch (Exception e) {
			
		}

	}

}
