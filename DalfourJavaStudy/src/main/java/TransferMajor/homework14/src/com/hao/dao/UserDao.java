package TransferMajor.homework14.src.com.hao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import TransferMajor.homework14.src.com.hao.entity.User;
import TransferMajor.homework14.src.com.hao.util.DBHelper;

public class UserDao {
	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private String sql = null;

	private int i = 0;

	public List<User> all() {
		List<User> list = new ArrayList<>();// 创建list集合存放数据
		try {
			con = DBHelper.getCon();
			sql = "select * from users";
			ps = con.prepareStatement(sql);// 执行sql语句
			rs = ps.executeQuery();
			while (rs.next()) {
				User us = new User();// 创建stu对象
				us.setName(rs.getString(1));
				us.setPwd(rs.getString(2));
				list.add(us);// 把数据放到list集合里面
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBHelper.close(con, ps, rs);// 关闭流
		}
		return list;
	}

	public User find(String username, String pwd) {
		User us = null;
		try {
			con = DBHelper.getCon();
			sql = "select * from users where username='" + username + "' and passwords='" + pwd + "'";
			ps = con.prepareStatement(sql);// 执行sql语句
			rs = ps.executeQuery();
			if (rs.next()) {
				us = new User();
				us.setId(rs.getInt(1));
				us.setName(username);
				us.setPwd(pwd);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBHelper.close(con, ps, rs);// 关闭流
		}
		return us;
	}


	public int add(User us) {
		try {
			con = DBHelper.getCon();
			sql = "insert into users(username, passwords) values(?,?)";
			ps = con.prepareStatement(sql);// 执行sql语句
			ps.setString(1, us.getName());
			ps.setString(2, us.getPwd());

			i = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBHelper.close(con, ps, null);// 关闭流
		}
		return i;
	}


	public int del(int id) {
		try {
			con = DBHelper.getCon();
			sql = "delete from users where id=" + id;
			ps = con.prepareStatement(sql);// 执行sql语句
			i = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBHelper.close(con, ps, null);// 关闭流
		}
		return i;
	}

	/**
	 * 修改学生
	 *
	 * @return
	 */
	public int update(User us) {
		try {
			con = DBHelper.getCon();
			sql = "update users set passwords=? where id=" + us.getId();
			ps = con.prepareStatement(sql);// 执行sql语句
			ps.setString(1, us.getPwd());

			i = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBHelper.close(con, ps, null);// 关闭流
		}
		return i;
	}


	public static void main(String[] args) {
		// 测试UserDao的增删改查查功能

		UserDao dao = new UserDao();
		User us = dao.find("java", "111");
		if (us == null) {
			System.out.println("用户名不对或用户不存在");
		}


		User aduser = new User();
		aduser.setName("lucy");
		aduser.setPwd("123");
		dao.add(aduser);

		aduser.setId(3);
		aduser.setPwd("11111");
		dao.update(aduser);

		dao.del(4);


	}

}
