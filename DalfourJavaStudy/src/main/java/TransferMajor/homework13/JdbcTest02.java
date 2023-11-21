package TransferMajor.homework13;

import java.sql.*;

class Conn02 {
	Connection con02;

	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("数据库驱动加载成功");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			con02 = DriverManager.getConnection("jdbc:mysql://localhost:3306/test13", "root", "385995");
			System.out.println("数据库连接成功");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con02;
	}
}

public class JdbcTest02 {
	public static void main(String[] args) {
		Connection conn02 = null;
		PreparedStatement stmt02 = null;
		try {
			Conn02 c = new Conn02();
			conn02 = c.getConnection();
			//添加 PreparedStatement的更新操作
			String sql = "UPDATE websites SET name=?, url=? WHERE id=?";
			stmt02 = conn02.prepareStatement(sql);
			stmt02.setString(1, "深澜软件");
			stmt02.setString(2, "http://10.110.74.99/");
			stmt02.setInt(3, 2);
			int rows = stmt02.executeUpdate(); // 执行更新操作
			System.out.println(rows + " 行受影响");
		} catch (SQLException se) {
			// 处理 JDBC 错误
			se.printStackTrace();
		} catch (Exception e) {
			// 处理 Class.forName 错误
			e.printStackTrace();
		} finally {
			// 关闭资源
			try {
				if (stmt02 != null) stmt02.close();
			} catch (SQLException se2) {
			}// 什么都不做
			try {
				if (conn02 != null) conn02.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}
}