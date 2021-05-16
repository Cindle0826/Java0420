package SourcePackage.com.myjava.ocp.lab24;

import java.io.FileReader;

public class ReadNews {

	public static void main(String[] args) {
		String path= "src/SourcePackage/com/myjava/ocp/lab24/news.txt";
		try(FileReader fr =new FileReader(path)) {
			int x;
			while((x = fr.read()) != -1) { //從Ascll的數值轉變成char -1帶表讀到檔位
				System.out.print((char)x); //一個一個抓出資料
			}
			System.out.println();
		} catch (Exception e) {
			
		}

	}

}
