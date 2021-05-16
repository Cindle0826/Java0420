package SourcePackage.com.myjava.ocp.lab17.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Random;

import com.github.javafaker.Faker;

public class CreatBatchRecord {
	public static void main(String[] args) {
		String sql = "INSERT INTO Student(age, name) VALUES(?, ?)";
		String url="jdbc:mysql://localhost:3306/lab17";
		String username="root";
		String password="Password123";
        try(Connection conn = DriverManager.getConnection(url, username, password);
                PreparedStatement pstmt = conn.prepareStatement(sql);) {
        		pstmt.clearBatch();
        		for(int i=0;i<100;i++) {
        			pstmt.setInt(1, new Random().nextInt(40)+10);
        			pstmt.setString(2, new Faker().name().firstName());
        			pstmt.addBatch(); //加入緩存
        		}
                int count[] = pstmt.executeBatch();//批次執行
                System.out.println("建立 Table : " + count.length);
            } catch (Exception e) {
                e.printStackTrace();
            }
	}
}
