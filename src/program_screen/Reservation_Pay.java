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

public class Reservation_Pay extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	String[] fruits={"카드", "캐시", "계좌이체", "무통장입금", "문화상품권", "영화관람권"};

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
		
		JLabel label = new JLabel("\uACB0\uC81C\uC218\uB2E8 \uC120\uD0DD");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("굴림", Font.PLAIN, 15));
		label.setBounds(29, 117, 100, 30);
		contentPane.add(label);
		
		JComboBox comboBox = new JComboBox(fruits);
		comboBox.setFont(new Font("굴림", Font.PLAIN, 15));
		comboBox.setBounds(134, 117, 147, 30);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("\uCD1D \uACB0\uC81C \uAE08\uC561 : ");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel.setBounds(29, 216, 100, 30);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(134, 222, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\uACB0\uC81C");
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 18));
		btnNewButton.setBounds(134, 315, 95, 30);
		contentPane.add(btnNewButton);
	}
}
