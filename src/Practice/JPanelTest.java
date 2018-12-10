package Practice;

import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.attribute.standard.MediaName;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class JPanel01 extends JPanel{
	private JButton jButton1;
	private JScrollPane jScrollPane1;
	private JTextArea jTextArea1;
	private JPanelTest win;
	
	public JPanel01(JPanelTest win) {
		// TODO Auto-generated constructor stub
		this.win = win;
		setLayout(null);
		
		jButton1 = new JButton("��ư");
		jButton1.setSize(70, 20);
		jButton1.setLocation(10, 10);
		add(jButton1);
		
		jTextArea1 = new JTextArea();
		
		jScrollPane1 = new JScrollPane(jTextArea1);
		jScrollPane1.setSize(200, 150);
		jScrollPane1.setLocation(10, 40);
		add(jScrollPane1);
		
		jButton1.addActionListener(new MyActionListener());
	}
	class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			win.change("panel02");
		}
	}
}

class JPanel02 extends JPanel{
	private JTextField textField;
	private JPasswordField passwordField;
	private JPanelTest win;
	
	public JPanel02(JPanelTest win) {
		// TODO Auto-generated constructor stub
		setLayout(null);
		this.win = win;
		JLabel label = new JLabel("���̵�");
		label.setBounds(31, 40, 67, 15);
		add(label);
		
		textField = new JTextField();
		textField.setBounds(123, 40, 116, 21);
		add(textField);
		textField.setColumns(10);
		
		JLabel label2 = new JLabel("��ȣ");
		label2.setBounds(31, 84, 67, 15);
		add(label2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(123, 84, 116, 21);
		add(passwordField);
		
		JButton button = new JButton("��ư");
		button.setSize(70, 20);
		button.setLocation(10, 10);
		add(button);
		button.addActionListener(new MyActionListener());
	}
	
	class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			win.change("panel01");
		}
	}
}

public class JPanelTest extends JFrame {
	public JPanel01 jPanel01 = null;
	public JPanel02 jPanel02 = null;
	
	public void change(String panelName) {
		if (panelName.equals("panel01")) {
			getContentPane().removeAll();
			getContentPane().add(jPanel01);
			revalidate();
			repaint();
		}
		else {
			getContentPane().removeAll();
			getContentPane().add(jPanel02);
			revalidate();
			repaint();
		}
	}
	
	public static void main(String[] args) {
		JPanelTest win = new JPanelTest();
		
		win.setTitle("frame test");
		win.jPanel01 = new JPanel01(win);
		win.jPanel02 = new JPanel02(win);
		
		win.add(win.jPanel01);
		win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		win.setSize(500, 700);
		win.setVisible(true);
	}
}
