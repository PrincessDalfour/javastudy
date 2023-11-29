package TransferMajor.homework13;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SimpleDBDemo {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stddb", "root", "385995");
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("select * from course");
            while (rs.next()) {
                String s1 = rs.getString(1);
                String s2 = rs.getString(2);
                String d3 = rs.getString(3);
                String res = s1 + "\t" + s2 + "\t\t" + d3;
                FileWriter writer;
                try {
                    writer = new FileWriter("D:\\WorkSpace\\JavaStudy\\DalfourJavaStudy\\src\\main\\java\\TransferMajor\\homework13\\example.txt");
                    writer.write(res);
                    writer.flush();
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            rs.close();
            stm.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}