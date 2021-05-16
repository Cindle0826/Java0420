package SourcePackage.com.myjava.ocp.lab16.User.client;

import java.util.InputMismatchException;
import java.util.Scanner;

import SourcePackage.com.myjava.ocp.lab16.User.exception.UserLoginfailException;
import SourcePackage.com.myjava.ocp.lab16.User.server.UserService;

public class UserClient {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("請輸入 username:");
			String username=sc.next();
			System.out.println("請輸入 password:");
			String password=sc.next();
			UserService userService=new UserService();
			boolean check= userService.login(username, password);
			System.out.println(check ? "登入成功" : "登入失敗");
		} catch (InputMismatchException e) {
			System.out.println("輸入錯誤(密碼請輸入數字) !");
		} catch (UserLoginfailException e) {
			System.out.println(e);
			e.how2do();
		}
	}

}
