package program_screen;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

public class Reservation_Seat extends JFrame {

	private JPanel contentPane;
	private JTextField txtwon;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reservation_Seat frame = new Reservation_Seat();
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
	public Reservation_Seat() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 500);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(66, 101, 80, 159);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(5, 2, 5, 5));
		
		JButton btnNewButton = new JButton("");
		panel.add(btnNewButton);
		
		JButton button_11 = new JButton("");
		panel.add(button_11);
		
		JButton button_8 = new JButton("");
		panel.add(button_8);
		
		JButton button_7 = new JButton("");
		panel.add(button_7);
		
		JButton button_3 = new JButton("");
		panel.add(button_3);
		
		JButton button_10 = new JButton("");
		panel.add(button_10);
		
		JButton button_2 = new JButton("");
		panel.add(button_2);
		
		JButton button_4 = new JButton("");
		panel.add(button_4);
		
		JButton button_6 = new JButton("");
		panel.add(button_6);
		
		JButton button_12 = new JButton("");
		panel.add(button_12);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(66, 295, 80, 131);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(4, 2, 5, 5));
		
		JButton button_15 = new JButton("");
		panel_1.add(button_15);
		
		JButton button_16 = new JButton("");
		panel_1.add(button_16);
		
		JButton button_19 = new JButton("");
		panel_1.add(button_19);
		
		JButton button_20 = new JButton("");
		panel_1.add(button_20);
		
		JButton button_23 = new JButton("");
		panel_1.add(button_23);
		
		JButton button_24 = new JButton("");
		panel_1.add(button_24);
		
		JButton button_27 = new JButton("");
		panel_1.add(button_27);
		
		JButton button_28 = new JButton("");
		panel_1.add(button_28);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(737, 101, 80, 159);
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(5, 2, 5, 5));
		
		JButton button_31 = new JButton("");
		panel_2.add(button_31);
		
		JButton button_32 = new JButton("");
		panel_2.add(button_32);
		
		JButton button_33 = new JButton("");
		panel_2.add(button_33);
		
		JButton button_34 = new JButton("");
		panel_2.add(button_34);
		
		JButton button_35 = new JButton("");
		panel_2.add(button_35);
		
		JButton button_36 = new JButton("");
		panel_2.add(button_36);
		
		JButton button_39 = new JButton("");
		panel_2.add(button_39);
		
		JButton button_40 = new JButton("");
		panel_2.add(button_40);
		
		JButton button_43 = new JButton("");
		panel_2.add(button_43);
		
		JButton button_44 = new JButton("");
		panel_2.add(button_44);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(191, 101, 502, 159);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JButton button_64 = new JButton("");
		button_64.setBounds(46, 2, 41, 27);
		panel_4.add(button_64);
		
		JButton button_65 = new JButton("");
		button_65.setBounds(92, 2, 41, 27);
		panel_4.add(button_65);
		
		JButton button_66 = new JButton("");
		button_66.setBounds(138, 2, 41, 27);
		panel_4.add(button_66);
		
		JButton button_67 = new JButton("");
		button_67.setBounds(184, 2, 41, 27);
		panel_4.add(button_67);
		
		JButton button_68 = new JButton("");
		button_68.setBounds(230, 2, 41, 27);
		panel_4.add(button_68);
		
		JButton button_69 = new JButton("");
		button_69.setBounds(276, 2, 41, 27);
		panel_4.add(button_69);
		
		JButton button_70 = new JButton("");
		button_70.setBounds(322, 2, 41, 27);
		panel_4.add(button_70);
		
		JButton button_71 = new JButton("");
		button_71.setBounds(368, 2, 41, 27);
		panel_4.add(button_71);
		
		JButton button_72 = new JButton("");
		button_72.setBounds(414, 2, 41, 27);
		panel_4.add(button_72);
		
		JButton button_73 = new JButton("");
		button_73.setBounds(460, 2, 41, 27);
		panel_4.add(button_73);
		
		JButton button_17 = new JButton("");
		button_17.setBounds(0, 34, 41, 27);
		panel_4.add(button_17);
		
		JButton button_74 = new JButton("");
		button_74.setBounds(46, 34, 41, 27);
		panel_4.add(button_74);
		
		JButton button_75 = new JButton("");
		button_75.setBounds(92, 34, 41, 27);
		panel_4.add(button_75);
		
		JButton button_76 = new JButton("");
		button_76.setBounds(138, 34, 41, 27);
		panel_4.add(button_76);
		
		JButton button_77 = new JButton("");
		button_77.setBounds(184, 34, 41, 27);
		panel_4.add(button_77);
		
		JButton button = new JButton("");
		button.setBounds(230, 34, 41, 27);
		panel_4.add(button);
		
		JButton button_21 = new JButton("");
		button_21.setBounds(276, 34, 41, 27);
		panel_4.add(button_21);
		
		JButton button_18 = new JButton("");
		button_18.setBounds(322, 34, 41, 27);
		panel_4.add(button_18);
		
		JButton button_78 = new JButton("");
		button_78.setBounds(368, 34, 41, 27);
		panel_4.add(button_78);
		
		JButton button_5 = new JButton("");
		button_5.setBounds(414, 34, 41, 27);
		panel_4.add(button_5);
		
		JButton button_1 = new JButton("");
		button_1.setBounds(460, 34, 41, 27);
		panel_4.add(button_1);
		
		JButton button_13 = new JButton("");
		button_13.setBounds(0, 66, 41, 27);
		panel_4.add(button_13);
		
		JButton button_9 = new JButton("");
		button_9.setBounds(46, 66, 41, 27);
		panel_4.add(button_9);
		
		JButton button_14 = new JButton("");
		button_14.setBounds(92, 66, 41, 27);
		panel_4.add(button_14);
		
		JButton button_22 = new JButton("");
		button_22.setBounds(138, 66, 41, 27);
		panel_4.add(button_22);
		
		JButton button_25 = new JButton("");
		button_25.setBounds(184, 66, 41, 27);
		panel_4.add(button_25);
		
		JButton button_46 = new JButton("");
		button_46.setBounds(230, 66, 41, 27);
		panel_4.add(button_46);
		
		JButton button_26 = new JButton("");
		button_26.setBounds(276, 66, 41, 27);
		panel_4.add(button_26);
		
		JButton button_29 = new JButton("");
		button_29.setBounds(322, 66, 41, 27);
		panel_4.add(button_29);
		
		JButton button_30 = new JButton("");
		button_30.setBounds(368, 66, 41, 27);
		panel_4.add(button_30);
		
		JButton button_47 = new JButton("");
		button_47.setBounds(414, 66, 41, 27);
		panel_4.add(button_47);
		
		JButton button_37 = new JButton("");
		button_37.setBounds(460, 66, 41, 27);
		panel_4.add(button_37);
		
		JButton button_38 = new JButton("");
		button_38.setBounds(0, 98, 41, 27);
		panel_4.add(button_38);
		
		JButton button_41 = new JButton("");
		button_41.setBounds(46, 98, 41, 27);
		panel_4.add(button_41);
		
		JButton button_42 = new JButton("");
		button_42.setBounds(92, 98, 41, 27);
		panel_4.add(button_42);
		
		JButton button_45 = new JButton("");
		button_45.setBounds(138, 98, 41, 27);
		panel_4.add(button_45);
		
		JButton button_48 = new JButton("");
		button_48.setBounds(184, 98, 41, 27);
		panel_4.add(button_48);
		
		JButton button_51 = new JButton("");
		button_51.setBounds(230, 98, 41, 27);
		panel_4.add(button_51);
		
		JButton button_49 = new JButton("");
		button_49.setBounds(276, 98, 41, 27);
		panel_4.add(button_49);
		
		JButton button_50 = new JButton("");
		button_50.setBounds(322, 98, 41, 27);
		panel_4.add(button_50);
		
		JButton button_52 = new JButton("");
		button_52.setBounds(368, 98, 41, 27);
		panel_4.add(button_52);
		
		JButton button_53 = new JButton("");
		button_53.setBounds(414, 98, 41, 27);
		panel_4.add(button_53);
		
		JButton button_54 = new JButton("");
		button_54.setBounds(460, 98, 41, 27);
		panel_4.add(button_54);
		
		JButton button_55 = new JButton("");
		button_55.setBounds(0, 130, 41, 27);
		panel_4.add(button_55);
		
		JButton button_56 = new JButton("");
		button_56.setBounds(46, 130, 41, 27);
		panel_4.add(button_56);
		
		JButton button_57 = new JButton("");
		button_57.setBounds(92, 130, 41, 27);
		panel_4.add(button_57);
		
		JButton button_58 = new JButton("");
		button_58.setBounds(138, 130, 41, 27);
		panel_4.add(button_58);
		
		JButton button_59 = new JButton("");
		button_59.setBounds(184, 130, 41, 27);
		panel_4.add(button_59);
		
		JButton button_60 = new JButton("");
		button_60.setBounds(230, 130, 41, 27);
		panel_4.add(button_60);
		
		JButton button_61 = new JButton("");
		button_61.setBounds(276, 130, 41, 27);
		panel_4.add(button_61);
		
		JButton button_62 = new JButton("");
		button_62.setBounds(322, 130, 41, 27);
		panel_4.add(button_62);
		
		JButton button_95 = new JButton("");
		button_95.setBounds(368, 130, 41, 27);
		panel_4.add(button_95);
		
		JButton button_96 = new JButton("");
		button_96.setBounds(414, 130, 41, 27);
		panel_4.add(button_96);
		
		JButton button_97 = new JButton("");
		button_97.setBounds(460, 130, 41, 27);
		panel_4.add(button_97);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(191, 295, 502, 131);
		contentPane.add(panel_3);
		panel_3.setLayout(new GridLayout(4, 11, 5, 5));
		
		JButton button_79 = new JButton("");
		panel_3.add(button_79);
		
		JButton button_80 = new JButton("");
		panel_3.add(button_80);
		
		JButton button_81 = new JButton("");
		panel_3.add(button_81);
		
		JButton button_82 = new JButton("");
		panel_3.add(button_82);
		
		JButton button_83 = new JButton("");
		panel_3.add(button_83);
		
		JButton button_84 = new JButton("");
		panel_3.add(button_84);
		
		JButton button_85 = new JButton("");
		panel_3.add(button_85);
		
		JButton button_86 = new JButton("");
		panel_3.add(button_86);
		
		JButton button_87 = new JButton("");
		panel_3.add(button_87);
		
		JButton button_88 = new JButton("");
		panel_3.add(button_88);
		
		JButton button_89 = new JButton("");
		panel_3.add(button_89);
		
		JButton button_90 = new JButton("");
		panel_3.add(button_90);
		
		JButton button_91 = new JButton("");
		panel_3.add(button_91);
		
		JButton button_92 = new JButton("");
		panel_3.add(button_92);
		
		JButton button_93 = new JButton("");
		panel_3.add(button_93);
		
		JButton button_94 = new JButton("");
		panel_3.add(button_94);
		
		JButton button_98 = new JButton("");
		panel_3.add(button_98);
		
		JButton button_99 = new JButton("");
		panel_3.add(button_99);
		
		JButton button_100 = new JButton("");
		panel_3.add(button_100);
		
		JButton button_101 = new JButton("");
		panel_3.add(button_101);
		
		JButton button_102 = new JButton("");
		panel_3.add(button_102);
		
		JButton button_103 = new JButton("");
		panel_3.add(button_103);
		
		JButton button_104 = new JButton("");
		panel_3.add(button_104);
		
		JButton button_105 = new JButton("");
		panel_3.add(button_105);
		
		JButton button_106 = new JButton("");
		panel_3.add(button_106);
		
		JButton button_107 = new JButton("");
		panel_3.add(button_107);
		
		JButton button_108 = new JButton("");
		panel_3.add(button_108);
		
		JButton button_109 = new JButton("");
		panel_3.add(button_109);
		
		JButton button_110 = new JButton("");
		panel_3.add(button_110);
		
		JButton button_111 = new JButton("");
		panel_3.add(button_111);
		
		JButton button_112 = new JButton("");
		panel_3.add(button_112);
		
		JButton button_113 = new JButton("");
		panel_3.add(button_113);
		
		JButton button_114 = new JButton("");
		panel_3.add(button_114);
		
		JButton button_115 = new JButton("");
		panel_3.add(button_115);
		
		JButton button_116 = new JButton("");
		panel_3.add(button_116);
		
		JButton button_117 = new JButton("");
		panel_3.add(button_117);
		
		JButton button_118 = new JButton("");
		panel_3.add(button_118);
		
		JButton button_119 = new JButton("");
		panel_3.add(button_119);
		
		JButton button_120 = new JButton("");
		panel_3.add(button_120);
		
		JButton button_121 = new JButton("");
		panel_3.add(button_121);
		
		JButton button_122 = new JButton("");
		panel_3.add(button_122);
		
		JButton button_123 = new JButton("");
		panel_3.add(button_123);
		
		JButton button_124 = new JButton("");
		panel_3.add(button_124);
		
		JLabel lblNewLabel = new JLabel("\uC2A4\uD06C\uB9B0");
		lblNewLabel.setBackground(new Color(192, 192, 192));
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 962, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("A");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(18, 107, 36, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblB = new JLabel("B");
		lblB.setHorizontalAlignment(SwingConstants.CENTER);
		lblB.setBounds(18, 139, 36, 22);
		contentPane.add(lblB);
		
		JLabel lblC = new JLabel("C");
		lblC.setHorizontalAlignment(SwingConstants.CENTER);
		lblC.setBounds(18, 171, 36, 22);
		contentPane.add(lblC);
		
		JLabel lblD = new JLabel("D");
		lblD.setHorizontalAlignment(SwingConstants.CENTER);
		lblD.setBounds(18, 203, 36, 22);
		contentPane.add(lblD);
		
		JLabel lblE = new JLabel("E");
		lblE.setHorizontalAlignment(SwingConstants.CENTER);
		lblE.setBounds(18, 235, 36, 22);
		contentPane.add(lblE);
		
		JLabel lblF = new JLabel("F");
		lblF.setHorizontalAlignment(SwingConstants.CENTER);
		lblF.setBounds(18, 299, 36, 22);
		contentPane.add(lblF);
		
		JLabel lblG = new JLabel("G");
		lblG.setHorizontalAlignment(SwingConstants.CENTER);
		lblG.setBounds(18, 331, 36, 22);
		contentPane.add(lblG);
		
		JLabel lblH = new JLabel("H");
		lblH.setHorizontalAlignment(SwingConstants.CENTER);
		lblH.setBounds(18, 366, 36, 22);
		contentPane.add(lblH);
		
		JLabel lblI = new JLabel("I");
		lblI.setHorizontalAlignment(SwingConstants.CENTER);
		lblI.setBounds(18, 398, 36, 22);
		contentPane.add(lblI);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(717, 266, 257, 122);
		contentPane.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(238, 130, 238));
		panel_6.setBounds(701, 398, 273, 55);
		contentPane.add(panel_6);
		panel_6.setLayout(null);
		
		txtwon = new JTextField();
		txtwon.setEditable(false);
		txtwon.setBackground(new Color(238, 130, 238));
		txtwon.setForeground(new Color(255, 255, 255));
		txtwon.setHorizontalAlignment(SwingConstants.CENTER);
		txtwon.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		txtwon.setBounds(131, 10, 130, 35);
		txtwon.setText("(\uAE08\uC561 \uD544\uB4DC)");
		panel_6.add(txtwon);
		txtwon.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\uCD1D \uACB0\uC81C \uAE08\uC561 :");
		lblNewLabel_2.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(5, 10, 114, 35);
		panel_6.add(lblNewLabel_2);
	}
}
