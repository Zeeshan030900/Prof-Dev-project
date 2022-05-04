import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
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
		
		TitleText();
		Username();
		Password();
		Login();
		frame.getContentPane().setBackground(Color.white);
		frame.setSize(600,400);
		frame.setVisible(true);
	}
	
	public Component TitleText() {
		JLabel label1 = new JLabel();
		label1.setText("What Should I Watch");
		label1.setFont(new Font("Courier", Font.BOLD,17));
		label1.setBounds(160, 40, 270, 50);
		label1.setHorizontalTextPosition(JLabel.LEFT);
		label1.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204,204,204)));
		label1.setForeground(new Color(64,64,64));
		Image img = icon.getImage();
		Image imgS = img.getScaledInstance(60, 40, Image.SCALE_SMOOTH);
		ImageIcon scaledIcon = new ImageIcon(imgS);
		label1.setIcon(scaledIcon);
		label1.setIconTextGap(20);
		
		frame.add(label1);
		return frame;
	}
	
	public Component Username() {
		JLabel label1 = new JLabel();
		label1.setText("Username:");
		label1.setBounds(150,120,250,50);
		label1.setForeground(new Color(64,64,64));
		label1.setFont(new Font("Courier",Font.PLAIN,14));
		
		jtf1 = new JTextField();
		jtf1.setBounds(240,138,190,17);
		
		frame.add(label1);
		frame.add(jtf1);
		return frame;
	}
	
	public Component Password() {
		JLabel label1 = new JLabel();
		label1.setText("Password:");
		label1.setBounds(150,160,250,50);
		label1.setForeground(new Color(64,64,64));
		label1.setFont(new Font("Courier",Font.PLAIN,14));
		
		jtf2 = new JPasswordField();
		jtf2.setBounds(240,178,190,17);
		
		frame.add(label1);
		frame.add(jtf2);
		return frame;
	}
	
	public Component Login() {
		JButton button = new JButton("Login");
		button.setBounds(240, 225, 100, 25);
		button.setBackground(Color.red);
		button.setForeground(Color.white);
		button.setFont(new Font("Courier",Font.BOLD, 12));
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
