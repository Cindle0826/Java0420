package SourcePackage.com.myjava.ocp.des.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class WriteArticleToDB {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/Article";
		String user = "root";
		String password = "Password123";
		String sql = "INSERT INTO Article(id, content) VALUES(?, ?)";
		try (Connection conn = DriverManager.getConnection(url, user, password);
				PreparedStatement pstmt = conn.prepareStatement(sql)) {

			String article = "紅鏈收購台鏈 郭台銘震驚";
			String path = "src/SourcePackage/com/myjava/ocp/des/utils/mydeskey_1595245837511.bin";
			EncrypDES des = new EncrypDES(path);
			byte[] article_des = des.Encrytor(article);

			pstmt.setInt(1, 1);
			pstmt.setBytes(2, article_des);

			pstmt.executeUpdate();

			System.out.println("新增成功");
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
