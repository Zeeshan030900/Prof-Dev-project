import java.awt.Component;
import java.util.ArrayList;

import javax.swing.*;


public class MovieListFrame {
	ArrayList<Movie> list;
	ImageIcon icon = new ImageIcon("logo.png");
	JFrame frame = new JFrame();
	MovieListFrame(ArrayList<Movie> list){
		this.list = list;
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setIconImage(icon.getImage());
		frame.setTitle("What Should I Watch");
		frame.setResizable(false);
		frame.setSize(600,400);
		frame.setVisible(true);
		displayList();
	}
	public Component displayList() {
		JScrollPane scroll = new JScrollPane();
		frame.add(scroll);
		JTextArea textArea = new JTextArea();
		textArea.setAlignmentX(JTextArea.CENTER_ALIGNMENT);
		String buffer = "\nWe recommend these ten movies for you:\n";
		for(int i=0; i<list.size(); i++) {
			buffer+= list.get(i).toString()+ "\n";
		}
		textArea.setText(buffer);
		frame.add(textArea);
		return frame;
	}
}
