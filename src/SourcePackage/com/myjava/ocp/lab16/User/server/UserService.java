package SourcePackage.com.myjava.ocp.lab16.User.server;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.stream.Stream;

import SourcePackage.com.myjava.ocp.lab16.User.dao.UserDAO;
import SourcePackage.com.myjava.ocp.lab16.User.exception.UserLoginfailException;
import SourcePackage.com.myjava.ocp.lab16.User.po.User;

public class UserService {
	private UserDAO dao=new UserDAO();
	public boolean login(String username,String password)throws UserLoginfailException { //如果使用這個服務的人 可能會產生這個錯誤
		User[] users=dao.query();
		if(users == null) {
			return false;
		}
		
		boolean check= Stream.of(users)
				.anyMatch(u -> u.getUsername().equals(username) && decoedeBase64(u.getPassword()).equals(password));
		
		if(check) {
			return true;
		}else { 
			UserLoginfailException e= new UserLoginfailException("登入失敗");
		throw e;
		}
	}
	
	private String decoedeBase64(String base64string) {
		byte [] base4bytes=Base64.getDecoder().decode(base64string);
		String ans=null;
		try {
			ans= new String(base4bytes,"UTF-8");
		} catch (UnsupportedEncodingException e) {
			System.out.println("讀取失敗");
		}
		return ans;
	}
}
