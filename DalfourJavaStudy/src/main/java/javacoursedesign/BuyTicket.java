package javacoursedesign;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class BuyTicket {
	private Connection conn;

	public BuyTicket(String TrainNumber, String username) {//购票
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/javacoursedesign",
					"root",
					"385995");
			String sql = "insert into " + username + "shopping select 车次号,始发地,目的地,出发时间 from carinfo where 车次号='" + TrainNumber + "' group by 车次号,始发地,目的地,出发时间";
			String sql2 = "update carinfo set 剩余票数=剩余票数-1 where 车次号='" + TrainNumber + "'";
			java.sql.Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			stmt.executeUpdate(sql2);
			conn.close();
			JOptionPane.showMessageDialog(null, "购票成功!");
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "购票失败!");
			e.printStackTrace();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "购票失败!");
			e.printStackTrace();
		}
	}
}
