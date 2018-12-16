package program_screen;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Reservation_Movie extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	private Reservation_Personnel reservation_Personnel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reservation_Movie frame = new Reservation_Movie();
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
	public Reservation_Movie() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblTitle = new JLabel("\uC0C1\uC601\uAD00 \uC120\uD0DD");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("±¼¸²", Font.PLAIN, 16));
		lblTitle.setBounds(175, 26, 100, 30);
		contentPane.add(lblTitle);
		
		JComboBox comboBox_Area = new JComboBox();
		comboBox_Area.setBounds(34, 165, 124, 30);
		contentPane.add(comboBox_Area);
		
		JLabel lblArea = new JLabel("\uC0C1\uC601\uAD00 \uC120\uD0DD");
		lblArea.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblArea.setBounds(34, 131, 85, 25);
		contentPane.add(lblArea);
		
		JLabel lblTime = new JLabel("\uC0C1\uC601\uC2DC\uAC04");
		lblTime.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblTime.setBounds(209, 131, 79, 25);
		contentPane.add(lblTime);
		
		JPanel panel = new JPanel();
		panel.setBounds(209, 165, 106, 30);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(0, 0, 106, 30);
		panel.add(textField);
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("±¼¸²", Font.PLAIN, 14));
		textField.setText("10:00");
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(209, 223, 106, 30);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		textField_2 = new JTextField();
		textField_2.setBounds(0, 0, 106, 30);
		panel_1.add(textField_2);
		textField_2.setText("12:00");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("±¼¸²", Font.PLAIN, 14));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(209, 275, 106, 30);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		textField_3 = new JTextField();
		textField_3.setBounds(0, 0, 106, 30);
		panel_2.add(textField_3);
		textField_3.setText("14:00");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("±¼¸²", Font.PLAIN, 14));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(209, 369, 106, 30);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(0, 0, 106, 30);
		panel_4.add(textField_1);
		textField_1.setText("18:00");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("±¼¸²", Font.PLAIN, 14));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(209, 325, 106, 30);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		textField_4 = new JTextField();
		textField_4.setBounds(0, 0, 106, 30);
		panel_3.add(textField_4);
		textField_4.setText("16:00");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("±¼¸²", Font.PLAIN, 14));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		
		JButton btnNext = new JButton("\uB2E4\uC74C");
		btnNext.setFont(new Font("±¼¸²", Font.PLAIN, 16));
		btnNext.setBounds(379, 430, 95, 23);
		contentPane.add(btnNext);
		
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reservation_Personnel = new Reservation_Personnel();
				reservation_Personnel.setVisible(true);
				dispose();
			}
		});
		
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setBackground(Color.PINK);
			}
		});
		textField_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setBackground(Color.PINK);
			}
		});
		textField_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setBackground(Color.PINK);
			}
		});
		textField_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setBackground(Color.PINK);
			}
		});
		textField_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setBackground(Color.PINK);
			}
		});
	}
}
