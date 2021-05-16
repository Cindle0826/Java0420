package SourcePackage.com.myjava.ocp.lab17.Stream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class ReadStudent {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab17", "root", "Password123");
             Statement statement = conn.createStatement();
             ResultSet rs = statement.executeQuery("SELECT id, name, age FROM Student")) {
            
            List<Student> list = StreamHelper.stream(rs)
                    .map(r -> new Student(r.get("id", Integer.class),r.get("age", Integer.class),r.getString("name")))
                    .collect(toList());
            
            System.out.println(list);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}