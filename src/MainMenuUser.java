import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;


public class MainMenuUser extends TestGui {

	private JPanel contentPane;
	private JTable table;
	private JTextField itemNameREmove;
	private JTextField itemAmountRemove;
	private JTextField itemNameAdd;
	private JTextField itemAmountAdd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenuUser frame = new MainMenuUser();
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
	public MainMenuUser() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 779, 784);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeUser = new JLabel("Welcome User");					//TODO: Change this to a dynamic variable based on the username used to login in TestGui
		lblWelcomeUser.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblWelcomeUser.setBounds(20, 0, 306, 65);
		contentPane.add(lblWelcomeUser);
		
		table = new JTable();
		table.setBounds(20, 110, 733, 359);
		contentPane.add(table);
		
		JButton btnLoadItems = new JButton("Load Items ");
		btnLoadItems.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {					//TODO: Add function to load current items from database
				
				
			}
		});
		btnLoadItems.setBounds(20, 66, 177, 30);
		contentPane.add(btnLoadItems);
		
		JButton btnRemoveItem = new JButton("Remove Item From Stock");
		btnRemoveItem.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnRemoveItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {					//TODO: Add function to remove item from stock 
				
				
			}
		});
		btnRemoveItem.setBounds(519, 480, 234, 41);
		contentPane.add(btnRemoveItem);
		
		JLabel lblItemName = new JLabel("Item Name:");
		lblItemName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblItemName.setBounds(20, 480, 137, 41);
		contentPane.add(lblItemName);
		
		itemNameREmove = new JTextField();
		itemNameREmove.setBounds(101, 480, 177, 41);
		contentPane.add(itemNameREmove);
		itemNameREmove.setColumns(10);
		
		JLabel lblAmount = new JLabel("Amount:");
		lblAmount.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAmount.setBounds(297, 480, 119, 41);
		contentPane.add(lblAmount);
		
		itemAmountRemove = new JTextField();
		itemAmountRemove.setBounds(359, 480, 112, 41);
		contentPane.add(itemAmountRemove);
		itemAmountRemove.setColumns(10);
		
		JLabel label = new JLabel("Item Name:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(20, 532, 137, 41);
		contentPane.add(label);
		
		itemNameAdd = new JTextField();
		itemNameAdd.setColumns(10);
		itemNameAdd.setBounds(101, 532, 177, 41);
		contentPane.add(itemNameAdd);
		
		JLabel label_1 = new JLabel("Amount:");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(297, 532, 119, 41);
		contentPane.add(label_1);
		
		itemAmountAdd = new JTextField();
		itemAmountAdd.setColumns(10);
		itemAmountAdd.setBounds(359, 532, 112, 41);
		contentPane.add(itemAmountAdd);
		
		JButton btnAddItem = new JButton("Add Item To Stock");
		btnAddItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {					//TODO: Add function to add item to stock
				
				
			}
		});
		btnAddItem.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAddItem.setBounds(519, 532, 234, 41);
		contentPane.add(btnAddItem);
	}
}
