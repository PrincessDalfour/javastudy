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
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IdToTicketFrame extends JFrame {
	private JPanel contentPane;
	private JTextField textField;

	public IdToTicketFrame(String user) {
		setTitle("车次查询");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(650, 300, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel label = new JLabel("直接输入需要查询的车次号");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("微软雅黑", Font.BOLD, 25));

		textField = new JTextField();
		textField.setColumns(10);

		JButton button = new JButton("查询");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String a = textField.getText();
				new IdToTicket(a, user);
			}
		});
		button.setFont(new Font("微软雅黑", Font.BOLD, 15));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
												.addGap(115)
												.addComponent(textField, GroupLayout.PREFERRED_SIZE, 168,
														GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
												.addGap(174)
												.addComponent(button))
										.addGroup(gl_contentPane.createSequentialGroup()
												.addGap(61)
												.addComponent(label)))
								.addContainerGap(61, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(39)
								.addComponent(label)
								.addGap(53)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
								.addComponent(button)
								.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
