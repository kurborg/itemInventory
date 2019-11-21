import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

public class TestGui extends JFrame{

	private JFrame Login_Screen;
	private JTextField UserName;
	private JPasswordField passwordField;
	private JLabel lblInventoryTrackingSystem;
	String username;
	String password;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestGui window = new TestGui();
					window.Login_Screen.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TestGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Login_Screen = new JFrame();
		Login_Screen.setBounds(100, 100, 660, 509);
		Login_Screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Login_Screen.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsername.setBounds(157, 103, 107, 39);
		Login_Screen.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(157, 172, 107, 39);
		Login_Screen.getContentPane().add(lblPassword);
		
		UserName = new JTextField();
		UserName.setBounds(292, 105, 245, 39);
		Login_Screen.getContentPane().add(UserName);
		UserName.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(292, 172, 245, 39);
		Login_Screen.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 username = UserName.getText();
				 password = passwordField.getText();
				
				if(username.equals("User") && password.equals("password"))
					{
						JOptionPane.showMessageDialog(Login_Screen, "Succesfully logged in as User.");
						Login_Screen.dispose();
						MainMenuUser userMenu = new MainMenuUser();
						userMenu.setVisible(true);
					}
				else if( username.equals("Admin") && password.equals("password"))
					{
						JOptionPane.showMessageDialog(Login_Screen, "Succesfully logged in as Admin.");
						Login_Screen.dispose();
						MainMenuAdmin adminMenu = new MainMenuAdmin();
						adminMenu.setVisible(true);
					}
				else
					{
						JOptionPane.showMessageDialog(Login_Screen, "Incorrect login information.");
					}
			}
		
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnLogin.setBounds(237, 307, 178, 39);
		Login_Screen.getContentPane().add(btnLogin);
		
		lblInventoryTrackingSystem = new JLabel("Inventory Tracking System ");
		lblInventoryTrackingSystem.setForeground(new Color(0, 0, 0));
		lblInventoryTrackingSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblInventoryTrackingSystem.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblInventoryTrackingSystem.setBounds(144, 11, 373, 66);
		Login_Screen.getContentPane().add(lblInventoryTrackingSystem);
	}
}
