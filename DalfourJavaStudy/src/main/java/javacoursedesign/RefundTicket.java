package javacoursedesign;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class RefundTicket {
	private Connection conn;

	public RefundTicket(String TrainNumber, String username) {//退票
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/javacoursedesign",
					"root",
					"385995");
			String sql = "delete from " + username + "shopping where 车次号='" + TrainNumber + "'";
			String sql2 = "update carinfo set 剩余票数=剩余票数+1 where 车次号='" + TrainNumber + "'";
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			stmt.executeUpdate(sql2);
			conn.close();
			JOptionPane.showMessageDialog(null, "退票成功!");
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "退票失败!");
			e.printStackTrace();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "退票失败!");
			e.printStackTrace();
		}

	}

}
