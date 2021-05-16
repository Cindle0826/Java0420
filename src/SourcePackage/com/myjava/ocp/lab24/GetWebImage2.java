package SourcePackage.com.myjava.ocp.lab24;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GetWebImage2 {

	public static void main(String[] args) throws Exception {
		/*
		 * 爬蟲 Jsoup
		 */
		String from = "https://www.google.com/search?q=baby&sxsrf=ALeKk00kPyZbcLAOuAG3FNotsQcjPO_vQQ:1594989586305&source=lnms&tbm=isch&sa=X&ved=2ahUKEwiO89idp9TqAhV8yYsBHc5SD5YQ_AUoAXoECB8QAw&cshid=1594989625640675&biw=1440&bih=736#imgrc=xo6IdOOiC6Cn-M";
		Document doc = Jsoup.connect(from).get();
		Elements elements = doc.select("img");
		for (Element e : elements) {
			System.out.println(e);
		}
	}

}
