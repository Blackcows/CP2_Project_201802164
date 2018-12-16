package program_screen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.SwingConstants;

import Movie.Movie;

public class MovieInfor extends JFrame {

	private JPanel contentPane;
	private final JTextField txtTitle;
	private final JTextField txtReleaseDate;
	private final JTextField txtCategory;
	private final JTextField txtRun_Time;
	private final JTextField txtGrade;
	private final JButton btnTicket = new JButton("예매");
	private final JLabel lblReleaseDate = new JLabel("개봉일");
	private final JLabel lblCategory = new JLabel("카테고리");
	private final JLabel lblRun_Time = new JLabel("상영시간");
	private final JLabel lblGrade = new JLabel("등급");

	private Reservation_Movie reservation_Movie;
	private JTextField txtEngTitle;
	private JTextField txtDirector;
	private JTextField txtRate;
	private JLabel lblMin;

	private BufferedImage image = MainScreen.image;

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

		JPanel imagePanel = new JPanel() {
			@Override
			public void paint(Graphics g) {
				g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), null);
			}
		};
		imagePanel.setBounds(47, 83, 200, 250);
		contentPane.add(imagePanel);
		imagePanel.setLayout(null);

		txtTitle = new JTextField(MainScreen.MovieTitle);
		txtTitle.setEditable(false);
		txtTitle.setBounds(301, 55, 328, 30);
		contentPane.add(txtTitle);

		txtEngTitle = new JTextField(MainScreen.MovieEngtitle);
		txtEngTitle.setEditable(false);
		txtEngTitle.setBounds(301, 96, 328, 30);
		contentPane.add(txtEngTitle);

		lblReleaseDate.setBounds(301, 211, 70, 30);
		contentPane.add(lblReleaseDate);

		txtReleaseDate = new JTextField(MainScreen.MovieReleaseDate);
		txtReleaseDate.setEditable(false);
		txtReleaseDate.setBounds(431, 212, 150, 30);
		contentPane.add(txtReleaseDate);

		lblCategory.setBounds(301, 136, 70, 30);
		contentPane.add(lblCategory);

		txtCategory = new JTextField(MainScreen.MovieCategory);
		txtCategory.setEditable(false);
		txtCategory.setBounds(431, 137, 328, 30);
		contentPane.add(txtCategory);

		lblRun_Time.setBounds(301, 251, 70, 30);
		contentPane.add(lblRun_Time);

		txtRun_Time = new JTextField(MainScreen.MovieRuntime);
		txtRun_Time.setEditable(false);
		txtRun_Time.setBounds(431, 252, 70, 30);
		contentPane.add(txtRun_Time);

		lblMin = new JLabel("min");
		lblMin.setFont(new Font("굴림", Font.PLAIN, 14));
		lblMin.setBounds(513, 252, 52, 29);
		contentPane.add(lblMin);

		lblGrade.setBounds(301, 291, 70, 30);
		contentPane.add(lblGrade);

		txtGrade = new JTextField(MainScreen.MovieRange);
		txtGrade.setEditable(false);
		txtGrade.setBounds(431, 292, 150, 30);
		contentPane.add(txtGrade);

		JLabel lblDirector = new JLabel("감독: ");
		lblDirector.setBounds(301, 171, 70, 30);
		contentPane.add(lblDirector);

		txtDirector = new JTextField(MainScreen.MovieDirector);
		txtDirector.setEditable(false);
		txtDirector.setBounds(431, 172, 150, 30);
		contentPane.add(txtDirector);

		JLabel lblRate = new JLabel("평점: ");
		lblRate.setFont(new Font("굴림", Font.PLAIN, 15));
		lblRate.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRate.setBounds(53, 355, 70, 30);
		contentPane.add(lblRate);

		txtRate = new JTextField(MainScreen.MovieRating);
		txtRate.setFont(new Font("굴림", Font.PLAIN, 16));
		txtRate.setHorizontalAlignment(SwingConstants.CENTER);
		txtRate.setEditable(false);
		txtRate.setBounds(136, 355, 110, 30);
		contentPane.add(txtRate);

		btnTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reservation_Movie = new Reservation_Movie();
				reservation_Movie.setVisible(true);
				dispose();
			}
		});
		btnTicket.setBounds(405, 368, 135, 44);
		contentPane.add(btnTicket);
	}
}
