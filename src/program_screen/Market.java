package program_screen;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Market extends JFrame {

	private JPanel contentPane;
	
	private MainScreen mainScreen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Market frame = new Market();
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
	public Market() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 500);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblUser = new JLabel("(Name) \uB2D8 \uD658\uC601\uD569\uB2C8\uB2E4");
		lblUser.setBounds(12, 10, 200, 30);
		contentPane.add(lblUser);
		
		JLabel lblTitle = new JLabel("-\uC0C1\uC810-");
		lblTitle.setToolTipText("");
		lblTitle.setBounds(77, 44, 200, 30);
		contentPane.add(lblTitle);
		
		JLabel lblimage1 = new JLabel("\uC774\uBBF8\uC9C0");
		lblimage1.setBackground(Color.WHITE);
		lblimage1.setForeground(Color.BLACK);
		lblimage1.setBounds(77, 90, 200, 250);
		contentPane.add(lblimage1);
		
		JLabel lblimage2 = new JLabel("\uC774\uBBF8\uC9C0");
		lblimage2.setBounds(353, 90, 200, 250);
		contentPane.add(lblimage2);
		
		JLabel lblimage3 = new JLabel("\uC774\uBBF8\uC9C0");
		lblimage3.setBounds(678, 90, 200, 250);
		contentPane.add(lblimage3);
		
		JLabel lblName1 = new JLabel("\uC81C\uD488\uBA85");
		lblName1.setHorizontalAlignment(SwingConstants.CENTER);
		lblName1.setBounds(100, 350, 150, 30);
		contentPane.add(lblName1);
		
		JLabel lblName2 = new JLabel("\uC81C\uD488\uBA85");
		lblName2.setHorizontalAlignment(SwingConstants.CENTER);
		lblName2.setBounds(372, 350, 150, 30);
		contentPane.add(lblName2);
		
		JLabel lblName3 = new JLabel("\uC81C\uD488\uBA85");
		lblName3.setHorizontalAlignment(SwingConstants.CENTER);
		lblName3.setBounds(702, 350, 150, 30);
		contentPane.add(lblName3);
		
		JLabel lblPrice1 = new JLabel("\uAC00\uACA9");
		lblPrice1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrice1.setBounds(100, 394, 150, 30);
		contentPane.add(lblPrice1);
		
		JLabel lblPrice2 = new JLabel("\uAC00\uACA9");
		lblPrice2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrice2.setBounds(372, 394, 150, 30);
		contentPane.add(lblPrice2);
		
		JLabel lblPrice3 = new JLabel("\uAC00\uACA9");
		lblPrice3.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrice3.setBounds(702, 394, 150, 30);
		contentPane.add(lblPrice3);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainScreen = new MainScreen();
				mainScreen.setVisible(true);
				dispose();
			}
		});
		btnHome.setBounds(815, 14, 82, 30);
		contentPane.add(btnHome);
	}

}
