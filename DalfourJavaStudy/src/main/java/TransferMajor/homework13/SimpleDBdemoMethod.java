package TransferMajor.homework13;

import java.sql.*;

public class SimpleDBdemoMethod {
	static String url = "jdbc:mysql://localhost:3306/test13";
	static String dbName = "root";
	static String password = "385995";
	static Connection conn = null;
	static ResultSet rs = null;
	static Statement stm = null;

	public static void main(String[] args) {
		try {
			getconn();
			String strsql = "select * from websites";
			rs = stm.executeQuery(strsql);
			while (rs.next()) {
				//分别获取2个String类型字段和一个Double字段
				String name = rs.getString("name");
				String url = rs.getString("url");
				Double alexa = rs.getDouble("alexa");
				//在控制台输出
				System.out.println("name: " + name + ", url: " + url + ", alexa: " + alexa);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}

	public static void getconn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("数据库驱动加载成功");
			conn = DriverManager.getConnection(url, dbName, password);
			System.out.println("数据库连接成功");
			stm = conn.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void close() {
		try {
			rs.close();
			stm.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

