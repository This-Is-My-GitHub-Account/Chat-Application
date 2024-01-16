package swingex;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JToolBar;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Window;

import javax.swing.JToggleButton;
import javax.swing.UIManager;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class Frame22 extends JFrame  {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private final Action action = new SwingAction();
	private JPasswordField passwordField_1;


	public static void main(String[] args) {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame22 frame = new Frame22();
					frame.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Frame22() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 528, 583);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setForeground(new Color(255, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(242, 15, 2, 2);
		contentPane.add(scrollPane);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setBounds(204, 27, 113, 44);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 27));
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(67, 99, 376, 414);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Signup");
		btnNewButton_1.setBounds(242, 304, 85, 31);
		panel.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(40, 89, 287, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("login");
		btnNewButton.setBackground(new Color(128, 255, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(40, 231, 287, 38);
		panel.add(btnNewButton);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(40, 178, 287, 26);
		panel.add(passwordField_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter your password :");
		lblNewLabel_1_1.setBounds(40, 137, 197, 31);
		panel.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBackground(UIManager.getColor("Button.background"));
		
		JLabel lblNewLabel_1 = new JLabel("Enter your user name :");
		lblNewLabel_1.setBounds(40, 48, 197, 31);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		
		JLabel lblNewLabel_2 = new JLabel("Don`t have an account ?");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(95, 307, 152, 22);
		panel.add(lblNewLabel_2);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String driver = "com.mysql.jdbc.Driver";
				String url = "jdbc:mysql://localhost:3306/chatapp";
				String user = "root";
				String pass = "396588";
				try {
					Class.forName(driver);
					Connection connection = DriverManager.getConnection(url,user,pass);
					
					String usernameString =textField.getText();
					String passString =passwordField_1.getText();
					
					Statement statement=connection.createStatement();
					String queryString ="select username ,password from registration where username='"+textField+"' and password='"+passwordField_1+"'";
					
					ResultSet rSet = statement.executeQuery(queryString);
					
					if(rSet.next()) {
						System.out.println("welcome");
						dispose();
					}
					else {
						JOptionPane.showMessageDialog(contentPane, this,"username or password wrong", DISPOSE_ON_CLOSE);
					}
					
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Signup frame1 = new Signup();
							frame1.setVisible(true);
							
							Frame22.this.dispose();
							
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
