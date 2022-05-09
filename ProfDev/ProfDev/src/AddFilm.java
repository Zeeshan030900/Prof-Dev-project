
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.Color;
import javax.swing.SwingConstants;

public class AddFilm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	DB db = new DB();
	ImageIcon icon = new ImageIcon("logo.png");

	/**
	 * Create the frame.
	 */

	public AddFilm() {
		Movie movie = new Movie("","","");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 900, 502);
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setBackground(Color.white);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Film Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setForeground(new Color(64,64,64));
		lblNewLabel.setBounds(10, 32, 147, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(159, 31, 211, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Film Rating /10:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(418, 32, 133, 17);
		lblNewLabel_1.setForeground(new Color(64,64,64));
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(542, 29, 96, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_0 = new JLabel("Film Release Year:");
		lblNewLabel_0.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_0.setBackground(new Color(240, 240, 240));
		lblNewLabel_0.setBounds(650, 32, 147, 14);
		lblNewLabel_0.setForeground(new Color(64,64,64));
		contentPane.add(lblNewLabel_0);
		
		textField_2 = new JTextField();
		textField_2.setBounds(795, 29, 85, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Horror Rating");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(301, 70, 133, 20);
		lblNewLabel_2.setForeground(new Color(64,64,64));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Sci-Fi Rating");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(301, 374, 133, 20);
		lblNewLabel_3.setForeground(new Color(64,64,64));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Comedy Rating");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(301, 138, 133, 25);
		lblNewLabel_4.setForeground(new Color(64,64,64));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Fantasy Rating");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(301, 227, 133, 20);
		lblNewLabel_5.setForeground(new Color(64,64,64));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Action Rating");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6.setBounds(301, 296, 133, 20);
		lblNewLabel_6.setForeground(new Color(64,64,64));
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(277, 431, 122, 23);
		btnNewButton.setBackground(Color.red);
		btnNewButton.setForeground(Color.white);
		
		
		contentPane.add(btnNewButton);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("1");
		rdbtnNewRadioButton.setVerticalTextPosition(SwingConstants.TOP);
	    rdbtnNewRadioButton.setHorizontalTextPosition(SwingConstants.CENTER);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton.setBounds(73, 95, 21, 36);
		rdbtnNewRadioButton.setBackground(Color.white);
		rdbtnNewRadioButton.setForeground(new Color(64,64,64));
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == rdbtnNewRadioButton) {
					movie.setHorror(1);
				}
				
			}
			
		});
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("");
		rdbtnNewRadioButton_1.setBounds(176, 108, 21, 23);
		rdbtnNewRadioButton_1.setBackground(Color.white);
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == rdbtnNewRadioButton_1) {
					movie.setHorror(2);
				}
				
			}
			
		});
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("");
		rdbtnNewRadioButton_2.setBounds(311, 108, 21, 23);
		rdbtnNewRadioButton_2.setBackground(Color.white);
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == rdbtnNewRadioButton_2) {
					movie.setHorror(3);
				}	
			}
		});
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("");
		rdbtnNewRadioButton_3.setBounds(460, 108, 21, 23);
		rdbtnNewRadioButton_3.setBackground(Color.white);
		rdbtnNewRadioButton_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == rdbtnNewRadioButton_3) {
					movie.setHorror(4);
				}	
			}
		});
		contentPane.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("5");
		rdbtnNewRadioButton_4.setVerticalTextPosition(SwingConstants.TOP);
	    rdbtnNewRadioButton_4.setHorizontalTextPosition(SwingConstants.CENTER);
		rdbtnNewRadioButton_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton_4.setBounds(599, 95, 21, 36);
		rdbtnNewRadioButton_4.setBackground(Color.white);
		rdbtnNewRadioButton_4.setForeground(new Color(64,64,64));
		rdbtnNewRadioButton_4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == rdbtnNewRadioButton_4) {
					movie.setHorror(5);
				}	
			}
		});
		contentPane.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("5");
		rdbtnNewRadioButton_5.setVerticalTextPosition(SwingConstants.TOP);
	    rdbtnNewRadioButton_5.setHorizontalTextPosition(SwingConstants.CENTER);
		rdbtnNewRadioButton_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton_5.setBackground(new Color(240, 240, 240));
		rdbtnNewRadioButton_5.setBounds(599, 165, 21, 36);
		rdbtnNewRadioButton_5.setBackground(Color.white);
		rdbtnNewRadioButton_5.setForeground(new Color(64,64,64));
		rdbtnNewRadioButton_5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == rdbtnNewRadioButton_5) {
					movie.setComedy(5);
				}	
			}
		});
		contentPane.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("5");
		rdbtnNewRadioButton_6.setVerticalTextPosition(SwingConstants.TOP);
	    rdbtnNewRadioButton_6.setHorizontalTextPosition(SwingConstants.CENTER);
		rdbtnNewRadioButton_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton_6.setBounds(599, 250, 21, 36);
		rdbtnNewRadioButton_6.setBackground(Color.white);
		rdbtnNewRadioButton_6.setForeground(new Color(64,64,64));
		rdbtnNewRadioButton_6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == rdbtnNewRadioButton_6) {
					movie.setFantasy(5);
				}	
			}
		});
		contentPane.add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("5");
		rdbtnNewRadioButton_7.setVerticalTextPosition(SwingConstants.TOP);
	    rdbtnNewRadioButton_7.setHorizontalTextPosition(SwingConstants.CENTER);
		rdbtnNewRadioButton_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton_7.setBounds(599, 326, 21, 36);
		rdbtnNewRadioButton_7.setBackground(Color.white);
		rdbtnNewRadioButton_7.setForeground(new Color(64,64,64));
		rdbtnNewRadioButton_7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == rdbtnNewRadioButton_7) {
					movie.setAction(5);
				}	
			}
		});
		contentPane.add(rdbtnNewRadioButton_7);
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("5");
		rdbtnNewRadioButton_8.setVerticalTextPosition(SwingConstants.TOP);
	    rdbtnNewRadioButton_8.setHorizontalTextPosition(SwingConstants.CENTER);
		rdbtnNewRadioButton_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton_8.setBounds(599, 390, 21, 36);
		rdbtnNewRadioButton_8.setBackground(Color.white);
		rdbtnNewRadioButton_8.setForeground(new Color(64,64,64));
		rdbtnNewRadioButton_8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == rdbtnNewRadioButton_8) {
					movie.setSciFi(5);
				}	
			}
		});
		contentPane.add(rdbtnNewRadioButton_8);
		
		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("");
		rdbtnNewRadioButton_9.setBounds(460, 176, 21, 23);
		rdbtnNewRadioButton_9.setBackground(Color.white);
		rdbtnNewRadioButton_9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == rdbtnNewRadioButton_9) {
					movie.setComedy(4);
				}	
			}
		});
		contentPane.add(rdbtnNewRadioButton_9);
		
		JRadioButton rdbtnNewRadioButton_10 = new JRadioButton("");
		rdbtnNewRadioButton_10.setBounds(460, 263, 21, 23);
		rdbtnNewRadioButton_10.setBackground(Color.white);
		rdbtnNewRadioButton_10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == rdbtnNewRadioButton_10) {
					movie.setFantasy(4);
				}	
			}
		});
		contentPane.add(rdbtnNewRadioButton_10);
		
		JRadioButton rdbtnNewRadioButton_11 = new JRadioButton("");
		rdbtnNewRadioButton_11.setBounds(460, 339, 21, 23);
		rdbtnNewRadioButton_11.setBackground(Color.white);
		rdbtnNewRadioButton_11.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == rdbtnNewRadioButton_11) {
					movie.setAction(4);
				}	
			}
		});
		contentPane.add(rdbtnNewRadioButton_11);
		
		JRadioButton rdbtnNewRadioButton_12 = new JRadioButton("");
		rdbtnNewRadioButton_12.setBounds(460, 403, 21, 23);
		rdbtnNewRadioButton_12.setBackground(Color.white);
		rdbtnNewRadioButton_12.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == rdbtnNewRadioButton_12) {
					movie.setFantasy(4);
				}	
			}
		});
		contentPane.add(rdbtnNewRadioButton_12);
		
		JRadioButton rdbtnNewRadioButton_13 = new JRadioButton("");
		rdbtnNewRadioButton_13.setBounds(176, 189, 21, 23);
		rdbtnNewRadioButton_13.setBackground(Color.white);
		rdbtnNewRadioButton_13.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == rdbtnNewRadioButton_13) {
					movie.setComedy(2);
				}	
			}
		});
		contentPane.add(rdbtnNewRadioButton_13);
		
		JRadioButton rdbtnNewRadioButton_14 = new JRadioButton("");
		rdbtnNewRadioButton_14.setBounds(311, 176, 21, 23);
		rdbtnNewRadioButton_14.setBackground(Color.white);
		rdbtnNewRadioButton_14.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == rdbtnNewRadioButton_14) {
					movie.setComedy(3);
				}	
			}
		});
		contentPane.add(rdbtnNewRadioButton_14);
		
		JRadioButton rdbtnNewRadioButton_15 = new JRadioButton("");
		rdbtnNewRadioButton_15.setBounds(312, 263, 21, 23);
		rdbtnNewRadioButton_15.setBackground(Color.white);
		rdbtnNewRadioButton_15.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == rdbtnNewRadioButton_15) {
					movie.setFantasy(3);
				}	
			}
		});
		contentPane.add(rdbtnNewRadioButton_15);
		
		JRadioButton rdbtnNewRadioButton_16 = new JRadioButton("");
		rdbtnNewRadioButton_16.setBounds(311, 339, 21, 23);
		rdbtnNewRadioButton_16.setBackground(Color.white);
		rdbtnNewRadioButton_16.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == rdbtnNewRadioButton_16) {
					movie.setAction(3);
				}	
			}
		});
		contentPane.add(rdbtnNewRadioButton_16);
		
		JRadioButton rdbtnNewRadioButton_17 = new JRadioButton("");
		rdbtnNewRadioButton_17.setBounds(316, 401, 21, 23);
		rdbtnNewRadioButton_17.setBackground(Color.white);
		rdbtnNewRadioButton_17.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == rdbtnNewRadioButton_17) {
					movie.setSciFi(3);;
				}	
			}
		});
		contentPane.add(rdbtnNewRadioButton_17);
		
		JRadioButton rdbtnNewRadioButton_18 = new JRadioButton("");
		rdbtnNewRadioButton_18.setBounds(176, 263, 21, 23);
		rdbtnNewRadioButton_18.setBackground(Color.white);
		rdbtnNewRadioButton_18.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == rdbtnNewRadioButton_18) {
					movie.setFantasy(2);
				}	
			}
		});
		contentPane.add(rdbtnNewRadioButton_18);
		
		JRadioButton rdbtnNewRadioButton_19 = new JRadioButton("");
		rdbtnNewRadioButton_19.setBounds(176, 339, 21, 23);
		rdbtnNewRadioButton_19.setBackground(Color.white);
		rdbtnNewRadioButton_19.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == rdbtnNewRadioButton_19) {
					movie.setAction(2);
				}	
			}
		});
		contentPane.add(rdbtnNewRadioButton_19);
		
		JRadioButton rdbtnNewRadioButton_20 = new JRadioButton("");
		rdbtnNewRadioButton_20.setBounds(176, 403, 21, 23);
		rdbtnNewRadioButton_20.setBackground(Color.white);
		rdbtnNewRadioButton_20.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == rdbtnNewRadioButton_20) {
					movie.setSciFi(2);
				}	
			}
		});
		contentPane.add(rdbtnNewRadioButton_20);
		
		JRadioButton rdbtnNewRadioButton_21 = new JRadioButton("1");
		rdbtnNewRadioButton_21.setVerticalTextPosition(SwingConstants.TOP);
	    rdbtnNewRadioButton_21.setHorizontalTextPosition(SwingConstants.CENTER);
		rdbtnNewRadioButton_21.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton_21.setBounds(73, 176, 21, 36);
		rdbtnNewRadioButton_21.setBackground(Color.white);
		rdbtnNewRadioButton_21.setForeground(new Color(64,64,64));
		rdbtnNewRadioButton_21.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == rdbtnNewRadioButton_21) {
					movie.setComedy(1);
				}	
			}
		});
		contentPane.add(rdbtnNewRadioButton_21);
		
		JRadioButton rdbtnNewRadioButton_22 = new JRadioButton("1");
		rdbtnNewRadioButton_22.setVerticalTextPosition(SwingConstants.TOP);
	    rdbtnNewRadioButton_22.setHorizontalTextPosition(SwingConstants.CENTER);
		rdbtnNewRadioButton_22.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton_22.setBounds(73, 250, 21, 36);
		rdbtnNewRadioButton_22.setBackground(Color.white);
		rdbtnNewRadioButton_22.setForeground(new Color(64,64,64));
		rdbtnNewRadioButton_22.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == rdbtnNewRadioButton_22) {
					movie.setFantasy(1);
				}	
			}
		});
		contentPane.add(rdbtnNewRadioButton_22);
		
		JRadioButton rdbtnNewRadioButton_23 = new JRadioButton("1");
		rdbtnNewRadioButton_23.setVerticalTextPosition(SwingConstants.TOP);
	    rdbtnNewRadioButton_23.setHorizontalTextPosition(SwingConstants.CENTER);
		rdbtnNewRadioButton_23.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton_23.setBounds(73, 326, 21, 36);
		rdbtnNewRadioButton_23.setBackground(Color.white);
		rdbtnNewRadioButton_23.setForeground(new Color(64,64,64));
		rdbtnNewRadioButton_23.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == rdbtnNewRadioButton_23) {
					movie.setAction(1);
				}	
			}
		});
		contentPane.add(rdbtnNewRadioButton_23);
		
		JRadioButton rdbtnNewRadioButton_24 = new JRadioButton("1");
		rdbtnNewRadioButton_24.setVerticalTextPosition(SwingConstants.TOP);
	    rdbtnNewRadioButton_24.setHorizontalTextPosition(SwingConstants.CENTER);
		rdbtnNewRadioButton_24.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton_24.setBounds(73, 390, 21, 36);
		rdbtnNewRadioButton_24.setBackground(Color.white);
		rdbtnNewRadioButton_24.setForeground(new Color(64,64,64));
		rdbtnNewRadioButton_24.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == rdbtnNewRadioButton_24) {
					movie.setSciFi(1);
				}	
			}
		});
		contentPane.add(rdbtnNewRadioButton_24);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButton); 
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_2);
		group.add(rdbtnNewRadioButton_3);
		group.add(rdbtnNewRadioButton_4);
		
		ButtonGroup group2 = new ButtonGroup();
		group2.add(rdbtnNewRadioButton_5);
		group2.add(rdbtnNewRadioButton_21);
		group2.add(rdbtnNewRadioButton_13);
		group2.add(rdbtnNewRadioButton_9);
		group2.add(rdbtnNewRadioButton_14);
		
		
		ButtonGroup group3 = new ButtonGroup();
		group3.add(rdbtnNewRadioButton_6);
		group3.add(rdbtnNewRadioButton_22);
		group3.add(rdbtnNewRadioButton_10);
		group3.add(rdbtnNewRadioButton_15);
		group3.add(rdbtnNewRadioButton_18);
		
		ButtonGroup group4 = new ButtonGroup();
		group4.add(rdbtnNewRadioButton_7);
		group4.add(rdbtnNewRadioButton_23);
		group4.add(rdbtnNewRadioButton_11);
		group4.add(rdbtnNewRadioButton_12);
		group4.add(rdbtnNewRadioButton_16);
		group4.add(rdbtnNewRadioButton_19);
		
		ButtonGroup group5 = new ButtonGroup();
		group5.add(rdbtnNewRadioButton_8);
		group5.add(rdbtnNewRadioButton_24);
		group5.add(rdbtnNewRadioButton_12);
		group5.add(rdbtnNewRadioButton_17);
		group5.add(rdbtnNewRadioButton_20);
		
		btnNewButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNewButton) {
					
					if(textField.getText().isEmpty() || textField_1.getText().isEmpty() ||textField_2.getText().isEmpty()) 
					{
						JOptionPane.showMessageDialog(null, "Please fill out all the textboxes", "Criteria not met", JOptionPane.INFORMATION_MESSAGE);
					}
					else 
					{
						 movie.setTitle(textField.getText());;
						 movie.setRating(textField_1.getText());
						 movie.setReleaseDate(textField_2.getText());
						 if(db.addData(movie.getTitle(), movie.getReleaseDate(), movie.getRating(), movie.getHorror(), movie.getAction(), movie.getComedy(), movie.getSciFi(), movie.getFantasy())) {
							 JOptionPane.showMessageDialog(null, "The movie has been placed into the DataBase", "Success",JOptionPane.OK_CANCEL_OPTION);
						 }
						 else {
							 JOptionPane.showMessageDialog(null, "There was a problem with the data that was entered", "Error", JOptionPane.ERROR_MESSAGE);
						 }
						
						
					}
				}
				
			}
		
		});
		setLocationRelativeTo(null);
		setIconImage(icon.getImage());
		setTitle("What Should I Watch");
		setResizable(false);
		setVisible(true);
	}
}
