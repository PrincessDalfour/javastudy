package javacoursedesign;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class PointToTicket extends JFrame {
	JTable table = new JTable();
	private Connection conn;

	public PointToTicket(String start, String end, String username) {//地点查询车票
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JButton button = new JButton("购票");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BuyTicketFrame pf = new BuyTicketFrame(username);
				pf.setVisible(true);
			}
		});
		button.setFont(new Font("微软雅黑", Font.BOLD, 15));
		contentPane.add(button, BorderLayout.SOUTH);
		this.setBounds(650, 300, 800, 200);
		this.setTitle("车次信息");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/javacoursedesign",
					"root",
					"385995");
			table = query(start, end);
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.getContentPane().add(new JScrollPane(table));
		this.setVisible(true);
		try {
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public JTable query(String start, String end) throws SQLException {
		DefaultTableModel tbmode = new DefaultTableModel();
		String sql = "SELECT * FROM carinfo WHERE 始发地='" + start + "' AND 目的地='" + end + "'";
		try {
			Statement Stmt = conn.createStatement();
			ResultSet rs = Stmt.executeQuery(sql);
			ResultSetMetaData meta = rs.getMetaData();
			int colcount = meta.getColumnCount();
			for (int i = 1; i <= colcount; i++)
				tbmode.addColumn(meta.getColumnName(i));
			Object[] col = new Object[colcount];
			while (rs.next()) {
				for (int j = 1; j <= col.length; j++)
					col[j - 1] = rs.getString(j);
				tbmode.addRow(col);
			}
			rs.close();
			Stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new JTable(tbmode);
	}
}
