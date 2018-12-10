package program_screen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	private Sign_in signin;
	private MainScreen mainScreen;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
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
	public LoginFrame() {
		setBounds(100, 100, 500, 500);
		setTitle("Java Movie Theater\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Java Movie Theater");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setLabelFor(this);
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblNewLabel.setBounds(134, 61, 186, 30);
		getContentPane().add(lblNewLabel);
		
		JButton btnLogin = new JButton("로그인");
		btnLogin.setFont(new Font("굴림", Font.PLAIN, 16));
		
		btnLogin.setBounds(57, 368, 164, 37);
		getContentPane().add(btnLogin);
		
		JButton button = new JButton("회원가입");
		button.setFont(new Font("굴림", Font.PLAIN, 16));
		button.setBackground(new Color(173, 216, 230));
		
		button.setBounds(283, 368, 164, 37);
		getContentPane().add(button);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(110, 234, 52, 25);
		getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("굴림", Font.PLAIN, 15));
		textField_1.setBounds(174, 234, 150, 25);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPw = new JLabel("PW");
		lblPw.setHorizontalAlignment(SwingConstants.CENTER);
		lblPw.setFont(new Font("굴림", Font.PLAIN, 16));
		lblPw.setBounds(110, 273, 52, 25);
		getContentPane().add(lblPw);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("굴림", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(174, 273, 150, 25);
		getContentPane().add(textField_2);
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 로그인 이벤트
				// 고객 리스트를 가져와서 ID와 PW 확인하고 로그인 여부 판단
				
				if (textField_1.equals("") || textField_2.equals(""))
					System.out.println();
				else {
					mainScreen = new MainScreen();
					mainScreen.setVisible(true);
					dispose();

				}
			}
		});
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 회원가입 이벤트
				// 회원가입 창 띄우기
				dispose();
				signin = new Sign_in();
				signin.setVisible(true);
			}
		});
	}
}

