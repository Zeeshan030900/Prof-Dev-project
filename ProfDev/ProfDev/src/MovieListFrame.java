
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.*;


public class MovieListFrame {
	ArrayList<Movie> list;
	ImageIcon icon = new ImageIcon("logo.png");
	JFrame frame = new JFrame();
	MovieListFrame(ArrayList<Movie> list){
		this.list = list;
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setIconImage(icon.getImage());
		frame.setTitle("What Should I Watch");
		frame.setResizable(false);
		frame.setLayout(null);
		Title();
		displayList();
		frame.setSize(1000,500);
		frame.getContentPane().setBackground(Color.white);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
	public Component displayList() {
		JTextArea textArea = new JTextArea();
		//textArea.setAlignmentX(JTextArea.CENTER_ALIGNMENT);
		String buffer = "\nWe recommend these movies for you:\n";
		for(int i=0; i<list.size(); i++) {
			buffer+= list.get(i).toString()+ "\n";
		}
		textArea.setFont(new Font("Courier", Font.PLAIN,16));
		textArea.setForeground(new Color(64,64,64));
		textArea.setText(buffer);
		textArea.setBackground(Color.white);
		textArea.setBounds(0, 50, 1000, 600);
		frame.add(textArea);
		return frame;
	}
	public Component Title() {
		JLabel label1 = new JLabel();
		label1.setText("What Should I Watch?");
		label1.setFont(new Font("Courier", Font.BOLD,17));
		label1.setBounds(160, 10, 280, 50);
		label1.setHorizontalTextPosition(JLabel.LEFT);
		label1.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204,204,0)));
		label1.setForeground(new Color(64,64,64));
		Image img = icon.getImage();
		Image imgS = img.getScaledInstance(60, 40, Image.SCALE_SMOOTH);
		ImageIcon scaledIcon = new ImageIcon(imgS);
		label1.setIcon(scaledIcon);
		label1.setIconTextGap(20);
		frame.add(label1);
		return frame;
	}
}
