import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.*;

public class LoginFrame {
	ImageIcon icon = new ImageIcon("logo.png");
	JFrame frame = new JFrame();
	
	public LoginFrame() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(icon.getImage());
		frame.setTitle("What Should I Watch");
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setSize(600,400);
		frame.setVisible(true);
		TitleText();
		Username();
		Password();
		Login();
	}
	
	public Component TitleText() {
		JLabel label1 = new JLabel();
		label1.setText("What Should I Watch");
		label1.setFont(new Font("Courier", Font.BOLD,12));
		label1.setBounds(225, 0, 250, 50);

		frame.add(label1);
		return frame;
	}
	
	public Component Username() {
		JLabel label1 = new JLabel();
		label1.setText("Username:");
		label1.setBounds(200,120,250,50);
		
		JTextArea jta1 = new JTextArea();
		jta1.setBounds(270,138,190,17);
		
		frame.add(label1);
		frame.add(jta1);
		return frame;
	}
	
	public Component Password() {
		JLabel label1 = new JLabel();
		label1.setText("Password:");
		label1.setBounds(200,160,250,50);
		
		JTextArea jta1 = new JTextArea();
		jta1.setBounds(270,178,190,17);
		
		frame.add(label1);
		frame.add(jta1);
		return frame;
	}
	
	public Component Login() {
		JButton button = new JButton("Login");
		button.setBounds(225, 300, 100, 50);
		
		frame.add(button);
		return frame;
	}
	
}
