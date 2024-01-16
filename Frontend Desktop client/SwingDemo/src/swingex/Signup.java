package swingex;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.security.PublicKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Signup extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFielduser;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	public Signup() {
		setFont(new Font("Tahoma", Font.BOLD, 16));
		setTitle("Signup");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 582);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(58, 64, 381, 408);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Enter user Name :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(34, 52, 131, 24);
		panel.add(lblNewLabel_1);
		
		textFielduser = new JTextField();
		textFielduser.setBounds(34, 86, 283, 24);
		panel.add(textFielduser);
		textFielduser.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Enter password :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(34, 134, 150, 24);
		panel.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(34, 168, 283, 24);
		panel.add(passwordField);
		
		JLabel lblNewLabel_3 = new JLabel("confirm password :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(34, 217, 149, 24);
		panel.add(lblNewLabel_3);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(34, 252, 283, 24);
		panel.add(passwordField_1);
		
		JButton btnNewButton = new JButton("Create");
		btnNewButton.setBackground(new Color(0, 255, 128));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String driver = "com.mysql.jdbc.Driver";
				String url = "jdbc:mysql://localhost:3306/chatapp";
				String user = "root";
				String pass = "396588";
				
				try {
					Class.forName(driver);
					Connection connection = DriverManager.getConnection(url,user,pass);
					String queryString ="insert into registration values (?,?)";
					PreparedStatement pStatement =connection.prepareStatement(queryString);
					pStatement.setNString(1, textFielduser.getText());
					pStatement.setNString(2, passwordField.getText());
					pStatement.executeUpdate();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(213, 304, 104, 35);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goBackToLoginPage();
			}
		});
	
		
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(37, 304, 85, 35);
		panel.add(btnNewButton_1);
		
		
		
		
		JLabel lblNewLabel = new JLabel("Signup");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(202, 10, 154, 28);
		contentPane.add(lblNewLabel);
	}
	
	
	private void goBackToLoginPage() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    // Create an instance of Frame22 (login page) and make it visible
                    Frame22 frame = new Frame22();
                    frame.setVisible(true);

                    // Close the current Signup frame
                    Signup.this.dispose();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
