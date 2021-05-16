package SourcePackage.com.myjava.ocp.lab17.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class ReadRecord {
    public static void main(String[] args) {
        String sql = "SELECT id, age, name FROM Student";
        String url = "jdbc:mysql://localhost:3306/lab17";
        String username = "root";
        String password = "Password123";
        try(Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);) {
            
            ResultSetMetaData md = rs.getMetaData();
            System.out.printf("%-10s%-10s%-10s\n", md.getColumnName(1), md.getColumnName(2), md.getColumnName(3));
            
            System.out.println("------------------------------");
            
            while(rs.next()) {
                int id = rs.getInt("id");
                int age = rs.getInt("age");
                String name = rs.getString("name");
                System.out.printf("%-10d%-10d%-10s\n", id, age, name);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

}
