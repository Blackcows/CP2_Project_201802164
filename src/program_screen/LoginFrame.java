package program_screen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

import Theater.Customer;

import javax.swing.JButton;
import java.awt.Color;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField txtPW;
	private JTextField txtID;
	
	private Sign_in signin;
	private MainScreen mainScreen;
	
	private String inputID, inputPW;
	private ArrayList<Customer> Customerlist;
	String UserID, UserPW;
	String UserName;
	String UserEmail;
	String UserNumber;
	String UserPhoneNumber;
	
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
		
		JLabel lblTitle = new JLabel("Java Movie Theater");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setLabelFor(this);
		lblTitle.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblTitle.setBounds(134, 61, 186, 30);
		getContentPane().add(lblTitle);
		
		JLabel lblID = new JLabel("ID");
		lblID.setFont(new Font("굴림", Font.PLAIN, 16));
		lblID.setHorizontalAlignment(SwingConstants.CENTER);
		lblID.setBounds(110, 234, 52, 25);
		getContentPane().add(lblID);
		
		txtID = new JTextField();
		txtID.setHorizontalAlignment(SwingConstants.CENTER);
		txtID.setFont(new Font("굴림", Font.PLAIN, 15));
		txtID.setBounds(174, 234, 150, 25);
		getContentPane().add(txtID);
		txtID.setColumns(10);
		
		JLabel lblPw = new JLabel("PW");
		lblPw.setHorizontalAlignment(SwingConstants.CENTER);
		lblPw.setFont(new Font("굴림", Font.PLAIN, 16));
		lblPw.setBounds(110, 273, 52, 25);
		getContentPane().add(lblPw);
		
		txtPW = new JPasswordField();
		txtPW.setHorizontalAlignment(SwingConstants.CENTER);
		txtPW.setFont(new Font("굴림", Font.PLAIN, 15));
		txtPW.setColumns(10);
		txtPW.setBounds(174, 273, 150, 25);
		getContentPane().add(txtPW);
		
		JButton btnLogin = new JButton("로그인");
		btnLogin.setFont(new Font("굴림", Font.PLAIN, 16));
		
		btnLogin.setBounds(57, 368, 164, 37);
		getContentPane().add(btnLogin);
		
		JButton btnSign_in = new JButton("회원가입");
		btnSign_in.setFont(new Font("굴림", Font.PLAIN, 16));
		btnSign_in.setBackground(new Color(173, 216, 230));
		
		btnSign_in.setBounds(283, 368, 164, 37);
		getContentPane().add(btnSign_in);
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 로그인 이벤트
				// 고객 리스트를 가져와서 ID와 PW 확인하고 로그인 여부 판단
				inputID = txtID.getText();
				inputPW = new String (txtPW.getPassword());
				
				readObject();
				
				// 구현중
				for(int i=0; i<Customerlist.size(); i++) {
					if(inputID.equals(Customerlist.get(i).getID())) {
						if(inputPW.equals(Customerlist.get(i).getPW())){
							UserID = inputID;
							UserPW = inputPW;
							UserName = Customerlist.get(i).getName();
							UserEmail = Customerlist.get(i).getEmail();
							UserNumber = Customerlist.get(i).getNumber();
							mainScreen = new MainScreen();
							mainScreen.setVisible(true);
							dispose();
						}
						else {
							// 비밀번호가 바르지 않습니다 메세지
						}
					}
					else {
						// 존재하지 않는 아이디입니다
					}
				
				}
			}
		});
		btnSign_in.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 회원가입 이벤트
				// 회원가입 창 띄우기
				dispose();
				signin = new Sign_in();
				signin.setVisible(true);
			}
		});
	}
	
	private void readObject() {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("CustomerObject.dat"));
			Customerlist = (ArrayList<Customer>) ois.readObject();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			this.Customerlist = new ArrayList<>();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

