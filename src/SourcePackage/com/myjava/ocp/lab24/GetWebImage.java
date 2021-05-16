package SourcePackage.com.myjava.ocp.lab24;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class GetWebImage {

	public static void main(String[] args) throws Exception {
		String from = "https://cdn-jaguarlandrover.com/api/v1/image/18632/w/680.jpg";
		String to = "src/SourcePackage/com/myjava/ocp/lab24/car1.jpg";
		URL url = new URL(from);
		URLConnection hc = url.openConnection(); //破解機器人讀圖片
		hc.setRequestProperty("User-Agent", "我不是機器人");
		try(InputStream is = hc.getInputStream();
			FileOutputStream fos = new FileOutputStream(to)	) {
			int x ;
			while((x = is.read()) != -1) {
				System.out.println(x);
				fos.write(x);
			}
		} catch (Exception e) {

		}
	}

}
