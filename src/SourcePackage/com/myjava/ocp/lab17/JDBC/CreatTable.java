package SourcePackage.com.myjava.ocp.lab17.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreatTable {
	public static void main(String[] args) {
		/*
		 * JDBC 3.0
		 * class.forName("org.apache.derby.ClintDeiver");
		 * 
		 * JDBC 4.0
		 * 不使用Class.forName
		 */
		String sql ="CREATE TABLE Student (\n" + 
				"    id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY ,\n" + 
				"    age INTEGER NOT NULL,\n" + 
				"    name VARCHAR(20) NOT NULL\n" + 
				")";
		
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
