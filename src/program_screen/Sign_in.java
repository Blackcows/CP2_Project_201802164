package program_screen;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Sign_in extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sign_in frame = new Sign_in();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Sign_in() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 600);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\uC774\uB984 :");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(62, 324, 70, 30);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.PLAIN, 18));
		textField.setBounds(144, 329, 105, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("\uC8FC\uBBFC\uB4F1\uB85D\uBC88\uD638 :");
		label.setFont(new Font("굴림", Font.PLAIN, 18));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(12, 364, 120, 30);
		contentPane.add(label);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("굴림", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(144, 369, 105, 20);
		contentPane.add(textField_1);
		
		JLabel lblId = new JLabel("\uC544\uC774\uB514 :");
		lblId.setFont(new Font("굴림", Font.PLAIN, 18));
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setBounds(62, 404, 70, 30);
		contentPane.add(lblId);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("굴림", Font.PLAIN, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(144, 409, 105, 20);
		contentPane.add(textField_2);
		
		JLabel lblPw = new JLabel("\uBE44\uBC00\uBC88\uD638 :");
		lblPw.setFont(new Font("굴림", Font.PLAIN, 18));
		lblPw.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPw.setBounds(34, 444, 98, 30);
		contentPane.add(lblPw);
		
		JButton btnNewButton = new JButton("\uC911\uBCF5\uD655\uC778");
		
		btnNewButton.setBounds(275, 410, 95, 20);
		contentPane.add(btnNewButton);
		
		JLabel label_1 = new JLabel("\uBE44\uBC00\uBC88\uD638\uD655\uC778 :");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setFont(new Font("굴림", Font.PLAIN, 18));
		label_1.setBounds(12, 484, 120, 30);
		contentPane.add(label_1);
		
		JButton btnNewButton_1 = new JButton("\uBE44\uBC00\uBC88\uD638\uD655\uC778");
		btnNewButton_1.setBounds(275, 490, 120, 20);
		contentPane.add(btnNewButton_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(292, 370, 120, 20);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("-");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(244, 371, 52, 15);
		contentPane.add(lblNewLabel_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("\uC0C1\uAE30 \uB0B4\uC6A9\uC744 \uD655\uC778\uD558\uC600\uC73C\uBA70 \uC774\uC5D0 \uB3D9\uC758\uD569\uB2C8\uB2E4.");
		chckbxNewCheckBox.setFont(new Font("굴림", Font.PLAIN, 16));
		chckbxNewCheckBox.setBounds(8, 265, 346, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_2 = new JLabel("\uD68C\uC6D0\uC815\uBCF4 \uC785\uB825");
		lblNewLabel_2.setBackground(new Color(173, 255, 47));
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(12, 294, 111, 20);
		contentPane.add(lblNewLabel_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setText("\uC548\uB155\uD558\uC138\uC694^^\r\n\r\n\uC6D0\uB798 \uC57D\uAD00 \uBD80\uBD84\uC778\uB370 \uB108\uBB34 \uAE38\uACE0\r\n\uC2DC\uAC04 \uC5C6\uC5B4\uC11C \uC774\uC815\uB3C4\uB9CC \uC501\uB2C8\uB2E4\r\n\r\n\u314B\u314B\u314B\u314B\u314B\u314B\u314B\u314B\u314B\u314B\r\n\r\n\uC9C0\uAE08 \uC2DC\uAC04 2018.11.30\r\n\uC624\uD6C4 4:50\r\n\r\n\uBC30\uACE0\uD504\uB124\uC694\r\n\uBC25\uBA39\uC73C\uB7EC \uAC00\uACA0\uC2B5\uB2C8\uB2E4\r\n\r\n\uADF8\uB7FC \uC774\uB9CC.. \u314E");
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(12, 62, 400, 200);
		contentPane.add(scrollPane);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(144, 450, 105, 20);
		contentPane.add(passwordField_1);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(144, 490, 105, 20);
		contentPane.add(passwordField_2);
		
		JLabel label_2 = new JLabel("\uC57D\uAD00 \uB3D9\uC758");
		label_2.setBackground(new Color(173, 255, 47));
		label_2.setFont(new Font("굴림", Font.PLAIN, 16));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(12, 10, 70, 20);
		contentPane.add(label_2);
		
		JButton btnNewButton_2 = new JButton("\uB2E4\uC74C");
		
		btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 18));
		btnNewButton_2.setBounds(379, 520, 95, 23);
		contentPane.add(btnNewButton_2);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 아이디 중복확인
				
			}
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 비밀번호 입력 2번한 거 일치하는지 확인
				
			}
		});
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 회원 정보를 객체로 만들어서 입력하고 현재 창 종료, 로그인 창 다시 실행
				
			}
		});
	}
}
