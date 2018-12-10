package program_screen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class MovieInfor extends JFrame {

	private JPanel contentPane;
	private final JTextField txtTitle = new JTextField("����");
	private final JTextField txtDate = new JTextField("������");
	private final JTextField txtCategory = new JTextField("ī�װ�");
	private final JTextField txtRun_Time = new JTextField("�󿵽ð�");
	private final JTextField txtGrade = new JTextField("���");
	private final JButton TicketButton = new JButton("����");
	private final JLabel lblTitle = new JLabel("����");
	private final JLabel lblDate = new JLabel("������");
	private final JLabel lblCategory = new JLabel("ī�װ�");
	private final JLabel lblRun_Time = new JLabel("�󿵽ð�");
	private final JLabel lblGrade = new JLabel("���");

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
		
		JLabel lblimage = new JLabel("�̹���");
		lblimage.setBounds(76, 83, 200, 250);
		contentPane.add(lblimage);
		
		txtTitle.setEditable(false);
		txtTitle.setBounds(436, 83, 328, 30);
		contentPane.add(txtTitle);
		
		txtDate.setEditable(false);
		txtDate.setBounds(436, 136, 328, 30);
		contentPane.add(txtDate);
		
		txtCategory.setEditable(false);
		txtCategory.setBounds(436, 182, 328, 30);
		contentPane.add(txtCategory);
		
		txtRun_Time.setEditable(false);
		txtRun_Time.setBounds(436, 230, 328, 30);
		contentPane.add(txtRun_Time);

		TicketButton.setBounds(275, 367, 135, 44);
		contentPane.add(TicketButton);
		
		lblTitle.setBounds(306, 83, 70, 30);
		contentPane.add(lblTitle);
		
		lblDate.setBounds(306, 136, 70, 30);
		contentPane.add(lblDate);
		
		lblCategory.setBounds(306, 182, 70, 30);
		contentPane.add(lblCategory);
		
		lblRun_Time.setBounds(306, 230, 70, 30);
		contentPane.add(lblRun_Time);
		
		lblGrade.setBounds(306, 281, 70, 30);
		contentPane.add(lblGrade);
		
		txtGrade.setEditable(false);
		txtGrade.setBounds(436, 281, 328, 30);
		contentPane.add(txtGrade);
	}
}
