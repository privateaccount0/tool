package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class dbaccess {
	public void textregistration(String text) {
		final String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
		final String USER = "ora01";
		final String PASS = "oracle";
		final String SQL = "select text from textdata";

		try (Connection conn = DriverManager.getConnection(URL,USER,PASS);
			PreparedStatement ps = conn.prepareStatement(SQL)){



	        try(ResultSet rs = ps.executeQuery()){
	            while (rs.next()) {
	                System.out.println(rs.getString("text"));
	            }
	        }
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("処理が完了しました");
		}
	}
}
