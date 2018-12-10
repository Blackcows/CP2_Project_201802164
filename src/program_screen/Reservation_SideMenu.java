package program_screen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Reservation_SideMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reservation_SideMenu frame = new Reservation_SideMenu();
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
	public Reservation_SideMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 500);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\uC774\uBBF8\uC9C0");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(77, 90, 200, 250);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC81C\uD488\uBA85");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(100, 350, 150, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uAC00\uACA9");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(100, 394, 150, 30);
		contentPane.add(lblNewLabel_2);
		
		JLabel label_1 = new JLabel("\uC774\uBBF8\uC9C0");
		label_1.setBounds(353, 90, 200, 250);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\uC774\uBBF8\uC9C0");
		label_2.setBounds(678, 90, 200, 250);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\uC81C\uD488\uBA85");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(372, 350, 150, 30);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("\uAC00\uACA9");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(372, 394, 150, 30);
		contentPane.add(label_4);
		
		JLabel label_6 = new JLabel("\uC81C\uD488\uBA85");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBounds(702, 350, 150, 30);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("\uAC00\uACA9");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBounds(702, 394, 150, 30);
		contentPane.add(label_7);
		
		JLabel lblNewLabel_3 = new JLabel("-\uC0C1\uC810-");
		lblNewLabel_3.setToolTipText("");
		lblNewLabel_3.setBounds(77, 44, 200, 30);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("(Name) \uB2D8 \uD658\uC601\uD569\uB2C8\uB2E4");
		lblNewLabel_4.setBounds(12, 10, 200, 30);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("\uC0C1\uC810");
		btnNewButton.setBounds(815, 14, 60, 30);
		contentPane.add(btnNewButton);
	}

}
