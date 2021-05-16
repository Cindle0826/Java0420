package SourcePackage.com.myjava.ocp.lab17.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreatRecord {
	public static void main(String[] args) {
		String sql = "INSERT INTO Student(age, name) VALUES(18, \"Helen\")";
		
		String url="jdbc:mysql://localhost:3306/lab17";
		String username="root";
		String password="Password123";
        try(Connection conn = DriverManager.getConnection(url, username, password);
                Statement stmt = conn.createStatement();) {
                int count = stmt.executeUpdate(sql);
                System.out.println("建立 Table : " + count);
            } catch (Exception e) {
                e.printStackTrace();
            }
	}

}
