
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class Frame {
	Person person = new Person("");
	DB db = new DB();
	JFrame frame = new JFrame();
	ImageIcon icon = new ImageIcon("logo.png");
	public Frame() {
		
	//	frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(icon.getImage());
		frame.setTitle("What Should I Watch");
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		TitleText();
		horrorSect();
		comedySect();
		fantasySect();
		actionSect();
		sciFiSect();
		login();
		submit();
		frame.setBounds(0,0,600,600);
		frame.setVisible(true);
		frame.setResizable(false);
	}
	
	public Component TitleText() {
		JLabel label1 = new JLabel();
		label1.setText("What Should I Watch");
		label1.setFont(new Font("Courier", Font.BOLD,16));
		label1.setBounds(175, 0, 250, 50);
		JLabel label2 = new JLabel();
		label2.setText("What is your preference for the following genres:");
		label2.setBounds(10, 30, 280, 55);
		
		JLabel label3 = new JLabel("Hate");
		label3.setBounds(100,70,75,50);
		JLabel label4 = new JLabel();
		label4.setText("Really Dislike");
		label4.setBounds(150,70,75,50);
		JLabel label5 = new JLabel();
		label5.setText("Dislike");
		label5.setBounds(250,70,75,50);
		JLabel label6 = new JLabel();
		label6.setText("Decent");
		label6.setBounds(320,70,75,50);
		JLabel label7 = new JLabel();
		label7.setText("Like");
		label7.setBounds(405,70,75,50);
		JLabel label8 = new JLabel();
		label8.setText("Really like");
		label8.setBounds(470,70,75,50);
		
		frame.add(label1);
		frame.add(label2);
		frame.add(label3);
		frame.add(label4);
		frame.add(label5);
		frame.add(label6);
		frame.add(label7);
		frame.add(label8);
		return frame;
	}
	public Component horrorSect() {
		JLabel label = new JLabel();
		label.setText("Horror:");
		label.setBounds(0,20,100,50);
		
		JRadioButton b0 = new JRadioButton();
		b0.setBounds(95,20,25,50);
		b0.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b0) {
					person.setAction(0);
				}
			}
		
		});
		JRadioButton b1 = new JRadioButton();
		b1.setBounds(170,20,25,50);
		b1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b1) {
					person.setHorror(1);
				}
			}
		
		});
		JRadioButton b2 = new JRadioButton();
		b2.setBounds(245, 20, 25, 50);
		b2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b2) {
					person.setHorror(2);
				}
			}
		
		});
		JRadioButton b3 = new JRadioButton();
		b3.setBounds(315, 20, 25, 50);
		b3.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b3) {
					person.setHorror(3);
				}
			}
		
		});
		JRadioButton b4 = new JRadioButton();
		b4.setBounds(395, 20, 25, 50);
		b4.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b4) {
					person.setHorror(4);
				}
			}
		
		});
		JRadioButton b5 = new JRadioButton();
		b5.setBounds(474, 20, 25, 50);
		b5.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b5) {
					person.setHorror(5);
				}
			}
		
		});
		ButtonGroup group = new ButtonGroup();
		group.add(b0);
		group.add(b1);
		group.add(b2);
		group.add(b3);
		group.add(b4);
		group.add(b5);
		JPanel panel = new JPanel(null);
		panel.add(label, FlowLayout.LEFT);
		panel.add(b0);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.setBounds(10, 90, 600, 60);
		panel.setVisible(true);
		frame.add(panel);
		return frame;
	}
	public Component comedySect() {
		JLabel label = new JLabel("Comedy:");
		label.setBounds(0,20,100,50);
		
		JRadioButton b0 = new JRadioButton();
		b0.setBounds(95,20,25,50);
		b0.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b0) {
					person.setAction(0);
				}
			}
		
		});
		
		JRadioButton b1 = new JRadioButton();
		b1.setBounds(170,20,25,50);
		b1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b1) {
					person.setComedy(1);
				}
			}
		
		});
		JRadioButton b2 = new JRadioButton();
		b2.setBounds(245, 20, 25, 50);
		b2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b2) {
					person.setComedy(2);
				}
			}
		
		});
		JRadioButton b3 = new JRadioButton();
		b3.setBounds(315, 20, 25, 50);
		b3.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b3) {
					person.setComedy(3);
				}
			}
		
		});
		JRadioButton b4 = new JRadioButton();
		b4.setBounds(395, 20, 25, 50);
		b4.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b4) {
					person.setComedy(4);
				}
			}
		
		});
		JRadioButton b5 = new JRadioButton();
		b5.setBounds(474, 20, 25, 50);
		b5.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b5) {
					person.setComedy(5);
				}
			}
		
		});
		ButtonGroup group = new ButtonGroup();
		group.add(b0);
		group.add(b1);
		group.add(b2);
		group.add(b3);
		group.add(b4);
		group.add(b5);
		
		JPanel panel = new JPanel(null);
		panel.add(label, FlowLayout.LEFT);
		panel.add(b0);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.setBounds(10, 140, 600, 60);
		panel.setVisible(true);
		frame.add(panel);
		return frame;
	}
	public Component fantasySect() {
		JLabel label = new JLabel("Fantasy:");
		label.setBounds(0,20,100,50);
		JRadioButton b0 = new JRadioButton();
		b0.setBounds(95,20,25,50);
		b0.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b0) {
					person.setAction(0);
				}
			}
		
		});
		
		JRadioButton b1 = new JRadioButton();
		b1.setBounds(170,20,25,50);
		b1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b1) {
					person.setFantasy(1);
				}
			}
		
		});
		JRadioButton b2 = new JRadioButton();
		b2.setBounds(245, 20, 25, 50);
		b2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b2) {
					person.setFantasy(2);
				}
			}
		
		});
		JRadioButton b3 = new JRadioButton();
		b3.setBounds(315, 20, 25, 50);
		b3.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b3) {
					person.setFantasy(3);
				}
			}
		
		});
		JRadioButton b4 = new JRadioButton();
		b4.setBounds(395, 20, 25, 50);
		b4.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b4) {
					person.setFantasy(4);
				}
			}
		
		});
		JRadioButton b5 = new JRadioButton();
		b5.setBounds(474, 20, 25, 50);
		b5.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b5) {
					person.setFantasy(5);
				}
			}
		
		});
		ButtonGroup group = new ButtonGroup();
		group.add(b0);
		group.add(b1);
		group.add(b2);
		group.add(b3);
		group.add(b4);
		group.add(b5);
		
		JPanel panel = new JPanel(null);
		panel.add(label, FlowLayout.LEFT);
		panel.add(b0);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.setBounds(10, 200, 600, 60);
		panel.setVisible(true);
		frame.add(panel);
		return frame;
	}
	public Component actionSect() {

		JLabel label = new JLabel();
		label.setText("Action:");
		label.setBounds(0,20,100,50);
		
		JRadioButton b0 = new JRadioButton();
		b0.setBounds(95,20,25,50);
		b0.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b0) {
					person.setAction(0);
				}
			}
		
		});
		
		JRadioButton b1 = new JRadioButton();
		b1.setBounds(170,20,25,50);
		b1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b1) {
					person.setAction(1);
				}
			}
		
		});
		JRadioButton b2 = new JRadioButton();
		b2.setBounds(245, 20, 25, 50);
		b2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b2) {
					person.setAction(2);
				}
			}
		
		});
		JRadioButton b3 = new JRadioButton();
		b3.setBounds(315, 20, 25, 50);
		b3.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b3) {
					person.setAction(3);
				}
			}
		
		});
		JRadioButton b4 = new JRadioButton();
		b4.setBounds(395, 20, 25, 50);
		b4.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b4) {
					person.setAction(4);
				}
			}
		
		});
		JRadioButton b5 = new JRadioButton();
		b5.setBounds(474, 20, 25, 50);
		b5.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b5) {
					person.setAction(5);
				}
			}
		
		});
		
		ButtonGroup group = new ButtonGroup();
		group.add(b0);
		group.add(b1);
		group.add(b2);
		group.add(b3);
		group.add(b4);
		group.add(b5);
		JPanel panel = new JPanel(null);
		panel.add(label, FlowLayout.LEFT);
		panel.add(b0);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.setBounds(10, 260, 600, 60);
		panel.setVisible(true);
		frame.add(panel);
		return frame;
	}
	public Component sciFiSect() {
		JLabel label = new JLabel();
		label.setText("Sci-Fi:");
		label.setBounds(0,20,100,50);

		JRadioButton b0 = new JRadioButton();
		b0.setBounds(95,20,25,50);
		b0.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b0) {
					person.setAction(0);
				}
			}
		
		});
		JRadioButton b1 = new JRadioButton();
		b1.setBounds(170,20,25,50);
		b1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b1) {
					person.setSciFi(1);
				}
			}
		
		});
		JRadioButton b2 = new JRadioButton();
		b2.setBounds(245, 20, 25, 50);
		b2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b2) {
					person.setSciFi(2);
				}
			}
		
		});
		JRadioButton b3 = new JRadioButton();
		b3.setBounds(315, 20, 25, 50);
		b3.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b3) {
					person.setSciFi(3);
				}
			}
		
		});
		JRadioButton b4 = new JRadioButton();
		b4.setBounds(395, 20, 25, 50);
		b4.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b4) {
					person.setSciFi(4);
				}
			}
		
		});
		JRadioButton b5 = new JRadioButton();
		b5.setBounds(474, 20, 25, 50);
		b5.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b5) {
					person.setSciFi(5);
				}
			}
		
		});
		ButtonGroup group = new ButtonGroup();
		group.add(b0);
		group.add(b1);
		group.add(b2);
		group.add(b3);
		group.add(b4);
		group.add(b5);
		
		JPanel panel = new JPanel(null);
		panel.add(label, FlowLayout.LEFT);
		panel.add(b0);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.setBounds(10, 320, 600, 60);
		panel.setVisible(true);
		frame.add(panel);
		return frame;
	}
	
	public Component submit() {
		JButton button = new JButton("Submit");
		button.setBounds(150, 450, 200, 50);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()== button) {
					new MovieListFrame(db.getMovie(person.getAction(), person.getComedy(), person.getHorror(), person.getFantasy(), person.getSciFi()));
				}
				
			}
			
		});
		frame.add(button);
		return frame;
	}
	public Component login() {
		JButton button = new JButton("Login");
		button.setBounds(450,20,100,25);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button) {
					IDandPasswords idandpasswords = new IDandPasswords();
					new LoginPage(idandpasswords.getLogininfo());
				}
			}
		});
		frame.add(button);
		return frame;
	}
}
