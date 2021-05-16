package SourcePackage.com.myjava.ocp.des.utils;

import java.io.FileNotFoundException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.NoSuchPaddingException;

public class DemoTest {
	public static void main(String[] args) throws Exception {
		String article = "紅鏈收購台鏈 郭台銘震驚";
		String path = "src/SourcePackage/com/myjava/ocp/des/utils/mydeskey_1595245837511.bin";
		EncrypDES des = new EncrypDES(path);
		byte [] article_des=des.Encrytor(article);
		byte [] article_dess=des.Decryptor(article_des);
		System.out.println("明文: "+article);
		System.out.println("加密後: "+ new String(article_des));
		System.out.println("解密後: "+ new String(article_dess));
		
	}
}
