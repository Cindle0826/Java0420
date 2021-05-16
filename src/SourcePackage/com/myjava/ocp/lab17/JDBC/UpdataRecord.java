package SourcePackage.com.myjava.ocp.lab17.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdataRecord {
	public static void main(String[] args) {
		String sql = "UPDATE Student SET age = 19 WHERE id = 1";

		String url = "jdbc:mysql://localhost:3306/lab17";
		String username = "root";
		String password = "Password123";
		try (Connection conn = DriverManager.getConnection(url, username, password);
				Statement stmt = conn.createStatement();) {
			int count = stmt.executeUpdate(sql);
			System.out.println("修改資料列 : " + count);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
