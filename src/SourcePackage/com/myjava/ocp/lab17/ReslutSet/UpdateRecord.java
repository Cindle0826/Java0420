package SourcePackage.com.myjava.ocp.lab17.ReslutSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UpdateRecord {
	public static void main(String[] args) {
		String sql = "INSERT INTO Student(age, name) VALUES(18, \"Helen\")";
		
		String url="jdbc:mysql://localhost:3306/lab17";
		String username="root";
		String password="Password123";
        try(Connection conn = DriverManager.getConnection(url, username, password);
                Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);) {
            	ResultSet rs = stmt.executeQuery("SELECT * FROM Student WHERE name= '巨匠'");
            	
            	if(rs.last()) {
            		rs.updateInt("age", 99);
            		rs.updateRow();//修改
            	}
            	System.out.println("修改完成");
            } catch (Exception e) {
                e.printStackTrace();
            }
	}
}
