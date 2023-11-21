package TransferMajor.homework14.src.com.hao.util;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * 工具类连接mysql数据库
 */
public class DBHelper {

	private static String driver;
	private static String url;
	private static String user;
	private static String password;

	static {
		try {
			driver = "com.mysql.cj.jdbc.Driver";
			url = "jdbc:mysql://localhost:3306/studb";
			user = "root";
			password = "385995";
			Class.forName(driver);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	/**
	 * 获得数据连接对象
	 *
	 * @return
	 */
	public static Connection getCon() {
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	public static void close(ResultSet rs) {
		if (null != rs) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
	}

	public static void close(PreparedStatement ps) {
		if (null != ps) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
	}

	public static void close(Connection con) {
		if (null != con) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
	}

	/**
	 * 关闭所以连接
	 *
	 * @param con
	 * @param ps
	 * @param rs
	 */
	public static void close(Connection con, PreparedStatement ps, ResultSet rs) {
		close(con);
		close(ps);
		close(rs);
	}

	public static void main(String[] args) {
		Connection con = DBHelper.getCon();

	}

}
