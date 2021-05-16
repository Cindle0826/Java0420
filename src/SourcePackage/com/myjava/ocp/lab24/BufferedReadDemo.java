package SourcePackage.com.myjava.ocp.lab24;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReadDemo {

	public static void main(String[] args) {
		/*
		 * 逐航依序讀取
		 */
		String path = "src/SourcePackage/com/myjava/ocp/lab24/news.txt";
		try(FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);	) {
			String data;
			while((data = br.readLine())!= null) {
				System.out.println(data);
			}
		} catch (Exception e) {
			
		}
	}

}
