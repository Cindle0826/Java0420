package SourcePackage.com.myjava.ocp.lab17.ReslutSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CreatRecord {
	public static void main(String[] args) {
		String sql = "INSERT INTO Student(age, name) VALUES(18, \"Helen\")";
		
		String url="jdbc:mysql://localhost:3306/lab17";
		String username="root";
		String password="Password123";
        try(Connection conn = DriverManager.getConnection(url, username, password);
                Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);) {
            	ResultSet rs = stmt.executeQuery("SELECT * FROM Student");
            	rs.moveToInsertRow();//移動到可以新增的地方
            	rs.updateInt("age", 10);
            	rs.updateString("name", "巨匠");
            	rs.insertRow();//新增
            	System.out.println("新增完成");
            } catch (Exception e) {
                e.printStackTrace();
            }
	}

}
