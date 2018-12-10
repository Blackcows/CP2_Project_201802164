package program_screen;

import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class MainScreen extends JFrame {
	
	private Graphics g;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen frame = new MainScreen();
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
	public MainScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 500);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\uC774\uBBF8\uC9C0");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(77, 90, 200, 250);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC81C\uBAA9");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(100, 350, 150, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uD3C9\uC810");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(100, 394, 70, 30);
		contentPane.add(lblNewLabel_2);
		
		JLabel label = new JLabel("\uC608\uB9E4\uC728");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(180, 394, 70, 30);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\uC774\uBBF8\uC9C0");
		label_1.setBounds(353, 90, 200, 250);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\uC774\uBBF8\uC9C0");
		label_2.setBounds(678, 90, 200, 250);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\uC81C\uBAA9");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(372, 350, 150, 30);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("\uD3C9\uC810");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(372, 394, 70, 30);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("\uC608\uB9E4\uC728");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(452, 394, 70, 30);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("\uC81C\uBAA9");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBounds(702, 350, 150, 30);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("\uD3C9\uC810");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBounds(702, 394, 70, 30);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("\uC608\uB9E4\uC728");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setBounds(782, 394, 70, 30);
		contentPane.add(label_8);
		
		JLabel lblNewLabel_3 = new JLabel("\uC624\uB298\uC758 \uCD94\uCC9C\uC791\uC744 \uB9CC\uB098\uBCF4\uC138\uC694~!");
		lblNewLabel_3.setToolTipText("");
		lblNewLabel_3.setBounds(77, 44, 200, 30);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("(Name) \uB2D8 \uD658\uC601\uD569\uB2C8\uB2E4");
		lblNewLabel_4.setBounds(12, 10, 200, 30);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("\uC0C1\uC810");
		btnNewButton.setBounds(815, 14, 60, 30);
		contentPane.add(btnNewButton);
		
		JPanel panel = new CirclePanel();
		panel.setBounds(884, 10, 90, 86);
		contentPane.add(panel);
		panel.setLayout(null);
	}
}

class CirclePanel extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.YELLOW);
		g.fillOval(10, 10, 60, 60);
	}
}
