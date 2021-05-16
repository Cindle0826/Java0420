package SourcePackage.com.myjava.ocp.lab13;


import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TWSE {
	public static void main(String[] args) throws Exception {
		String pathString = "src/SourcePackage/com/myjava/ocp/lab13/BWIBBU_d.csv";
		File file = new File(pathString);
		String csvString = new Scanner(file).useDelimiter("//A").next();
		// System.out.println(csvString);
		List<Stock> list=new ArrayList<Stock>();
		String[] rows = csvString.split("\n");
		for(String row:rows) {
			if(row.trim().split(",").length==7 && !row.trim().contains("證券代號")) {
				String data=row.trim().replace("\"", "");
				//System.out.println(data);
				String[] da=data.trim().split(",");
				System.out.println(data);
				Stock stock=new Stock();
				stock.證券代號=da[0].trim();
				stock.證券名稱=da[1].trim();
				stock.殖利率=da[2].trim();
				stock.股利年度=da[3].trim();
				stock.本益比=da[4].trim();
				stock.股價淨值比=da[5].trim();
				stock.財報年季=da[6].trim();
				list.add(stock);
			}
		}
		//System.out.println(list);
		list.stream()
				.filter(Stock -> !Stock.本益比.equals("-") && Double.parseDouble(Stock.本益比) <10)
				.filter(Stock -> !Stock.殖利率.equals("-") && Double.parseDouble(Stock.殖利率) >7) //高殖利率股票>7
				.filter(Stock -> !Stock.股價淨值比.equals("-") && Double.parseDouble(Stock.股價淨值比) <1)
				.forEach(System.out::println);
	}
}
