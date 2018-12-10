package program_screen;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class MovieInfor extends JFrame {

	private JPanel contentPane;
	private final JLabel lblNewLabel_1 = new JLabel("New label");
	private final JLabel label = new JLabel("New label");
	private final JLabel label_1 = new JLabel("New label");
	private final JLabel label_2 = new JLabel("New label");
	private final JButton btnNewButton = new JButton("\uC608\uB9E4");
	private final JLabel lblNewLabel_2 = new JLabel("New label");
	private final JLabel label_3 = new JLabel("New label");
	private final JLabel label_4 = new JLabel("New label");
	private final JLabel label_5 = new JLabel("New label");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MovieInfor frame = new MovieInfor();
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
	public MovieInfor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 500);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(76, 83, 200, 250);
		contentPane.add(lblNewLabel);
		lblNewLabel_1.setBounds(436, 113, 328, 30);
		contentPane.add(lblNewLabel_1);
		label.setBounds(436, 166, 328, 30);
		
		contentPane.add(label);
		label_1.setBounds(436, 227, 328, 30);
		
		contentPane.add(label_1);
		label_2.setBounds(436, 283, 328, 30);
		
		contentPane.add(label_2);
		btnNewButton.setBounds(275, 367, 135, 44);
		
		contentPane.add(btnNewButton);
		lblNewLabel_2.setBounds(306, 113, 70, 30);
		
		contentPane.add(lblNewLabel_2);
		label_3.setBounds(306, 166, 70, 30);
		
		contentPane.add(label_3);
		label_4.setBounds(306, 227, 70, 30);
		
		contentPane.add(label_4);
		label_5.setBounds(306, 283, 70, 30);
		
		contentPane.add(label_5);
	}

}
