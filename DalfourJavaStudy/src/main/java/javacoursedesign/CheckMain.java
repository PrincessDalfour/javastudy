package javacoursedesign;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;


public class CheckMain extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	public CheckMain(String username) {//菜单栏
		setTitle("火车售票系统");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(600, 300, 450, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu menu = new JMenu("用户信息");
		menuBar.add(menu);

		JMenuItem menuItem = new JMenuItem("已购车票");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Ticket(username);
			}
		});
		menu.add(menuItem);

		JMenuItem menuItem_1 = new JMenuItem("退票系统");
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RefundTicketFrame d1 = new RefundTicketFrame(username);
				d1.setVisible(true);
			}
		});
		menu.add(menuItem_1);

		JMenuItem menuItem_2 = new JMenuItem("注销");
		menuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "注销成功!");
				dispose();
				Login frame = new Login();
				frame.setVisible(true);
			}
		});
		menu.add(menuItem_2);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("车次查询");
		lblNewLabel.setFont(new Font("黑体", Font.BOLD, 30));

		textField = new JTextField();
		textField.setColumns(10);


		textField_1 = new JTextField();
		textField_1.setColumns(10);


		JButton button = new JButton("开始查询");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String start = textField.getText();
				String end = textField_1.getText();
				new PointToTicket(start, end, username);
			}
		});
		button.setFont(new Font("微软雅黑", Font.BOLD, 15));

		JLabel label = new JLabel("始发地");

		JLabel label_1 = new JLabel("目的地");

		JButton button_1 = new JButton("特定车次号查询");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				IdToTicketFrame b = new IdToTicketFrame(username);
				b.setVisible(true);
			}
		});
		button_1.setFont(new Font("微软雅黑", Font.BOLD, 15));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(142)
								.addComponent(lblNewLabel)
								.addGap(152))
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
												.addGap(36)
												.addComponent(textField, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
												.addGap(53)
												.addComponent(label)))
								.addPreferredGap(ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(textField_1, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addGap(49))
										.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(label_1)
												.addGap(81))))
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(75)
								.addComponent(button)
								.addGap(53)
								.addComponent(button_1)
								.addContainerGap(88, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
								.addGap(35)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(label)
										.addComponent(label_1))
								.addGap(18)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(button_1)
										.addComponent(button))
								.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
