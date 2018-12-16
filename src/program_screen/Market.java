package program_screen;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Market extends JFrame {

	private JPanel contentPane;
	
	private MainScreen mainScreen;
	
	private BufferedImage popcornImage, cokeImage, nachoImage; 

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
		
		JLabel lblUser = new JLabel(LoginFrame.UserName +" \uB2D8 \uD658\uC601\uD569\uB2C8\uB2E4");
		lblUser.setBounds(12, 10, 200, 30);
		contentPane.add(lblUser);
		
		JLabel lblTitle = new JLabel("-\uC0C1\uC810-");
		lblTitle.setToolTipText("");
		lblTitle.setBounds(77, 44, 200, 30);
		contentPane.add(lblTitle);
		
		try {
			popcornImage = ImageIO.read(new File("popcorn.jpg"));
		} catch (IOException e){
			e.printStackTrace();
			System.exit(0);
		}
		
		JPanel imagePanel1 = new JPanel() {
			@Override
			public void paint(Graphics g) {
				g.drawImage(popcornImage, 0, 0, this.getWidth(), this.getHeight(), null);
			}
		};
		imagePanel1.setBounds(77, 90, 200, 250);
		contentPane.add(imagePanel1);
		imagePanel1.setLayout(null);
		
		try {
			cokeImage = ImageIO.read(new File("coke.jpg"));
		} catch (IOException e){
			e.printStackTrace();
			System.exit(0);
		}
		
		JPanel imagePanel2 = new JPanel() {
			@Override
			public void paint(Graphics g) {
				g.drawImage(cokeImage, 0, 0, this.getWidth(), this.getHeight(), null);
			}
		};
		imagePanel2.setBounds(372, 90, 200, 250);
		contentPane.add(imagePanel2);
		imagePanel2.setLayout(null);
		
		try {
			nachoImage = ImageIO.read(new File("nacho.jpg"));
		} catch (IOException e){
			e.printStackTrace();
			System.exit(0);
		}
		
		JPanel imagePanel3 = new JPanel() {
			@Override
			public void paint(Graphics g) {
				g.drawImage(nachoImage, 0, 0, this.getWidth(), this.getHeight(), null);
			}
		};
		imagePanel3.setBounds(678, 90, 200, 250);
		contentPane.add(imagePanel3);
		imagePanel3.setLayout(null);
		
		JLabel lblName1 = new JLabel("ÆËÄÜ");
		lblName1.setHorizontalAlignment(SwingConstants.CENTER);
		lblName1.setBounds(100, 350, 150, 30);
		contentPane.add(lblName1);
		
		JLabel lblName2 = new JLabel("ÄÝ¶ó");
		lblName2.setHorizontalAlignment(SwingConstants.CENTER);
		lblName2.setBounds(399, 350, 150, 30);
		contentPane.add(lblName2);
		
		JLabel lblName3 = new JLabel("³ªÃÝ");
		lblName3.setHorizontalAlignment(SwingConstants.CENTER);
		lblName3.setBounds(702, 350, 150, 30);
		contentPane.add(lblName3);
		
		JLabel lblPrice1 = new JLabel("10,000");
		lblPrice1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrice1.setBounds(100, 394, 150, 30);
		contentPane.add(lblPrice1);
		
		JLabel lblPrice2 = new JLabel("3,000");
		lblPrice2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrice2.setBounds(399, 394, 150, 30);
		contentPane.add(lblPrice2);
		
		JLabel lblPrice3 = new JLabel("2,500");
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
