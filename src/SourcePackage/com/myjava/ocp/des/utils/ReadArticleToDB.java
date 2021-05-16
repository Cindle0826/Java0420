package SourcePackage.com.myjava.ocp.des.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadArticleToDB {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/Article";
		String user = "root";
		String password = "Password123";
		String sql = "SELECT id, content FROM Article";
		try (Connection conn = DriverManager.getConnection(url, user, password);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {

			String path = "src/SourcePackage/com/myjava/ocp/des/utils/mydeskey_1595245837511.bin";
			EncrypDES des = new EncrypDES(path);

			while (rs.next()) {
				int id = rs.getInt("id");
				byte[] bytes = rs.getBytes("content");
				String article = new String(des.Decryptor(bytes)); // 解碼
				System.out.println(id + "\t資料源:" + new String(bytes) + "\t解碼後:" + article);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
