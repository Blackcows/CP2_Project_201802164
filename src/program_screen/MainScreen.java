package program_screen;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainScreen extends JFrame {
	private JPanel contentPane;
	private JTextField txtTitle1;
	private JTextField txtTitle2;
	private JTextField txtTitle3;
	private JTextField txtRate1;
	private JTextField txtRate2;
	private JTextField txtRate3;
	private JTextField txtTicketRate1;
	private JTextField txtTicketRate2;
	private JTextField txtTicketRate3;
	
	private MovieInfor movieInfor;
	private Market market;

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
		
		JLabel lblUser = new JLabel("(Name) 님 환영합니다.");
		lblUser.setBounds(12, 10, 200, 30);
		contentPane.add(lblUser);
		
		JLabel lblTitle = new JLabel("오늘의 추천작을 만나보세요~!");
		lblTitle.setBounds(77, 44, 200, 30);
		contentPane.add(lblTitle);
		
		JLabel lblimage1 = new JLabel("이미지");
		lblimage1.setBackground(Color.WHITE);
		lblimage1.setForeground(Color.BLACK);
		lblimage1.setBounds(77, 90, 200, 250);
		contentPane.add(lblimage1);
		
		JLabel lblimage2 = new JLabel("이미지");
		lblimage2.setBounds(353, 90, 200, 250);
		contentPane.add(lblimage2);
		
		JLabel lblimage3 = new JLabel("이미지");
		lblimage3.setBounds(678, 90, 200, 250);
		contentPane.add(lblimage3);
		
		txtTitle1 = new JTextField();
		txtTitle1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				movieInfor = new MovieInfor();
				movieInfor.setVisible(true);
				dispose();
			}
		});
		txtTitle1.setHorizontalAlignment(SwingConstants.CENTER);
		txtTitle1.setText("제목");
		txtTitle1.setEditable(false);
		txtTitle1.setBounds(100, 350, 150, 30);
		contentPane.add(txtTitle1);
		txtTitle1.setColumns(10);
		
		txtTitle2 = new JTextField();
		txtTitle2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				movieInfor = new MovieInfor();
				movieInfor.setVisible(true);
				dispose();
			}
		});
		txtTitle2.setText("제목");
		txtTitle2.setHorizontalAlignment(SwingConstants.CENTER);
		txtTitle2.setEditable(false);
		txtTitle2.setColumns(10);
		txtTitle2.setBounds(372, 350, 150, 30);
		contentPane.add(txtTitle2);
		
		txtTitle3 = new JTextField();
		txtTitle3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				movieInfor = new MovieInfor();
				movieInfor.setVisible(true);
				dispose();
			}
		});
		txtTitle3.setText("제목");
		txtTitle3.setHorizontalAlignment(SwingConstants.CENTER);
		txtTitle3.setEditable(false);
		txtTitle3.setColumns(10);
		txtTitle3.setBounds(702, 350, 150, 30);
		contentPane.add(txtTitle3);
		
		txtRate1 = new JTextField();
		txtRate1.setText("평점");
		txtRate1.setHorizontalAlignment(SwingConstants.CENTER);
		txtRate1.setEditable(false);
		txtRate1.setColumns(10);
		txtRate1.setBounds(100, 394, 70, 30);
		contentPane.add(txtRate1);
		
		txtRate2 = new JTextField();
		txtRate2.setText("평점");
		txtRate2.setHorizontalAlignment(SwingConstants.CENTER);
		txtRate2.setEditable(false);
		txtRate2.setColumns(10);
		txtRate2.setBounds(372, 394, 70, 30);
		contentPane.add(txtRate2);
		
		txtRate3 = new JTextField();
		txtRate3.setText("평점");
		txtRate3.setHorizontalAlignment(SwingConstants.CENTER);
		txtRate3.setEditable(false);
		txtRate3.setColumns(10);
		txtRate3.setBounds(702, 394, 70, 30);
		contentPane.add(txtRate3);
		
		txtTicketRate1 = new JTextField();
		txtTicketRate1.setText("예매율");
		txtTicketRate1.setHorizontalAlignment(SwingConstants.CENTER);
		txtTicketRate1.setEditable(false);
		txtTicketRate1.setColumns(10);
		txtTicketRate1.setBounds(180, 394, 70, 30);
		contentPane.add(txtTicketRate1);
		
		txtTicketRate2 = new JTextField();
		txtTicketRate2.setText("예매율");
		txtTicketRate2.setHorizontalAlignment(SwingConstants.CENTER);
		txtTicketRate2.setEditable(false);
		txtTicketRate2.setColumns(10);
		txtTicketRate2.setBounds(452, 394, 70, 30);
		contentPane.add(txtTicketRate2);
		
		txtTicketRate3 = new JTextField();
		txtTicketRate3.setText("예매율");
		txtTicketRate3.setHorizontalAlignment(SwingConstants.CENTER);
		txtTicketRate3.setEditable(false);
		txtTicketRate3.setColumns(10);
		txtTicketRate3.setBounds(782, 394, 70, 30);
		contentPane.add(txtTicketRate3);
		
		JButton btnMarket = new JButton("상점");
		
		btnMarket.setBounds(815, 14, 60, 30);
		contentPane.add(btnMarket);
		
		btnMarket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				market = new Market();
				market.setVisible(true);
				dispose();
			}
		});
	}
}
