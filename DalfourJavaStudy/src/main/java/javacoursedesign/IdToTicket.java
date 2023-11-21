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

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class IdToTicket extends JFrame {
	JTable table = new JTable();
	private Connection conn;

	public IdToTicket(String a, String user) {
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JButton button = new JButton("购票");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BuyTicketFrame pf = new BuyTicketFrame(user);
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
			table = query2(a);
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

	public JTable query2(String a) throws SQLException {
		DefaultTableModel tbmode = new DefaultTableModel();
		String sql = "SELECT * FROM carinfo WHERE 车次号='" + a + "'";
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
