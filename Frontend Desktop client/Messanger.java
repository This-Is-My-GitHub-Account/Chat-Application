package com.swing.test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class Messanger extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSearch;
	private JTextField txtTypeYourMessage;
	static Box vertical = Box.createVerticalBox();

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Messanger frame = new Messanger();
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
	public Messanger() {
		
	

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 855, 562);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 839, 525);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 128, 255));
		panel_1.setBounds(0, 0, 248, 525);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(102, 204, 255));
		panel_4.setBounds(10, 10, 228, 40);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		ImageIcon searchIcon = new ImageIcon("assets/search1.png");
        Image searchImage = searchIcon.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon searchIconScaled = new ImageIcon(searchImage);
		JLabel lblNewLabel = new JLabel(searchIconScaled);
		lblNewLabel.setBounds(173, 0, 45, 40);
		panel_4.add(lblNewLabel);
		
		txtSearch = new JTextField();
		txtSearch.setBorder(null);
		txtSearch.setForeground(Color.WHITE);
		txtSearch.setFont(new Font("Arial", Font.PLAIN, 18));
		txtSearch.setBackground(new Color(102, 204, 255));
		txtSearch.setText("Search");
		txtSearch.setBounds(10, 0, 159, 46);
		panel_4.add(txtSearch);
		txtSearch.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(128, 128, 255));
		panel_5.setBounds(10, 76, 228, 63);
		panel_1.add(panel_5);
		panel_5.setLayout(null);
		
		ImageIcon i4 = new ImageIcon("assets/profile1.png");
        Image i5 = i4.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
		JLabel lblNewLabel_1 = new JLabel(i6);
		lblNewLabel_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(102, 204, 255)));
		lblNewLabel_1.setBounds(26, 0, 51, 63);
		panel_5.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Aditya");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_2.setBounds(115, 23, 103, 30);
		panel_5.add(lblNewLabel_2);
		
		JPanel panel_5_1 = new JPanel();
		panel_5_1.setLayout(null);
		panel_5_1.setBackground(new Color(128, 128, 255));
		panel_5_1.setBounds(10, 168, 228, 63);
		panel_1.add(panel_5_1);
		
		ImageIcon i7 = new ImageIcon("assets/profile1.png");
        Image i8 = i7.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
		JLabel lblNewLabel_1_1 = new JLabel(i9);
		lblNewLabel_1_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(102, 204, 255)));
		lblNewLabel_1_1.setBounds(26, 0, 51, 63);
		panel_5_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Ashutosh");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(115, 23, 103, 30);
		panel_5_1.add(lblNewLabel_2_1);
		
		JPanel panel_5_2 = new JPanel();
		panel_5_2.setLayout(null);
		panel_5_2.setBackground(new Color(128, 128, 255));
		panel_5_2.setBounds(10, 260, 228, 63);
		panel_1.add(panel_5_2);
		
		ImageIcon i10 = new ImageIcon("assets/profile1.png");
        Image i11 = i10.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
		JLabel lblNewLabel_1_2 = new JLabel(i12);
		lblNewLabel_1_2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(102, 204, 255)));
		lblNewLabel_1_2.setBounds(26, 0, 51, 63);
		panel_5_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Ayush");
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_2_2.setBounds(115, 23, 103, 30);
		panel_5_2.add(lblNewLabel_2_2);
		
		JPanel panel_5_2_1 = new JPanel();
		panel_5_2_1.setLayout(null);
		panel_5_2_1.setBackground(new Color(128, 128, 255));
		panel_5_2_1.setBounds(10, 352, 228, 63);
		panel_1.add(panel_5_2_1);
		
		ImageIcon i13 = new ImageIcon("assets/profile1.png");
        Image i14 = i13.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
		JLabel lblNewLabel_1_2_1 = new JLabel(i15);
		lblNewLabel_1_2_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(102, 204, 255)));
		lblNewLabel_1_2_1.setBounds(26, 0, 51, 63);
		panel_5_2_1.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Swaraj");
		lblNewLabel_2_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_2_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_2_2_1.setBounds(115, 23, 103, 30);
		panel_5_2_1.add(lblNewLabel_2_2_1);
		
		JPanel panel_5_2_2 = new JPanel();
		panel_5_2_2.setLayout(null);
		panel_5_2_2.setBackground(new Color(128, 128, 255));
		panel_5_2_2.setBounds(10, 441, 228, 63);
		panel_1.add(panel_5_2_2);
		
		ImageIcon i16 = new ImageIcon("assets/profile1.png");
        Image i17 = i16.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon i18 = new ImageIcon(i17);
		JLabel lblNewLabel_1_2_2 = new JLabel(i18);
		lblNewLabel_1_2_2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(102, 204, 255)));
		lblNewLabel_1_2_2.setBounds(26, 0, 51, 63);
		panel_5_2_2.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Shreyash");
		lblNewLabel_2_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_2_2_2.setBounds(115, 23, 103, 30);
		panel_5_2_2.add(lblNewLabel_2_2_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(247, 0, 592, 525);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(102, 204, 255));
		panel_6.setBounds(0, 0, 592, 68);
		panel_2.add(panel_6);
		panel_6.setLayout(null);
		
		ImageIcon i1 = new ImageIcon("assets/profile1.png");
		Image i2 = i1.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
		JLabel lblNewLabel_1_3 = new JLabel(i3);
		lblNewLabel_1_3.setBounds(10, 15, 51, 43);
		panel_6.add(lblNewLabel_1_3);
		
		
		JLabel lblNewLabel_2_3 = new JLabel("Sarvesh");
		lblNewLabel_2_3.setForeground(Color.WHITE);
		lblNewLabel_2_3.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_2_3.setBounds(71, 15, 104, 13);
		panel_6.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_4 = new JLabel("Active now");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(71, 45, 84, 13);
		panel_6.add(lblNewLabel_4);
		
		ImageIcon morevertIcon = new ImageIcon("assets/3icon.png");
        Image morevertImage = morevertIcon.getImage().getScaledInstance(10, 25, Image.SCALE_DEFAULT);
        ImageIcon morevertIconScaled = new ImageIcon(morevertImage);
		JLabel lblNewLabel_3_3 = new JLabel(morevertIconScaled);
		lblNewLabel_3_3.setBounds(562, 0, 30, 68);
		panel_6.add(lblNewLabel_3_3);
		
		ImageIcon videoIcon = new ImageIcon("assets/video.png");
        Image videoImage = videoIcon.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon videoIconScaled = new ImageIcon(videoImage);
		JLabel lblNewLabel_3_3_1 = new JLabel(videoIconScaled);
		lblNewLabel_3_3_1.setBounds(507, 0, 45, 68);
		panel_6.add(lblNewLabel_3_3_1);
		
		ImageIcon phoneIcon = new ImageIcon("assets/phone.png");
        Image phoneImage = phoneIcon.getImage().getScaledInstance(35, 30, Image.SCALE_DEFAULT);
        ImageIcon phoneIconScaled = new ImageIcon(phoneImage);
		JLabel lblNewLabel_3_3_1_1 = new JLabel(phoneIconScaled);
		lblNewLabel_3_3_1_1.setBounds(452, 0, 45, 68);
		panel_6.add(lblNewLabel_3_3_1_1);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(0, 471, 592, 54);
		panel_2.add(panel_7);
		panel_7.setLayout(null);
				
		ImageIcon emojiIcon = new ImageIcon("assets/emoji1.png");
        Image emojiImage = emojiIcon.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon emojiIconScaled = new ImageIcon(emojiImage);
		JLabel lblNewLabel_3_1 = new JLabel(emojiIconScaled);
		lblNewLabel_3_1.setBounds(0, 0, 45, 54);
		panel_7.add(lblNewLabel_3_1);
		
		ImageIcon voiceIcon = new ImageIcon("assets/voice1.png");
        Image voiceImage = voiceIcon.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon voiceIconScaled = new ImageIcon(voiceImage);
		JLabel lblNewLabel_3_2 = new JLabel(voiceIconScaled);
		lblNewLabel_3_2.setBounds(44, 0, 45, 54);
		panel_7.add(lblNewLabel_3_2);
		
		txtTypeYourMessage = new JTextField();
		txtTypeYourMessage.setBorder(null);
		txtTypeYourMessage.setFont(new Font("Arial", Font.PLAIN, 18));
		txtTypeYourMessage.setForeground(Color.GRAY);
		txtTypeYourMessage.setText("Type your message here");
		txtTypeYourMessage.setBounds(109, 10, 410, 34);
		panel_7.add(txtTypeYourMessage);
		txtTypeYourMessage.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 71, 592, 401);
		panel_3.setLayout(null);
		
	  		
		ImageIcon sendIcon = new ImageIcon("assets/send1.png");
        Image sendImage = sendIcon.getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT);
        ImageIcon sendIconScaled = new ImageIcon(sendImage);
		JButton btnNewButton = new JButton(sendIconScaled);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
		            String out = txtTypeYourMessage.getText();

		            JPanel p2 = formatLabel(out);

		            panel_3.setLayout(new BorderLayout());

		            JPanel right = new JPanel(new BorderLayout());
		            right.add(p2, BorderLayout.LINE_END);
		            vertical.add(right);
		            vertical.add(Box.createVerticalStrut(15));

		            panel_3.add(vertical, BorderLayout.PAGE_START);

		            txtTypeYourMessage.setText("");

		            contentPane.repaint();
		            contentPane.invalidate();
		            contentPane.validate();
		        } catch (Exception e1) {
		            e1.printStackTrace();
		        }
			}
		});
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(529, 0, 63, 54);
		panel_7.add(btnNewButton);
		
		
	}
	
	public static JPanel formatLabel(String out) {
	    JPanel panel1 = new JPanel();
	    panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));

	    JLabel output = new JLabel("<html><p style=\"width: 150px; color: #FFFFFF\">" + out + "</p></html>");
	    output.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    output.setBackground(new Color(102, 204, 255));
	    output.setForeground(Color.BLACK); // Set a darker color for better visibility
	    output.setOpaque(true);
	    output.setBorder(new EmptyBorder(15, 15, 15, 50));

	    panel1.add(output);

	    Calendar cal = Calendar.getInstance();
	    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

	    JLabel time = new JLabel();
	    time.setText(sdf.format(cal.getTime()));
	    time.setForeground(Color.BLACK); // Set a darker color for better visibility
	    panel1.add(time);

	    return panel1;
	}

}
