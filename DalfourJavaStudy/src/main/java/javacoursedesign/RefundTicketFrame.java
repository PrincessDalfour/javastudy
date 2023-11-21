package javacoursedesign;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RefundTicketFrame extends JFrame {
	private JPanel contentPane;
	private JTextField textField;

	public RefundTicketFrame(String user) {
		setTitle("系统退票");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(650, 300, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel label = new JLabel("输入您要退票的车次号");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("微软雅黑", Font.BOLD, 30));

		textField = new JTextField();
		textField.setColumns(10);

		JButton btnNewButton = new JButton("退票");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = textField.getText();
				new RefundTicket(a, user);
			}
		});
		btnNewButton.setFont(new Font("微软雅黑", Font.BOLD, 15));
		btnNewButton.setForeground(Color.BLUE);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
								.addContainerGap(109, Short.MAX_VALUE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
								.addGap(102))
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(177)
								.addComponent(btnNewButton)
								.addContainerGap(182, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(61)
								.addComponent(label)
								.addContainerGap(61, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(29)
								.addComponent(label)
								.addGap(55)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
								.addComponent(btnNewButton)
								.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}

}
