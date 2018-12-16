package program_screen;

import java.awt.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.*;
import Theater.Customer;

public class Sign_in extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField number1;
	private JTextField txtID;
	private JPasswordField number2;
	private JPasswordField txtPW;
	private JPasswordField txtPWchk;
	private JTextField txtEmail;
	
	private LoginFrame loginFrame;
	
	private ArrayList<Customer> Customerlist;
	private String ID, PW;
	private String Name;
	private String Number;
	private String Email;

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
		setBounds(100, 100, 500, 650);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblTitle = new JLabel("��� ����");
		lblTitle.setBackground(new Color(173, 255, 47));
		lblTitle.setFont(new Font("����", Font.PLAIN, 16));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(12, 10, 70, 20);
		contentPane.add(lblTitle);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(12, 62, 400, 200);
		contentPane.add(scrollPane);
		
		JCheckBox chkBox = new JCheckBox("\uC0C1\uAE30 \uB0B4\uC6A9\uC744 \uD655\uC778\uD558\uC600\uC73C\uBA70 \uC774\uC5D0 \uB3D9\uC758\uD569\uB2C8\uB2E4.");
		chkBox.setFont(new Font("����", Font.PLAIN, 16));
		chkBox.setBounds(8, 265, 346, 23);
		contentPane.add(chkBox);
		
		JLabel lblTitle2 = new JLabel("�������� �Է�");
		lblTitle2.setBackground(new Color(173, 255, 47));
		lblTitle2.setFont(new Font("����", Font.PLAIN, 16));
		lblTitle2.setBounds(12, 294, 111, 20);
		contentPane.add(lblTitle2);
		
		JLabel lblName = new JLabel("�̸� :");
		lblName.setFont(new Font("����", Font.PLAIN, 18));
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setBounds(62, 324, 70, 30);
		contentPane.add(lblName);
		
		txtName = new JTextField();
		txtName.setFont(new Font("����", Font.PLAIN, 18));
		txtName.setBounds(144, 329, 105, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel label = new JLabel("\uC8FC\uBBFC\uB4F1\uB85D\uBC88\uD638 :");
		label.setFont(new Font("����", Font.PLAIN, 18));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(12, 364, 120, 30);
		contentPane.add(label);
		
		number1 = new JTextField(); // �ֹι�ȣ ���ڸ�
		number1.setFont(new Font("����", Font.PLAIN, 18));
		number1.setColumns(10);
		number1.setBounds(144, 369, 105, 20);
		contentPane.add(number1);
		
		JLabel lbl_ = new JLabel("-");
		lbl_.setFont(new Font("����", Font.PLAIN, 20));
		lbl_.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_.setBounds(244, 371, 52, 15);
		contentPane.add(lbl_);
		
		number2 = new JPasswordField(); // �ֹι�ȣ ���ڸ�
		number2.setBounds(292, 370, 120, 20);
		contentPane.add(number2);
		
		JLabel lblId = new JLabel("���̵� :");
		lblId.setFont(new Font("����", Font.PLAIN, 18));
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setBounds(62, 404, 70, 30);
		contentPane.add(lblId);
		
		txtID = new JTextField();
		txtID.setFont(new Font("����", Font.PLAIN, 18));
		txtID.setColumns(10);
		txtID.setBounds(144, 409, 105, 20);
		contentPane.add(txtID);
		
		JButton btnIDchk = new JButton("\uC911\uBCF5\uD655\uC778");
		
		btnIDchk.setBounds(275, 410, 95, 20);
		contentPane.add(btnIDchk);
		
		btnIDchk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ���̵� �ߺ�Ȯ��
				
			}
		});
		
		JLabel lblPw = new JLabel("��й�ȣ :");
		lblPw.setFont(new Font("����", Font.PLAIN, 18));
		lblPw.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPw.setBounds(34, 444, 98, 30);
		contentPane.add(lblPw);
		
		txtPW = new JPasswordField(); // ��й�ȣ
		txtPW.setBounds(144, 450, 105, 20);
		contentPane.add(txtPW);
		
		JLabel lblPWchk = new JLabel("\uBE44\uBC00\uBC88\uD638\uD655\uC778: ");
		lblPWchk.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPWchk.setFont(new Font("����", Font.PLAIN, 18));
		lblPWchk.setBounds(12, 484, 120, 30);
		contentPane.add(lblPWchk);
		
		txtPWchk = new JPasswordField(); // ��й�ȣ Ȯ��
		txtPWchk.setBounds(144, 490, 105, 20);
		contentPane.add(txtPWchk);
		
		JButton btnPWChk = new JButton("��й�ȣȮ�� : ");
		btnPWChk.setBounds(275, 490, 120, 20);
		contentPane.add(btnPWChk);
		
		JLabel lblEmail = new JLabel("�̸��� :");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setFont(new Font("����", Font.PLAIN, 18));
		lblEmail.setBounds(12, 524, 120, 30);
		contentPane.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(144, 530, 105, 20);
		contentPane.add(txtEmail);
		
		JButton btnNext = new JButton("����");
		
		btnNext.setFont(new Font("����", Font.PLAIN, 18));
		btnNext.setBounds(379, 580, 95, 23);
		contentPane.add(btnNext);
		
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ȸ�� ������ ��ü�� ���� �Է��ϰ� ���� â ����, �α��� â �ٽ� ����
				
				readObject();
				ID = txtID.getText();
				PW = new String(txtPW.getPassword());
				Name = txtName.getText();
				Number = number1.getText().concat(new String(number2.getPassword()));
				Email = txtEmail.getText();
				Customerlist.add(new Customer(ID, PW, Name, Number, Email));
				saveObject();
				
				loginFrame = new LoginFrame();
				loginFrame.setVisible(true);
				dispose();
			}
		});
		
		btnPWChk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ��й�ȣ �Է� 2���� �� ��ġ�ϴ��� Ȯ��
				
			}
		});
	}
	
	private void readObject() {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("CustomerObject.dat")); // object.dat �� ����� (����Ʈ)��ü �Է� ��Ʈ�� ����
			Customerlist = (ArrayList<Customer>) ois.readObject(); // �о�� ����Ʈ ��ü�� list ������ ����
		} catch (IOException e) {
			// TODO Auto-generated catch block
			this.Customerlist = new ArrayList<Customer>();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void saveObject() {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("CustomerObject.dat"));
			oos.writeObject(this.Customerlist);
			oos.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
