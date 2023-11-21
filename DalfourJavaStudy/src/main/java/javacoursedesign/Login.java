package javacoursedesign;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.*;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Login() {
		setTitle("欢迎进入火车售票系统!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 300, 450, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel label = new JLabel("用户登录");
		label.setFont(new Font("微软雅黑", Font.BOLD, 30));

		JLabel lblNewLabel = new JLabel("用户名");

		JLabel lblNewLabel_1 = new JLabel("密码");

		textField = new JTextField();
		textField.setColumns(10);

		passwordField = new JPasswordField();


		JButton btnNewButton = new JButton("登入");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = textField.getText();
				String password = new String(passwordField.getPassword());
				try {
					boolean com = compareWithSql(username, password);
					if (com) {
						JOptionPane.showMessageDialog(null, "登入成功!");
						CheckMain t1 = new CheckMain(username);
						t1.setVisible(true);
						dispose();
					} else {
						JOptionPane.showMessageDialog(null, "登入失败!");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("微软雅黑", Font.BOLD, 15));

		JButton button = new JButton("注册");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RegisterFrame r = new RegisterFrame();
				r.setVisible(true);
			}
		});
		button.setFont(new Font("微软雅黑", Font.BOLD, 15));


		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).
				addGroup(gl_contentPane.createSequentialGroup().
						addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).
								addGroup(gl_contentPane.createSequentialGroup().addGap(54).
										addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).
												addComponent(lblNewLabel).addComponent(lblNewLabel_1)).addGap(23).
										addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false).addComponent(passwordField).
												addComponent(textField, GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE).
												addComponent(btnNewButton).addComponent(button, Alignment.TRAILING))).
								addGroup(gl_contentPane.createSequentialGroup().addGap(143).addComponent(label))).
						addContainerGap(135, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).
				addGroup(gl_contentPane.createSequentialGroup().addGap(25).addComponent(label).addGap(26).
						addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel).
								addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)).
						addGap(55).addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_1).
								addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)).
						addGap(47).addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).
								addComponent(btnNewButton).addComponent(button)).addContainerGap()));
		contentPane.setLayout(gl_contentPane);
	}
	//是否成功登录
	boolean compareWithSql(String a, String b) throws Exception {
		String sql;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javacoursedesign", "root", "385995");
		Statement stmt = conn.createStatement();
		sql = "select * from userinfo";
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			String username = rs.getString(1);
			String password = rs.getString(2);
			if (a.equals(a) && b.equals(b)) {
				return true;
			}
		}
		return false;
	}
}
