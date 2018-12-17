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
	String[] pay={"카드", "캐시", "계좌이체", "무통장입금", "문화상품권", "영화관람권"};
	
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
		
		JLabel lblPay = new JLabel("결재 수단 선택");
		lblPay.setHorizontalAlignment(SwingConstants.CENTER);
		lblPay.setFont(new Font("굴림", Font.PLAIN, 15));
		lblPay.setBounds(12, 117, 117, 30);
		contentPane.add(lblPay);
		
		JComboBox comboBox_Pay = new JComboBox(pay);
		comboBox_Pay.setFont(new Font("굴림", Font.PLAIN, 15));
		comboBox_Pay.setBounds(134, 117, 147, 30);
		contentPane.add(comboBox_Pay);
		
		JLabel lblTotalPrice = new JLabel("총 결재 금액 : ");
		lblTotalPrice.setFont(new Font("굴림", Font.PLAIN, 15));
		lblTotalPrice.setBounds(29, 216, 100, 30);
		contentPane.add(lblTotalPrice);
		
		txtTotalPrice = new JTextField(); // 금액 나오는 필드
		txtTotalPrice.setEditable(false);
		txtTotalPrice.setBounds(134, 222, 116, 21);
		txtTotalPrice.setText(Reservation_Personnel.price);
		contentPane.add(txtTotalPrice);
		txtTotalPrice.setColumns(10);
		
		JButton btnClear = new JButton("결재");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainScreen = new MainScreen();
				mainScreen.setVisible(true);
				dispose();
			}
		});
		btnClear.setBackground(new Color(255, 0, 0));
		btnClear.setForeground(Color.BLACK);
		btnClear.setFont(new Font("굴림", Font.PLAIN, 18));
		btnClear.setBounds(134, 315, 95, 30);
		contentPane.add(btnClear);
	}
}
