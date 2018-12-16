package program_screen;

import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.SwingConstants;

import Movie.Movie;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Random;

public class MainScreen extends JFrame {
	private JPanel contentPane;
	private JTextField txtTitle1, txtTitle2, txtTitle3;
	private JTextField txtRate1, txtRate2, txtRate3;
	private JTextField txtTicketRate1, txtTicketRate2, txtTicketRate3;
	private JPanel imagePanel1, imagePanel2, imagePanel3;

	private BufferedImage image1, image2, image3;
	static BufferedImage image;

	private MovieInfor movieInfor;
	private Market market;

	private ArrayList<Movie> movielist;
	private int index1, index2, index3;
	private Random generator = new Random();
	private String username = LoginFrame.UserName;

	static String MovieTitle, MovieEngtitle, MovieReleaseDate, MovieDirector, MovieRating, MovieRange, MovieCategory, MovieRuntime;


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


		readMovie();
		index1 = generator.nextInt(movielist.size());
		while(true) {
			index2 = generator.nextInt(movielist.size());
			if (index2 != index1)
				break;
		}
		while(true) {
			index3 = generator.nextInt(movielist.size());
			if(index3 != index1 && index3 != index2)
				break;
		}

		JLabel lblUser = new JLabel(username + " 님 환영합니다.");
		lblUser.setBounds(12, 10, 200, 30);
		contentPane.add(lblUser);

		JLabel lblTitle = new JLabel("오늘의 추천작을 만나보세요~!");
		lblTitle.setBounds(77, 44, 200, 30);
		contentPane.add(lblTitle);

		try {
			image1 = ImageIO.read(new File(movielist.get(index1).getFilename()));
		} catch (IOException e){
			e.printStackTrace();
			System.exit(0);
		}
		imagePanel1 = new JPanel() {
			@Override
			public void paint(Graphics g) {
				g.drawImage(image1, 0, 0, this.getWidth(), this.getHeight(), null);
			}
		};
		imagePanel1.setBounds(77, 90, 200, 250);
		contentPane.add(imagePanel1);
		imagePanel1.setLayout(null);

		try {
			image2 = ImageIO.read(new File(movielist.get(index2).getFilename()));
		} catch (IOException e){
			e.printStackTrace();
			System.exit(0);
		}
		imagePanel2 = new JPanel() {
			@Override
			public void paint(Graphics g) {
				g.drawImage(image2, 0, 0, this.getWidth(), this.getHeight(), null);
			}
		};
		imagePanel2.setLayout(null);
		imagePanel2.setBounds(346, 90, 200, 250);
		contentPane.add(imagePanel2);

		try {
			image3 = ImageIO.read(new File(movielist.get(index3).getFilename()));
		} catch (IOException e){
			e.printStackTrace();
			System.exit(0);
		}
		imagePanel3 = new JPanel() {
			@Override
			public void paint(Graphics g) {
				g.drawImage(image3, 0, 0, this.getWidth(), this.getHeight(), null);
			}
		};
		imagePanel3.setBounds(620, 90, 200, 250);
		contentPane.add(imagePanel3);
		imagePanel3.setLayout(null);

		txtTitle1 = new JTextField();
		txtTitle1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MovieCategory = movielist.get(index1).getCategory();
				MovieDirector = movielist.get(index1).getDirector();
				MovieEngtitle = movielist.get(index1).getEngtitle();
				MovieRange = movielist.get(index1).getRange();
				MovieRating = movielist.get(index1).getRating();
				MovieReleaseDate = movielist.get(index1).getReleasedate();
				MovieRuntime = movielist.get(index1).getRuntime();
				MovieTitle = movielist.get(index1).getTitle();
				image = image1;
				
				movieInfor = new MovieInfor();
				movieInfor.setVisible(true);
				dispose();
			}
		});
		txtTitle1.setHorizontalAlignment(SwingConstants.CENTER);
		txtTitle1.setText(movielist.get(index1).getTitle());
		txtTitle1.setEditable(false);
		txtTitle1.setBounds(77, 350, 200, 30);
		contentPane.add(txtTitle1);
		txtTitle1.setColumns(10);

		txtTitle2 = new JTextField();
		txtTitle2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MovieCategory = movielist.get(index2).getCategory();
				MovieDirector = movielist.get(index2).getDirector();
				MovieEngtitle = movielist.get(index2).getEngtitle();
				MovieRange = movielist.get(index2).getRange();
				MovieRating = movielist.get(index2).getRating();
				MovieReleaseDate = movielist.get(index2).getReleasedate();
				MovieRuntime = movielist.get(index2).getRuntime();
				MovieTitle = movielist.get(index2).getTitle();
				image = image2;
				
				movieInfor = new MovieInfor();
				movieInfor.setVisible(true);
				dispose();
			}
		});
		txtTitle2.setText(movielist.get(index2).getTitle());
		txtTitle2.setHorizontalAlignment(SwingConstants.CENTER);
		txtTitle2.setEditable(false);
		txtTitle2.setColumns(10);
		txtTitle2.setBounds(346, 350, 200, 30);
		contentPane.add(txtTitle2);

		txtTitle3 = new JTextField();
		txtTitle3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MovieCategory = movielist.get(index3).getCategory();
				MovieDirector = movielist.get(index3).getDirector();
				MovieEngtitle = movielist.get(index3).getEngtitle();
				MovieRange = movielist.get(index3).getRange();
				MovieRating = movielist.get(index3).getRating();
				MovieReleaseDate = movielist.get(index3).getReleasedate();
				MovieRuntime = movielist.get(index3).getRuntime();
				MovieTitle = movielist.get(index3).getTitle();
				image = image3;
				
				movieInfor = new MovieInfor();
				movieInfor.setVisible(true);
				dispose();
			}
		});
		txtTitle3.setText(movielist.get(index3).getTitle());
		txtTitle3.setHorizontalAlignment(SwingConstants.CENTER);
		txtTitle3.setEditable(false);
		txtTitle3.setColumns(10);
		txtTitle3.setBounds(620, 350, 200, 30);
		contentPane.add(txtTitle3);

		txtRate1 = new JTextField();
		txtRate1.setText(movielist.get(index1).getRating());
		txtRate1.setHorizontalAlignment(SwingConstants.CENTER);
		txtRate1.setEditable(false);
		txtRate1.setColumns(10);
		txtRate1.setBounds(100, 394, 70, 30);
		contentPane.add(txtRate1);

		txtRate2 = new JTextField();
		txtRate2.setText(movielist.get(index2).getRating());
		txtRate2.setHorizontalAlignment(SwingConstants.CENTER);
		txtRate2.setEditable(false);
		txtRate2.setColumns(10);
		txtRate2.setBounds(372, 394, 70, 30);
		contentPane.add(txtRate2);

		txtRate3 = new JTextField();
		txtRate3.setText(movielist.get(index3).getRating());
		txtRate3.setHorizontalAlignment(SwingConstants.CENTER);
		txtRate3.setEditable(false);
		txtRate3.setColumns(10);
		txtRate3.setBounds(646, 394, 70, 30);
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
		txtTicketRate3.setBounds(726, 394, 70, 30);
		contentPane.add(txtTicketRate3);

		JButton btnMarket = new JButton("상점");

		btnMarket.setBounds(747, 20, 60, 30);
		contentPane.add(btnMarket);

		JButton btnMyPage = new JButton("마이 페이지");
		btnMyPage.setBounds(819, 20, 131, 30);
		contentPane.add(btnMyPage);

		btnMarket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				market = new Market();
				market.setVisible(true);
				dispose();
			}
		});

		btnMyPage.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "준비중입니다.");
			}
		});
	}

	public void readMovie() {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("MovieObject.dat")); // object.dat 에 연결된 (리스트)객체 입력 스트림 생성
			movielist = (ArrayList<Movie>) ois.readObject(); // 읽어온 리스트 객체를 list 변수에 지정
		} catch (IOException e) {
			movielist = new ArrayList<>();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
