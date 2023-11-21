package javacoursedesign;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterFrame extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	public RegisterFrame() {
		setTitle("注册");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(650, 300, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel label = new JLabel("输入用户名（最长10个字符）");
		label.setFont(new Font("微软雅黑", Font.BOLD, 15));

		JLabel label_1 = new JLabel("用户注册");
		label_1.setFont(new Font("微软雅黑", Font.BOLD, 25));

		JLabel label_2 = new JLabel("输入密码（最长10个字符）");
		label_2.setFont(new Font("微软雅黑", Font.BOLD, 15));

		textField = new JTextField();
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);

		JButton button = new JButton("注册");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = textField.getText();
				String b = textField_1.getText();
				if (a.equals("") || b.equals("")) {
					JOptionPane.showMessageDialog(null, "请输入信息!");
				} else {
					new Register(a, b);
					dispose();
				}
			}
		});
		button.setFont(new Font("微软雅黑", Font.BOLD, 15));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
												.addGap(152)
												.addComponent(label_1))
										.addGroup(gl_contentPane.createSequentialGroup()
												.addContainerGap()
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addComponent(label)
														.addComponent(label_2))
												.addGap(18)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 149,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(textField, 148, 148, 148))))
								.addContainerGap(43, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(173)
								.addComponent(button)
								.addContainerGap(186, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(33)
								.addComponent(label_1)
								.addGap(41)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(label)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addGap(56)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(label_2)
										.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
								.addComponent(button)
								.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}

}
