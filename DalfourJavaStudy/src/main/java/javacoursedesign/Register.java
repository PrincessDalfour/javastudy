package javacoursedesign;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Register {
	private Connection conn;

	public Register(String a, String b) {//用户注册
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/javacoursedesign",
					"root",
					"385995");
			String sql = "INSERT INTO userinfo VALUES('" + a + "','" + b + "')";
			String sql2 = "CREATE TABLE " + a + "shopping(车次号 varchar(10),始发地 varchar(20),目的地 varchar(20),出发时间 varchar(30),PRIMARY KEY(车次号))";
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			stmt.executeUpdate(sql2);
			conn.close();
			JOptionPane.showMessageDialog(null, "注册成功!");
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "注册失败!");
			e.printStackTrace();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "注册失败!");
			e.printStackTrace();
		}

	}

}
