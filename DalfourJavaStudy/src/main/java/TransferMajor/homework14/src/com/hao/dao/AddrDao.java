package TransferMajor.homework14.src.com.hao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import TransferMajor.homework14.src.com.hao.entity.Address;
import TransferMajor.homework14.src.com.hao.util.DBHelper;

public class AddrDao {
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	String sql = null;
	int i = 0;

	public List<String> all() {
		List<String> list = new ArrayList<>();// 创建list集合存放数据		
		try {
			con = DBHelper.getCon();
			sql = "select name from addr";
			ps = con.prepareStatement(sql);// 执行sql语句
			rs = ps.executeQuery();

			while (rs.next()) {
				list.add(rs.getString(1));// 把数据放到list集合里面

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBHelper.close(con, ps, rs);// 关闭流
		}
		return list;
	}

	public int add(Address adr) {
		try {
			con = DBHelper.getCon();
			sql = "insert into addr(id, name) values(?,?)";
			ps = con.prepareStatement(sql);// 执行sql语句
			ps.setInt(1, adr.getId());
			ps.setString(2, adr.getName());

			i = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBHelper.close(con, ps, null);// 关闭流
		}
		return i;
	}


	public static void main(String[] args) {
		AddrDao da = new AddrDao();
		Address ad = new Address();
		ad.setId(10);
		ad.setName("衢州");
		da.add(ad);

	}

}
