package SourcePackage.com.myjava.ocp.lab19;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class OpenWeatherDemo {
	static Runnable r = () -> {
		try {
			String path = "https://api.openweathermap.org/data/2.5/weather?q=Taipei&appid=e292145497acd850a0eb7b90b8117f7d";
			String json = new Scanner(new URL(path).openStream()).useDelimiter("\\A").next();
			JsonObject jo = JsonParser.parseString(json) //頗析Json字串
									  .getAsJsonObject() //取得Json物件
									  .getAsJsonObject("main");//取得名稱為main的json物件
			System.out.println(jo.get("temp").getAsDouble()-273.15);//絕對零度273.15
			System.out.println(jo.get("feels_like").getAsDouble()-273.15);
			
			JsonObject jo2 = JsonParser.parseString(json)
									   .getAsJsonObject()
									   .getAsJsonArray("weather")
									   .get(0)
									   .getAsJsonObject();
			System.out.println(jo2.get("description").getAsString());
			String ico_url="http://openweathermap.org/img/wn/%s.png";
			System.out.println(String.format(ico_url, jo2.get("icon").getAsString()));
		} catch (MalformedURLException e) {

		} catch (IOException e) {

		}
	};
	public static void main(String[] args) {
		new Thread(r).start();
	}
}
