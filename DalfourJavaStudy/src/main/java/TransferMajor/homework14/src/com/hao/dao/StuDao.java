package TransferMajor.homework14.src.com.hao.dao;

import TransferMajor.homework14.src.com.hao.entity.Student;
import TransferMajor.homework14.src.com.hao.util.DBHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StuDao {
	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private String sql = null;

	private int i = 0;

	/**
	 * 模糊查询
	 *
	 * @param key   查询的属性
	 * @param value 查询内容
	 * @return
	 */
	public List<Student> all(String key, String value) {
		List<Student> list = new ArrayList<>();// 创建list集合存放数据
		try {
			con = DBHelper.getCon();
			sql = "select stu_id,stu_name,stu_sex,stu_sage,stu_address from student where 1=1 and " + key + " like '%"
					+ value + "%'";
			ps = con.prepareStatement(sql);// 执行sql语句
			rs = ps.executeQuery();
			while (rs.next()) {
				Student stu = new Student();// 创建stu对象
				stu.setSid(rs.getInt(1));// 给sid属性赋值
				stu.setSname(rs.getString(2));
				stu.setSsex(rs.getString(3));
				stu.setSage(rs.getInt(4));
				stu.setSaddress(rs.getString(5));
				list.add(stu);// 把数据放到list集合里面
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBHelper.close(con, ps, rs);// 关闭流
		}
		return list;
	}

	/**
	 * 添加学生方法
	 *
	 * @param stu 学生对象
	 * @return
	 */


	public int add(Student stu) {
		try {
			con = DBHelper.getCon();
			sql = "insert into student(stu_name, stu_sex, stu_sage, stu_address) values(?,?,?,?)";
			ps = con.prepareStatement(sql);// 执行sql语句
			ps.setString(1, stu.getSname());
			ps.setString(2, stu.getSsex());
			ps.setInt(3, stu.getSage());
			ps.setString(4, stu.getSaddress());

			i = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBHelper.close(con, ps, null);// 关闭流
		}
		return i;
	}

	/**
	 * 删除学生
	 *
	 * @param sid 根据id删除
	 * @return
	 */
	public int del(int sid) {
		try {
			con = DBHelper.getCon();
			sql = "delete from student where stu_id=" + sid;
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
	 * @param stu
	 * @return
	 */
	public int update(Student stu) {
		try {
			con = DBHelper.getCon();
			sql = "update student set stu_name=?,stu_sex=?,stu_sage=?,stu_address=? where stu_id=" + stu.getSid();
			ps = con.prepareStatement(sql);// 执行sql语句
			ps.setString(1, stu.getSname());
			ps.setString(2, stu.getSsex());
			ps.setInt(3, stu.getSage());
			ps.setString(4, stu.getSaddress());
			i = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBHelper.close(con, ps, null);// 关闭流
		}
		return i;
	}


	public static void main(String[] args) {
		StuDao da = new StuDao();
		Student stu = new Student();
		stu.setSage(10);
		stu.setSaddress("上海");
		stu.setSname("马斯克");
		stu.setSsex("男");
		int i = da.add(stu);
		System.out.println(i);


	}
}
