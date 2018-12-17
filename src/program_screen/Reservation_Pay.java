package program_screen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Reservation_Pay extends JFrame {

	private JPanel contentPane;
	private JTextField txtTotalPrice;
	String[] pay={"ī��", "ĳ��", "������ü", "�������Ա�", "��ȭ��ǰ��", "��ȭ������"};
	
	private MainScreen mainScreen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reservation_Pay frame = new Reservation_Pay();
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
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Reservation_Pay() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblPay = new JLabel("���� ���� ����");
		lblPay.setHorizontalAlignment(SwingConstants.CENTER);
		lblPay.setFont(new Font("����", Font.PLAIN, 15));
		lblPay.setBounds(12, 117, 117, 30);
		contentPane.add(lblPay);
		
		JComboBox comboBox_Pay = new JComboBox(pay);
		comboBox_Pay.setFont(new Font("����", Font.PLAIN, 15));
		comboBox_Pay.setBounds(134, 117, 147, 30);
		contentPane.add(comboBox_Pay);
		
		JLabel lblTotalPrice = new JLabel("�� ���� �ݾ� : ");
		lblTotalPrice.setFont(new Font("����", Font.PLAIN, 15));
		lblTotalPrice.setBounds(29, 216, 100, 30);
		contentPane.add(lblTotalPrice);
		
		txtTotalPrice = new JTextField(); // �ݾ� ������ �ʵ�
		txtTotalPrice.setEditable(false);
		txtTotalPrice.setBounds(134, 222, 116, 21);
		txtTotalPrice.setText(Reservation_Personnel.price);
		contentPane.add(txtTotalPrice);
		txtTotalPrice.setColumns(10);
		
		JButton btnClear = new JButton("����");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainScreen = new MainScreen();
				mainScreen.setVisible(true);
				dispose();
			}
		});
		btnClear.setBackground(new Color(255, 0, 0));
		btnClear.setForeground(Color.BLACK);
		btnClear.setFont(new Font("����", Font.PLAIN, 18));
		btnClear.setBounds(134, 315, 95, 30);
		contentPane.add(btnClear);
	}
}
