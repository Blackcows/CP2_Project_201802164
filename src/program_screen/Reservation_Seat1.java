package program_screen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Reservation_Seat1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtPrice;
	
	private Reservation_Pay reservation_Pay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reservation_Seat1 frame = new Reservation_Seat1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Reservation_Seat1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 500);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(156, 89, 698, 299);
		contentPane.add(panel_4);
		
		JButton btnA4 = new JButton("");
		btnA4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.setLayout(new GridLayout(5, 10, 5, 5));
		
		JButton button = new JButton("");
		panel_4.add(button);
		panel_4.add(btnA4);
		
		JButton btnA5 = new JButton("");
		btnA5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnA5);
		
		JButton btnA6 = new JButton("");
		btnA6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnA6);
		
		JButton btnA7 = new JButton("");
		btnA7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnA7);
		
		JButton btnA8 = new JButton("");
		btnA8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnA8);
		
		JButton btnA9 = new JButton("");
		btnA9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnA9);
		
		JButton btnA10 = new JButton("");
		btnA10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnA10);
		
		JButton btnA11 = new JButton("");
		btnA11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnA11);
		
		JButton btnA12 = new JButton("");
		btnA12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnA12);
		
		JButton btnB7 = new JButton("");
		btnB7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnB7);
		
		JButton btnB8 = new JButton("");
		btnB8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnB8);
		
		JButton btnB9 = new JButton("");
		btnB9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnB9);
		
		JButton btnB10 = new JButton("");
		btnB10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnB10);
		
		JButton btnB11 = new JButton("");
		btnB11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnB11);
		
		JButton btnB12 = new JButton("");
		btnB12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnB12);
		
		JButton btnB13 = new JButton("");
		btnB13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnB13);
		
		JButton btnC3 = new JButton("");
		btnC3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnC3);
		
		JButton btnC4 = new JButton("");
		btnC4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnC4);
		
		JButton btnC5 = new JButton("");
		btnC5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnC5);
		
		JButton btnC6 = new JButton("");
		btnC6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnC6);
		
		JButton btnC7 = new JButton("");
		btnC7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnC7);
		
		JButton btnC8 = new JButton("");
		btnC8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnC8);
		
		JButton btnC9 = new JButton("");
		btnC9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnC9);
		
		JButton btnC10 = new JButton("");
		btnC10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnC10);
		
		JButton btnC11 = new JButton("");
		btnC11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnC11);
		
		JButton btnC12 = new JButton("");
		btnC12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnC12);
		
		JButton btnC13 = new JButton("");
		btnC13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnC13);
		
		JButton btnD3 = new JButton("");
		btnD3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnD3);
		
		JButton btnD4 = new JButton("");
		btnD4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnD4);
		
		JButton btnD5 = new JButton("");
		btnD5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnD5);
		
		JButton btnD6 = new JButton("");
		btnD6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnD6);
		
		JButton btnD7 = new JButton("");
		btnD7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnD7);
		
		JButton btnD8 = new JButton("");
		btnD8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnD8);
		
		JButton btnD9 = new JButton("");
		btnD9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnD9);
		
		JButton btnD10 = new JButton("");
		btnD10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnD10);
		
		JButton btnD11 = new JButton("");
		btnD11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnD11);
		
		JButton btnD12 = new JButton("");
		btnD12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnD12);
		
		JButton btnD13 = new JButton("");
		btnD13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnD13);
		
		JButton btnE3 = new JButton("");
		btnE3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnE3);
		
		JButton btnE4 = new JButton("");
		btnE4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnE4);
		
		JButton btnE5 = new JButton("");
		btnE5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnE5);
		
		JButton btnE6 = new JButton("");
		btnE6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnE6);
		
		JButton btnE7 = new JButton("");
		btnE7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnE7);
		
		JButton btnE8 = new JButton("");
		btnE8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnE8);
		
		JButton btnE9 = new JButton("");
		btnE9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnE9);
		
		JButton btnE10 = new JButton("");
		btnE10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnE10);
		
		JButton btnE11 = new JButton("");
		btnE11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnE11);
		
		JButton btnE12 = new JButton("");
		btnE12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnE12);
		
		JButton btnE13 = new JButton("");
		btnE13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnE13);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(238, 130, 238));
		panel_6.setBounds(580, 398, 273, 55);
		contentPane.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblPrice = new JLabel("\uCD1D \uACB0\uC81C \uAE08\uC561 :");
		lblPrice.setFont(new Font("±º∏≤", Font.PLAIN, 18));
		lblPrice.setBounds(5, 10, 114, 35);
		panel_6.add(lblPrice);
		
		txtPrice = new JTextField();
		txtPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtPrice.setEditable(false);
		txtPrice.setBackground(new Color(238, 130, 238));
		txtPrice.setForeground(new Color(255, 255, 255));
		txtPrice.setHorizontalAlignment(SwingConstants.CENTER);
		txtPrice.setFont(new Font("±º∏≤", Font.PLAIN, 18));
		txtPrice.setBounds(131, 10, 130, 35);
		txtPrice.setText("(\uAE08\uC561 \uD544\uB4DC)");
		panel_6.add(txtPrice);
		txtPrice.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.LIGHT_GRAY);
		panel_5.setBounds(31, 10, 955, 40);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblScreen = new JLabel("\uC2A4\uD06C\uB9B0");
		lblScreen.setBounds(443, 10, 60, 24);
		panel_5.add(lblScreen);
		lblScreen.setBackground(new Color(192, 192, 192));
		lblScreen.setFont(new Font("±º∏≤", Font.PLAIN, 20));
		lblScreen.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_7 = new JPanel();
		panel_7.setForeground(Color.WHITE);
		panel_7.setBounds(92, 99, 36, 282);
		contentPane.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblA = new JLabel("A");
		lblA.setForeground(Color.BLUE);
		lblA.setBounds(0, 5, 36, 22);
		panel_7.add(lblA);
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblB = new JLabel("B");
		lblB.setForeground(Color.BLUE);
		lblB.setBounds(0, 63, 36, 22);
		panel_7.add(lblB);
		lblB.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblC = new JLabel("C");
		lblC.setForeground(Color.BLUE);
		lblC.setBounds(0, 127, 36, 22);
		panel_7.add(lblC);
		lblC.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblD = new JLabel("D");
		lblD.setForeground(Color.BLUE);
		lblD.setBounds(0, 192, 36, 22);
		panel_7.add(lblD);
		lblD.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblE = new JLabel("E");
		lblE.setForeground(Color.BLUE);
		lblE.setBounds(0, 250, 36, 22);
		panel_7.add(lblE);
		lblE.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnNext = new JButton("¥Ÿ¿Ω");
		btnNext.setBackground(Color.RED);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reservation_Pay = new Reservation_Pay();
				reservation_Pay.setVisible(true);
				dispose();
			}
		});
		btnNext.setFont(new Font("±º∏≤", Font.PLAIN, 15));
		btnNext.setBounds(879, 398, 95, 40);
		contentPane.add(btnNext);
	}
}
