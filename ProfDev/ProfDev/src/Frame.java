
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
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
		
		TitleText();
		horrorSect();
		comedySect();
		fantasySect();
		actionSect();
		sciFiSect();
		login();
		submit();
		ratingPref();
		frame.setBounds(0,0,600,700);
		//original - frame.getContentPane().setBackground(new Color(251,95,106));
		//frame.getContentPane().setBackground(new Color(251,250,248));//off white greyish
		frame.getContentPane().setBackground(new Color(255,255,255));
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setResizable(false);
	}
	
	public Component TitleText() {
		JLabel label1 = new JLabel();
		label1.setText("What Should I Watch?");
		label1.setHorizontalTextPosition(JLabel.LEFT);
		label1.setBounds(100, 25, 300, 40);
		//label1.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(232,103,35)));//orange
		label1.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204,204,0)));
		label1.setFont(new Font("Courier", Font.BOLD,17));
		label1.setHorizontalAlignment(JLabel.CENTER);
		label1.setForeground(new Color(64,64,64));
		
		Image img = icon.getImage();
		Image imgS = img.getScaledInstance(60, 40, Image.SCALE_SMOOTH);
		ImageIcon scaledIcon = new ImageIcon(imgS);
		label1.setIcon(scaledIcon);
		label1.setIconTextGap(20);
		
		
		//label1.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		
		JLabel label2 = new JLabel();
		label2.setText("What is your preference for the following genres:");
		label2.setBounds(10, 65, 400, 55);
		label2.setFont(new Font(Font.SERIF, Font.BOLD, 16));
		label2.setForeground(new Color(64,64,64));
		
		JLabel label3 = new JLabel("Hate");
		label3.setBounds(100,110,75,50);
		label3.setForeground(new Color(64,64,64));
		label3.setFont(new Font(Font.SERIF,Font.BOLD, 15));
		
		JLabel label4 = new JLabel();
		label4.setText("Really Dislike");
		label4.setBounds(145,110,100,50);
		label4.setForeground(new Color(64,64,64));
		label4.setFont(new Font(Font.SERIF,Font.BOLD, 15));
		
		JLabel label5 = new JLabel();
		label5.setText("Disfavour");
		label5.setBounds(245,110,75,50);
		label5.setForeground(new Color(64,64,64));
		label5.setFont(new Font(Font.SERIF,Font.BOLD, 15));
		
		JLabel label6 = new JLabel();
		label6.setText("Decent");
		label6.setBounds(325,110,75,50);
		label6.setForeground(new Color(64,64,64));
		label6.setFont(new Font(Font.SERIF,Font.BOLD, 15));
		
		JLabel label7 = new JLabel();
		label7.setText("Like");
		label7.setBounds(405,110,75,50);
		label7.setForeground(new Color(64,64,64));
		label7.setFont(new Font(Font.SERIF,Font.BOLD, 15));
		
		JLabel label8 = new JLabel();
		label8.setText("Really like");
		label8.setBounds(470,110,75,50);
		label8.setForeground(new Color(64,64,64));
		label8.setFont(new Font(Font.SERIF,Font.BOLD, 15));
		
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
		label.setFont(new Font("Ink free", Font.BOLD,17));
		label.setForeground(new Color(64,64,64));
		label.setBackground(/*new Color(251,95,106)*/Color.white);
		label.setOpaque(true);
		label.setBounds(0,20,100,50);
		
		JRadioButton b0 = new JRadioButton();
		b0.setBounds(95,20,25,50);
		b0.setBackground(Color.white);
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
		b1.setBackground(Color.white);
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
		b2.setBackground(Color.white);
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
		b3.setBackground(Color.white);
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
		b4.setBackground(Color.white);
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
		b5.setBackground(Color.white);
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
		panel.setBounds(10, 130, 600, 60);
		panel.setBackground(Color.white);
		panel.setVisible(true);
		frame.add(panel);
		return frame;
	}
	public Component comedySect() {
		JLabel label = new JLabel("Comedy:");
		label.setForeground(new Color(64,64,64));
		label.setBounds(0,20,100,50);
		label.setFont(new Font("Footlight MT Light",Font.BOLD, 17));
		
		JRadioButton b0 = new JRadioButton();
		b0.setBounds(95,20,25,50);
		b0.setBackground(Color.white);
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
		b1.setBackground(Color.white);
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
		b2.setBackground(Color.white);
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
		b3.setBackground(Color.white);
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
		b4.setBackground(Color.white);
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
		b5.setBackground(Color.white);
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
		panel.setBounds(10, 180, 600, 60);
		panel.setBackground(Color.white);
		panel.setVisible(true);
		frame.add(panel);
		return frame;
	}
	public Component fantasySect() {
		JLabel label = new JLabel("Fantasy:");
		label.setBounds(0,20,100,50);
		label.setForeground(new Color(64,64,64));
		label.setFont(new Font("Book Antiqua", Font.BOLD, 17));
		
		JRadioButton b0 = new JRadioButton();
		b0.setBounds(95,20,25,50);
		b0.setBackground(Color.white);
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
		b1.setBackground(Color.white);
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
		b2.setBackground(Color.white);
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
		b3.setBackground(Color.white);
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
		b4.setBackground(Color.white);
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
		b5.setBackground(Color.white);
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
		panel.setBounds(10, 240, 600, 60);
		panel.setBackground(Color.white);
		panel.setVisible(true);
		frame.add(panel);
		return frame;
	}
	public Component actionSect() {

		JLabel label = new JLabel();
		label.setText("Action:");
		label.setBounds(0,20,100,50);
		label.setForeground(new Color(64,64,64));
		label.setFont(new Font("Courgette",Font.BOLD, 17));
		
		JRadioButton b0 = new JRadioButton();
		b0.setBounds(95,20,25,50);
		b0.setBackground(Color.white);
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
		b1.setBackground(Color.white);
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
		b2.setBackground(Color.white);
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
		b3.setBackground(Color.white);
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
		b4.setBackground(Color.white);
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
		b5.setBackground(Color.white);
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
		panel.setBounds(10, 300, 600, 60);
		panel.setBackground(Color.white);
		panel.setVisible(true);
		frame.add(panel);
		return frame;
	}
	public Component sciFiSect() {
		JLabel label = new JLabel();
		label.setText("Sci-Fi:");
		label.setBounds(0,20,100,50);
		label.setFont(new Font("Courier", Font.BOLD, 17));
		label.setForeground(new Color(64,64,64));

		JRadioButton b0 = new JRadioButton();
		b0.setBounds(95,20,25,50);
		b0.setBackground(Color.white);
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
		b1.setBackground(Color.white);
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
		b2.setBackground(Color.white);
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
		b3.setBackground(Color.white);
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
		b4.setBackground(Color.white);
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
		b5.setBackground(Color.white);
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
		panel.setBounds(10, 360, 600, 60);
		panel.setBackground(Color.white);
		panel.setVisible(true);
		frame.add(panel);
		return frame;
	}
	
	public Component ratingPref() {
		JLabel label = new JLabel("What the lowest rating of a movie that is acceptable to you? ");
		label.setBounds(10, 455, 600, 70);
		label.setFont(new Font(Font.SERIF, Font.BOLD,17));
		frame.add(label);
		
		Integer[] ratings = {0,1,2,3,4,5,6,7,8,9,10};
		JComboBox comboBox = new JComboBox(ratings);
		comboBox.setBounds(455, 482, 40, 20);
		comboBox.setBackground(Color.white);
		comboBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				person.setRatingPref(comboBox.getSelectedItem().toString());
			}
			
		});
		frame.add(comboBox);
		return frame;
	}
	
	public Component submit() {
		JButton button = new JButton("Submit");
		button.setBounds(150, 550, 200, 50);
		button.setBackground(Color.red);
		button.setForeground(Color.white);
		button.setFont(new Font("Courier",Font.BOLD, 17));
		button.setBorder(BorderFactory.createBevelBorder(1));
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()== button) {
					new MovieListFrame(db.getMovie(person));
				}
				
			}
			
		});
		frame.add(button);
		return frame;
	}
	public Component login() {
		JButton button = new JButton("Login");
		button.setBounds(450,30,100,25);
		//button.setBackground(new Color(255,77,87));
		
		button.setBackground(Color.red);
		button.setForeground(Color.white);
		button.setFont(new Font("Courier",Font.BOLD, 12));
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
