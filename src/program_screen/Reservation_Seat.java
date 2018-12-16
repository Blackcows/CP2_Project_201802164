package program_screen;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Reservation_Seat extends JFrame {

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
					Reservation_Seat frame = new Reservation_Seat();
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
	public Reservation_Seat() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 500);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(66, 101, 80, 159);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(5, 2, 5, 5));
		
		JButton btnA1 = new JButton("");
		btnA1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnA1);
		
		JButton btnA2 = new JButton("");
		btnA2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnA2);
		
		JButton btnB1 = new JButton("");
		btnB1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnB1);
		
		JButton btnB2 = new JButton("");
		btnB2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnB2);
		
		JButton btnC1 = new JButton("");
		btnC1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnC1);
		
		JButton btnC2 = new JButton("");
		btnC2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnC2);
		
		JButton btnD1 = new JButton("");
		btnD1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnD1);
		
		JButton btnD2 = new JButton("");
		btnD2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnD2);
		
		JButton btnE1 = new JButton("");
		btnE1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnE1);
		
		JButton btnE2 = new JButton("");
		btnE2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnE2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(66, 295, 80, 131);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(4, 2, 5, 5));
		
		JButton btnF1 = new JButton("");
		btnF1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnF1);
		
		JButton btnF2 = new JButton("");
		btnF2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnF2);
		
		JButton btnG1 = new JButton("");
		btnG1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnG1);
		
		JButton btnG2 = new JButton("");
		btnG2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnG2);
		
		JButton btnH1 = new JButton("");
		btnH1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnH1);
		
		JButton btnH2 = new JButton("");
		btnH2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnH2);
		
		JButton btn_I1 = new JButton("");
		btn_I1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btn_I1);
		
		JButton btn_I2 = new JButton("");
		btn_I2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btn_I2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(737, 101, 80, 159);
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(5, 2, 5, 5));
		
		JButton btnA14 = new JButton("");
		btnA14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_2.add(btnA14);
		
		JButton btnA15 = new JButton("");
		btnA15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_2.add(btnA15);
		
		JButton btnB14 = new JButton("");
		btnB14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_2.add(btnB14);
		
		JButton btnB15 = new JButton("");
		btnB15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_2.add(btnB15);
		
		JButton btnC14 = new JButton("");
		btnC14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_2.add(btnC14);
		
		JButton brnC15 = new JButton("");
		brnC15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_2.add(brnC15);
		
		JButton btnD14 = new JButton("");
		btnD14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_2.add(btnD14);
		
		JButton btnD15 = new JButton("");
		btnD15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_2.add(btnD15);
		
		JButton btnE14 = new JButton("");
		btnE14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_2.add(btnE14);
		
		JButton brnE15 = new JButton("");
		brnE15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_2.add(brnE15);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(191, 101, 502, 159);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnA4 = new JButton("");
		btnA4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnA4.setBounds(46, 2, 41, 27);
		panel_4.add(btnA4);
		
		JButton btnA5 = new JButton("");
		btnA5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnA5.setBounds(92, 2, 41, 27);
		panel_4.add(btnA5);
		
		JButton btnA6 = new JButton("");
		btnA6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnA6.setBounds(138, 2, 41, 27);
		panel_4.add(btnA6);
		
		JButton btnA7 = new JButton("");
		btnA7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnA7.setBounds(184, 2, 41, 27);
		panel_4.add(btnA7);
		
		JButton btnA8 = new JButton("");
		btnA8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnA8.setBounds(230, 2, 41, 27);
		panel_4.add(btnA8);
		
		JButton btnA9 = new JButton("");
		btnA9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnA9.setBounds(276, 2, 41, 27);
		panel_4.add(btnA9);
		
		JButton btnA10 = new JButton("");
		btnA10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnA10.setBounds(322, 2, 41, 27);
		panel_4.add(btnA10);
		
		JButton btnA11 = new JButton("");
		btnA11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnA11.setBounds(368, 2, 41, 27);
		panel_4.add(btnA11);
		
		JButton btnA12 = new JButton("");
		btnA12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnA12.setBounds(414, 2, 41, 27);
		panel_4.add(btnA12);
		
		JButton btnA13 = new JButton("");
		btnA13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnA13.setBounds(460, 2, 41, 27);
		panel_4.add(btnA13);
		
		JButton btnB3 = new JButton("");
		btnB3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnB3.setBounds(0, 34, 41, 27);
		panel_4.add(btnB3);
		
		JButton btnB4 = new JButton("");
		btnB4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnB4.setBounds(46, 34, 41, 27);
		panel_4.add(btnB4);
		
		JButton btnB5 = new JButton("");
		btnB5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnB5.setBounds(92, 34, 41, 27);
		panel_4.add(btnB5);
		
		JButton btnB6 = new JButton("");
		btnB6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnB6.setBounds(138, 34, 41, 27);
		panel_4.add(btnB6);
		
		JButton btnB7 = new JButton("");
		btnB7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnB7.setBounds(184, 34, 41, 27);
		panel_4.add(btnB7);
		
		JButton btnB8 = new JButton("");
		btnB8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnB8.setBounds(230, 34, 41, 27);
		panel_4.add(btnB8);
		
		JButton btnB9 = new JButton("");
		btnB9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnB9.setBounds(276, 34, 41, 27);
		panel_4.add(btnB9);
		
		JButton btnB10 = new JButton("");
		btnB10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnB10.setBounds(322, 34, 41, 27);
		panel_4.add(btnB10);
		
		JButton btnB11 = new JButton("");
		btnB11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnB11.setBounds(368, 34, 41, 27);
		panel_4.add(btnB11);
		
		JButton btnB12 = new JButton("");
		btnB12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnB12.setBounds(414, 34, 41, 27);
		panel_4.add(btnB12);
		
		JButton btnB13 = new JButton("");
		btnB13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnB13.setBounds(460, 34, 41, 27);
		panel_4.add(btnB13);
		
		JButton btnC3 = new JButton("");
		btnC3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnC3.setBounds(0, 66, 41, 27);
		panel_4.add(btnC3);
		
		JButton btnC4 = new JButton("");
		btnC4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnC4.setBounds(46, 66, 41, 27);
		panel_4.add(btnC4);
		
		JButton btnC5 = new JButton("");
		btnC5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnC5.setBounds(92, 66, 41, 27);
		panel_4.add(btnC5);
		
		JButton btnC6 = new JButton("");
		btnC6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnC6.setBounds(138, 66, 41, 27);
		panel_4.add(btnC6);
		
		JButton btnC7 = new JButton("");
		btnC7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnC7.setBounds(184, 66, 41, 27);
		panel_4.add(btnC7);
		
		JButton btnC8 = new JButton("");
		btnC8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnC8.setBounds(230, 66, 41, 27);
		panel_4.add(btnC8);
		
		JButton btnC9 = new JButton("");
		btnC9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnC9.setBounds(276, 66, 41, 27);
		panel_4.add(btnC9);
		
		JButton btnC10 = new JButton("");
		btnC10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnC10.setBounds(322, 66, 41, 27);
		panel_4.add(btnC10);
		
		JButton btnC11 = new JButton("");
		btnC11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnC11.setBounds(368, 66, 41, 27);
		panel_4.add(btnC11);
		
		JButton btnC12 = new JButton("");
		btnC12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnC12.setBounds(414, 66, 41, 27);
		panel_4.add(btnC12);
		
		JButton btnC13 = new JButton("");
		btnC13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnC13.setBounds(460, 66, 41, 27);
		panel_4.add(btnC13);
		
		JButton btnD3 = new JButton("");
		btnD3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnD3.setBounds(0, 98, 41, 27);
		panel_4.add(btnD3);
		
		JButton btnD4 = new JButton("");
		btnD4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnD4.setBounds(46, 98, 41, 27);
		panel_4.add(btnD4);
		
		JButton btnD5 = new JButton("");
		btnD5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnD5.setBounds(92, 98, 41, 27);
		panel_4.add(btnD5);
		
		JButton btnD6 = new JButton("");
		btnD6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnD6.setBounds(138, 98, 41, 27);
		panel_4.add(btnD6);
		
		JButton btnD7 = new JButton("");
		btnD7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnD7.setBounds(184, 98, 41, 27);
		panel_4.add(btnD7);
		
		JButton btnD8 = new JButton("");
		btnD8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnD8.setBounds(230, 98, 41, 27);
		panel_4.add(btnD8);
		
		JButton btnD9 = new JButton("");
		btnD9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnD9.setBounds(276, 98, 41, 27);
		panel_4.add(btnD9);
		
		JButton btnD10 = new JButton("");
		btnD10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnD10.setBounds(322, 98, 41, 27);
		panel_4.add(btnD10);
		
		JButton btnD11 = new JButton("");
		btnD11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnD11.setBounds(368, 98, 41, 27);
		panel_4.add(btnD11);
		
		JButton btnD12 = new JButton("");
		btnD12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnD12.setBounds(414, 98, 41, 27);
		panel_4.add(btnD12);
		
		JButton btnD13 = new JButton("");
		btnD13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnD13.setBounds(460, 98, 41, 27);
		panel_4.add(btnD13);
		
		JButton btnE3 = new JButton("");
		btnE3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnE3.setBounds(0, 130, 41, 27);
		panel_4.add(btnE3);
		
		JButton btnE4 = new JButton("");
		btnE4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnE4.setBounds(46, 130, 41, 27);
		panel_4.add(btnE4);
		
		JButton btnE5 = new JButton("");
		btnE5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnE5.setBounds(92, 130, 41, 27);
		panel_4.add(btnE5);
		
		JButton btnE6 = new JButton("");
		btnE6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnE6.setBounds(138, 130, 41, 27);
		panel_4.add(btnE6);
		
		JButton btnE7 = new JButton("");
		btnE7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnE7.setBounds(184, 130, 41, 27);
		panel_4.add(btnE7);
		
		JButton btnE8 = new JButton("");
		btnE8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnE8.setBounds(230, 130, 41, 27);
		panel_4.add(btnE8);
		
		JButton btnE9 = new JButton("");
		btnE9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnE9.setBounds(276, 130, 41, 27);
		panel_4.add(btnE9);
		
		JButton btnE10 = new JButton("");
		btnE10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnE10.setBounds(322, 130, 41, 27);
		panel_4.add(btnE10);
		
		JButton btnE11 = new JButton("");
		btnE11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnE11.setBounds(368, 130, 41, 27);
		panel_4.add(btnE11);
		
		JButton btnE12 = new JButton("");
		btnE12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnE12.setBounds(414, 130, 41, 27);
		panel_4.add(btnE12);
		
		JButton btnE13 = new JButton("");
		btnE13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnE13.setBounds(460, 130, 41, 27);
		panel_4.add(btnE13);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(191, 295, 502, 131);
		contentPane.add(panel_3);
		panel_3.setLayout(new GridLayout(4, 11, 5, 5));
		
		JButton btnF3 = new JButton("");
		btnF3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btnF3);
		
		JButton btnF4 = new JButton("");
		btnF4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btnF4);
		
		JButton btnF5 = new JButton("");
		btnF5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btnF5);
		
		JButton btnF6 = new JButton("");
		btnF6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btnF6);
		
		JButton btnF7 = new JButton("");
		btnF7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btnF7);
		
		JButton btnF8 = new JButton("");
		btnF8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btnF8);
		
		JButton btnF9 = new JButton("");
		btnF9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btnF9);
		
		JButton btnF10 = new JButton("");
		btnF10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btnF10);
		
		JButton btnF11 = new JButton("");
		btnF11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btnF11);
		
		JButton btnF12 = new JButton("");
		btnF12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btnF12);
		
		JButton btnF13 = new JButton("");
		btnF13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btnF13);
		
		JButton btnG3 = new JButton("");
		btnG3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btnG3);
		
		JButton btnG4 = new JButton("");
		btnG4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btnG4);
		
		JButton btnG5 = new JButton("");
		btnG5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btnG5);
		
		JButton btnG6 = new JButton("");
		btnG6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btnG6);
		
		JButton btnG7 = new JButton("");
		btnG7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btnG7);
		
		JButton btnG8 = new JButton("");
		btnG8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btnG8);
		
		JButton btnG9 = new JButton("");
		btnG9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btnG9);
		
		JButton btnG10 = new JButton("");
		btnG10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btnG10);
		
		JButton btnG11 = new JButton("");
		btnG11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btnG11);
		
		JButton btnG12 = new JButton("");
		btnG12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btnG12);
		
		JButton btnG13 = new JButton("");
		btnG13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btnG13);
		
		JButton btnH3 = new JButton("");
		btnH3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btnH3);
		
		JButton btnH4 = new JButton("");
		btnH4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btnH4);
		
		JButton btnH5 = new JButton("");
		btnH5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btnH5);
		
		JButton btnH6 = new JButton("");
		btnH6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btnH6);
		
		JButton btnH7 = new JButton("");
		btnH7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btnH7);
		
		JButton btnH8 = new JButton("");
		btnH8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btnH8);
		
		JButton btnH9 = new JButton("");
		btnH9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btnH9);
		
		JButton btnH10 = new JButton("");
		btnH10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btnH10);
		
		JButton btnH11 = new JButton("");
		btnH11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btnH11);
		
		JButton btnH12 = new JButton("");
		btnH12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btnH12);
		
		JButton btnH13 = new JButton("");
		btnH13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btnH13);
		
		JButton btn_I3 = new JButton("");
		btn_I3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btn_I3);
		
		JButton btn_I4 = new JButton("");
		btn_I4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btn_I4);
		
		JButton btn_I5 = new JButton("");
		btn_I5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btn_I5);
		
		JButton btn_I6 = new JButton("");
		btn_I6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btn_I6);
		
		JButton btn_I7 = new JButton("");
		btn_I7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btn_I7);
		
		JButton btn_I8 = new JButton("");
		btn_I8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btn_I8);
		
		JButton btn_I9 = new JButton("");
		btn_I9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btn_I9);
		
		JButton btn_I10 = new JButton("");
		btn_I10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btn_I10);
		
		JButton btn_I11 = new JButton("");
		btn_I11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btn_I11);
		
		JButton btn_I12 = new JButton("");
		btn_I12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btn_I12);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(238, 130, 238));
		panel_6.setBounds(701, 331, 273, 55);
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
		panel_5.setBounds(12, 10, 974, 40);
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
		panel_7.setBounds(18, 101, 36, 326);
		contentPane.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblA = new JLabel("A");
		lblA.setForeground(Color.BLUE);
		lblA.setBounds(0, 5, 36, 22);
		panel_7.add(lblA);
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblB = new JLabel("B");
		lblB.setForeground(Color.BLUE);
		lblB.setBounds(0, 37, 36, 22);
		panel_7.add(lblB);
		lblB.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblC = new JLabel("C");
		lblC.setForeground(Color.BLUE);
		lblC.setBounds(0, 69, 36, 22);
		panel_7.add(lblC);
		lblC.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblD = new JLabel("D");
		lblD.setForeground(Color.BLUE);
		lblD.setBounds(0, 101, 36, 22);
		panel_7.add(lblD);
		lblD.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblE = new JLabel("E");
		lblE.setForeground(Color.BLUE);
		lblE.setBounds(0, 133, 36, 22);
		panel_7.add(lblE);
		lblE.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblF = new JLabel("F");
		lblF.setForeground(Color.BLUE);
		lblF.setBounds(0, 197, 36, 22);
		panel_7.add(lblF);
		lblF.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblG = new JLabel("G");
		lblG.setForeground(Color.BLUE);
		lblG.setBounds(0, 232, 36, 22);
		panel_7.add(lblG);
		lblG.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblH = new JLabel("H");
		lblH.setForeground(Color.BLUE);
		lblH.setBounds(0, 265, 36, 22);
		panel_7.add(lblH);
		lblH.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblI = new JLabel("I");
		lblI.setForeground(Color.BLUE);
		lblI.setBounds(0, 300, 36, 22);
		panel_7.add(lblI);
		lblI.setHorizontalAlignment(SwingConstants.CENTER);
		
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
