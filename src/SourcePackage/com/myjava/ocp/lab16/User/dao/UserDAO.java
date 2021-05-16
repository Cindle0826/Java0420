package SourcePackage.com.myjava.ocp.lab16.User.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.google.gson.Gson;

import SourcePackage.com.myjava.ocp.lab16.User.po.User;

public class UserDAO {

	public User[] query() {
		File file = new File("src/SourcePackage/com/myjava/ocp/lab16/User/db/users.json");
		String json = null;
		try {
			json = new Scanner(file).useDelimiter("//A").next();
		} catch (FileNotFoundException ex) {
			System.out.println("user.json 檔案位置不正確, " + ex);
			return null;
		}
		User[] users=new Gson().fromJson(json, User[].class);
		return users;
	}
}
