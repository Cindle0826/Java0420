package SourcePackage.com.myjava.ocp.lab13;

import java.io.File;
import java.net.URL;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import com.google.gson.Gson;

public class RiceDemo {
	public static void main(String[] args) throws Exception {
		List<Rice> list = new LinkedList<>();
		File file=new File("src\\SourcePackage\\com\\myjava\\ocp\\urls.txt");
		String urls=new Scanner(file).useDelimiter("\\A").next();
		for(String urlString:urls.split("\n")) {
			addDate(urlString.trim(), list);
		}
		// 3.分析
		list.stream().filter(rice -> rice.品名.contains("日本"))
				.filter(rice -> rice.品名.contains("日本"))
				.forEach(rice -> System.out.printf("%s %s %s\n", rice.品名, rice.不合格原因));
	}

	private static void addDate(String urlpath, List list) throws Exception {
		// 1.抓取資料來源(Json)adRices 注入
		URL url = new URL(urlpath);
		String jsonString = new Scanner(url.openStream(), "UTF-8").useDelimiter("\\A").next();// useDelimiter全選
		// 2.將Json透過Gson 轉乘BadRice[]
		Rice[] Rices = new Gson().fromJson(jsonString, Rice[].class);
		// 將rice加入到List容器
		Collections.addAll(list, Rices);
	}

}
