package TransferMajor.homework13;

import java.sql.*;

public class SimpleDBDemo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stddb", "root", "385995");
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery("select * from course");
			while (rs.next()) {
				String s1 = rs.getString(1);
				String s2 = rs.getString(2);
				String d3 = rs.getString(3);
				String res = s1 + "\t" + s2 + "\t\t" + d3;
				System.out.println(res);
			}
			rs.close();
			stm.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}