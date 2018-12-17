package program_screen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Reservation_Personnel extends JFrame {

	private JPanel contentPane;

	private Reservation_Seat reservation_Seat;
	private JTextField txtAdult;
	private JTextField txtChild;
	private JTextField txtPrice;
	
	static String price;
	static int personnel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reservation_Personnel frame = new Reservation_Personnel();
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
	public Reservation_Personnel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JLabel lblTitle = new JLabel("\uC778\uC6D0 \uC120\uD0DD");
		lblTitle.setFont(new Font("굴림", Font.PLAIN, 16));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(183, 28, 100, 30);
		contentPane.add(lblTitle);

		JLabel lblAdult = new JLabel("\uC131\uC778");
		lblAdult.setFont(new Font("굴림", Font.PLAIN, 15));
		lblAdult.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdult.setBounds(90, 129, 52, 25);
		contentPane.add(lblAdult);

		txtAdult = new JTextField();
		txtAdult.setBounds(162, 132, 106, 21);
		contentPane.add(txtAdult);
		txtAdult.setColumns(10);
		txtAdult.setText("0");  // 처음에 들어가면

		/* 성인 인원 입력 시 가격 계산 */
		txtAdult.getDocument().addDocumentListener(new DocumentListener() {

			// 값이 삭제됐을 때
			@Override
			public void removeUpdate(DocumentEvent arg0) {  
				// TODO Auto-generated method stub
			}

			// 값이 입력됐을 때
			@Override
			public void insertUpdate(DocumentEvent arg0) {
				// TODO Auto-generated method stub
				txtPrice.setText(Integer.parseInt(txtAdult.getText()) * 10000
						+ Integer.parseInt(txtChild.getText()) * 8000 + "원");

			}

			// 값이 바뀌었을 때
			@Override
			public void changedUpdate(DocumentEvent arg0) {
				// TODO Auto-generated method stub
				txtPrice.setText(Integer.parseInt(txtAdult.getText()) * 10000
						+ Integer.parseInt(txtChild.getText()) * 8000 + "원");

			}
		});

		JLabel lblChild = new JLabel("\uCCAD\uC18C\uB144");
		lblChild.setHorizontalAlignment(SwingConstants.CENTER);
		lblChild.setFont(new Font("굴림", Font.PLAIN, 15));
		lblChild.setBounds(90, 183, 52, 25);
		contentPane.add(lblChild);

		txtChild = new JTextField();
		txtChild.setColumns(10);
		txtChild.setBounds(162, 186, 106, 21);
		contentPane.add(txtChild);
		txtChild.setText("0");
		txtChild.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void removeUpdate(DocumentEvent arg0) {
				// TODO Auto-generated method stub
			}

			@Override
			public void insertUpdate(DocumentEvent arg0) {
				// TODO Auto-generated method stub
				txtPrice.setText(Integer.parseInt(txtAdult.getText()) * 10000
						+ Integer.parseInt(txtChild.getText()) * 8000 + "원");

			}

			@Override
			public void changedUpdate(DocumentEvent arg0) {
				// TODO Auto-generated method stub
				txtPrice.setText(Integer.parseInt(txtAdult.getText()) * 10000
						+ Integer.parseInt(txtChild.getText()) * 8000 + "원");

			}
		});

		JPanel panel = new JPanel();
		panel.setBounds(67, 248, 206, 30);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblPrice = new JLabel("\uACB0\uC81C \uAE08\uC561");
		lblPrice.setBounds(0, 3, 75, 25);
		panel.add(lblPrice);
		lblPrice.setFont(new Font("굴림", Font.PLAIN, 16));

		txtPrice = new JTextField();
		txtPrice.setBounds(95, 3, 106, 21);
		panel.add(txtPrice);
		txtPrice.setEditable(false);
		txtPrice.setColumns(10);
		txtPrice.setText("0원");

		JButton btnNext = new JButton("\uB2E4\uC74C");
		btnNext.setFont(new Font("굴림", Font.PLAIN, 15));
		btnNext.setBounds(379, 430, 95, 23);
		contentPane.add(btnNext);

		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personnel = Integer.parseInt(txtAdult.getText() + txtChild.getText());
				price = txtPrice.getText();
				reservation_Seat = new Reservation_Seat();
				reservation_Seat.setVisible(true);
				dispose();

			}
		});

	}

}