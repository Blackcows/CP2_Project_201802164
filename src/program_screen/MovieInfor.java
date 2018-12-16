package program_screen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MovieInfor extends JFrame {

	private JPanel contentPane;
	private final JTextField txtTitle = new JTextField("제목");
	private final JTextField txtDate = new JTextField("개봉일");
	private final JTextField txtCategory = new JTextField("카테고리");
	private final JTextField txtRun_Time = new JTextField("상영시간");
	private final JTextField txtGrade = new JTextField("등급");
	private final JButton btnTicket = new JButton("예매");
	private final JLabel lblTitle = new JLabel("제목");
	private final JLabel lblDate = new JLabel("개봉일");
	private final JLabel lblCategory = new JLabel("카테고리");
	private final JLabel lblRun_Time = new JLabel("상영시간");
	private final JLabel lblGrade = new JLabel("등급");
	
	private Reservation_Movie reservation_Movie;

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
		
		JLabel lblimage = new JLabel("이미지");
		lblimage.setBounds(76, 83, 200, 250);
		contentPane.add(lblimage);
		
		lblTitle.setBounds(306, 83, 70, 30);
		contentPane.add(lblTitle);
		
		txtTitle.setEditable(false);
		txtTitle.setBounds(436, 83, 328, 30);
		contentPane.add(txtTitle);
		
		lblDate.setBounds(306, 136, 70, 30);
		contentPane.add(lblDate);
		
		txtDate.setEditable(false);
		txtDate.setBounds(436, 136, 328, 30);
		contentPane.add(txtDate);
		
		lblCategory.setBounds(306, 182, 70, 30);
		contentPane.add(lblCategory);
		
		txtCategory.setEditable(false);
		txtCategory.setBounds(436, 182, 328, 30);
		contentPane.add(txtCategory);
		
		lblRun_Time.setBounds(306, 230, 70, 30);
		contentPane.add(lblRun_Time);
		
		txtRun_Time.setEditable(false);
		txtRun_Time.setBounds(436, 230, 328, 30);
		contentPane.add(txtRun_Time);
		
		lblGrade.setBounds(306, 281, 70, 30);
		contentPane.add(lblGrade);
		
		txtGrade.setEditable(false);
		txtGrade.setBounds(436, 281, 328, 30);
		contentPane.add(txtGrade);
		btnTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reservation_Movie = new Reservation_Movie();
				reservation_Movie.setVisible(true);
				dispose();
			}
		});
		
				btnTicket.setBounds(275, 367, 135, 44);
				contentPane.add(btnTicket);
	}
}
