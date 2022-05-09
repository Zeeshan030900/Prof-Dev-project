import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.*;

public class LoginPage {
	ImageIcon icon = new ImageIcon("logo.png");
	JFrame frame = new JFrame();
	HashMap<String,String> logininfo = new HashMap<>();
	JTextField jtf1;
	JPasswordField jtf2;
	JLabel messageLabel = new JLabel("");
	public LoginPage(HashMap<String, String> loginInfoOrignal) {
		this.logininfo = loginInfoOrignal;
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setIconImage(icon.getImage());
		frame.setTitle("What Should I Watch");
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
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
		
		jtf1 = new JTextField();
		jtf1.setBounds(270,138,190,17);
		
		frame.add(label1);
		frame.add(jtf1);
		return frame;
	}
	
	public Component Password() {
		JLabel label1 = new JLabel();
		label1.setText("Password:");
		label1.setBounds(200,160,250,50);
		
		jtf2 = new JPasswordField();
		jtf2.setBounds(270,178,190,17);
		
		frame.add(label1);
		frame.add(jtf2);
		return frame;
	}
	
	public Component Login() {
		JButton button = new JButton("Login");
		button.setBounds(225, 300, 100, 50);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String userID = jtf1.getText();
				String pass = String.valueOf(jtf2.getPassword());
				if(logininfo.containsKey(userID)) {
					if(logininfo.get(userID).equals(pass)) {
						new AddFilm();
						frame.dispose();
					}
					else {
						messageLabel.setText("");
						JOptionPane.showMessageDialog(null,"The Login details are Incorrect", "Incorrect",JOptionPane.ERROR_MESSAGE);
					}
				}
				else {
					messageLabel.setText("");
					JOptionPane.showMessageDialog(null,"The Login details are Incorrect", "Incorrect",JOptionPane.ERROR_MESSAGE);
				}
			}
			
		});
		frame.add(messageLabel);
		frame.add(button);
		return frame;
	}
	
}
