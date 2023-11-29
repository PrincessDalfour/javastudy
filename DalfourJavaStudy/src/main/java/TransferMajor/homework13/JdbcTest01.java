package TransferMajor.homework13;

import java.sql.*;

//mysqld --console　　


class Conn01 {
    Connection con01;

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("数据库驱动加载成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            con01 = DriverManager.getConnection("jdbc:mysql://localhost:3306/test13", "root", "385995");
            System.out.println("数据库连接成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con01;
    }
}

public class JdbcTest01 {
    public static void main(String[] args) {
        Connection conn01 = null;
        Statement stmt01 = null;
        try {
            Conn01 c = new Conn01();
            conn01 = c.getConnection();
            //增
            stmt01 = conn01.createStatement();
            String sql1 = "INSERT INTO websites(id, name, url, alexa, country) " +
                    "VALUES('6', 'being', 'https://bing.com/', '12', 'USA')";
            int result1 = stmt01.executeUpdate(sql1);
            if (result1 > 0) {
                System.out.println("插入成功");
            } else {
                System.out.println("插入失败");
            }
            //删
            String sql2 = "DELETE FROM websites WHERE id=1";
            int result2 = stmt01.executeUpdate(sql2);
            if (result2 > 0) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }
            //改
            String sql3 = "UPDATE websites SET alexa='15' WHERE id='2'";
            int result3 = stmt01.executeUpdate(sql3);
            if (result3 > 0) {
                System.out.println("更新成功");
            } else {
                System.out.println("更新失败");
            }
            //查
            String sql4 = "SELECT * FROM websites";
            ResultSet result4 = stmt01.executeQuery(sql4);
            while (result4.next()) {
                String id = result4.getString("id");
                String name = result4.getString("name");
                String url = result4.getString("url");
                String alexa = result4.getString("alexa");
                String country = result4.getString("country");
                System.out.println("ID: " + id + "\nName: " + name + "\nurl: "
                        + url + "\nalexa: " + alexa + "\ncountry: " + country);
            }

            conn01.close();
        } catch (SQLException se) {
            // 处理 JDBC 错误
            se.printStackTrace();
        } catch (Exception e) {
            // 处理 Class.forName 错误
            e.printStackTrace();
        } finally {
            // 关闭资源
            try {
                if (stmt01 != null) stmt01.close();
            } catch (SQLException se2) {
            }// 什么都不做
            try {
                if (conn01 != null) conn01.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}