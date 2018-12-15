package program_screen;

import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;

public class MainScreen extends JFrame {
	
	private Graphics g;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

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
		
		JLabel lbl_image1 = new JLabel("이미지");
		lbl_image1.setBackground(Color.WHITE);
		lbl_image1.setForeground(Color.BLACK);
		lbl_image1.setBounds(77, 90, 200, 250);
		contentPane.add(lbl_image1);
		
		JLabel lbl_image2 = new JLabel("이미지");
		lbl_image2.setBounds(353, 90, 200, 250);
		contentPane.add(lbl_image2);
		
		JLabel lbl_image3 = new JLabel("이미지");
		lbl_image3.setBounds(678, 90, 200, 250);
		contentPane.add(lbl_image3);
		
		JLabel lbl1 = new JLabel("오늘의 추천작을 만나보세요~!");
		lbl1.setBounds(77, 44, 200, 30);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("(Name) 님 환영합니다.");
		lbl2.setBounds(12, 10, 200, 30);
		contentPane.add(lbl2);
		
		JButton marketButton = new JButton("상점");
		marketButton.setBounds(815, 14, 60, 30);
		contentPane.add(marketButton);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("제목");
		textField.setEditable(false);
		textField.setBounds(100, 350, 150, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("제목");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(372, 350, 150, 30);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("제목");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(702, 350, 150, 30);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("평점");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(100, 394, 70, 30);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText("평점");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(372, 394, 70, 30);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setText("평점");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(702, 394, 70, 30);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setText("예매율");
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(180, 394, 70, 30);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setText("예매율");
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(452, 394, 70, 30);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setText("예매율");
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(782, 394, 70, 30);
		contentPane.add(textField_8);
	}
}

class CirclePanel extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.YELLOW);
		g.fillOval(10, 10, 60, 60);
	}
}
