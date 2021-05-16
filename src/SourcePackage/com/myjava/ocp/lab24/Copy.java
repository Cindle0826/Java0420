package SourcePackage.com.myjava.ocp.lab24;

import java.io.FileReader;
import java.io.FileWriter;

public class Copy {
	public static void main(String[] args) {
		/*
		 * 把A的內容給B
		 */
		String from= "src/SourcePackage/com/myjava/ocp/lab23/news.txt";
		String to= "src/SourcePackage/com/myjava/ocp/lab23/news_backup.txt";
		try(FileReader fr = new FileReader(from);
			FileWriter fw = new FileWriter(to)	) {
			
			int x ;
			while( (x = fr.read()) !=-1) {
				fw.write((char)x);
			}
		} catch (Exception e) {
			
		}
	}

}
