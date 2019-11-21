import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MainMenuAdmin extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField itemNameRemove;
	private JTextField amountRemoveItem;
	private JTextField itemNameAdd;
	private JTextField amountAddItem;
	private JTextField itemNameAddInv;
	private JTextField amountAddInv;
	private JTextField itemNameRemoveInv;
	private JTextField amountRemoveInv;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenuAdmin frame = new MainMenuAdmin();
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
	public MainMenuAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 779, 784);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeUser = new JLabel("Welcome Admin");					//TODO: Change this to a dynamic variable based on the username used to login in TestGui
		lblWelcomeUser.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblWelcomeUser.setBounds(20, 0, 306, 65);
		contentPane.add(lblWelcomeUser);
		
		table = new JTable();
		table.setBounds(20, 110, 733, 359);
		contentPane.add(table);
		
		JButton btnLoadItems = new JButton("Load Items ");
		btnLoadItems.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			//TODO: Assign a function once Database is set up
				
				
			}
		});
		btnLoadItems.setBounds(20, 66, 177, 30);
		contentPane.add(btnLoadItems);
		
		JButton btnRemoveItem = new JButton("Remove Item From Stock");
		btnRemoveItem.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnRemoveItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			//TODO: Assign a function 
				
				
			}
		});
		btnRemoveItem.setBounds(519, 480, 234, 41);
		contentPane.add(btnRemoveItem);
		
		JLabel lblItemName = new JLabel("Item Name:");
		lblItemName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblItemName.setBounds(20, 480, 137, 41);
		contentPane.add(lblItemName);
		
		itemNameRemove = new JTextField();
		itemNameRemove.setBounds(101, 480, 177, 41);
		contentPane.add(itemNameRemove);
		itemNameRemove.setColumns(10);
		
		JLabel itemLabelRemove = new JLabel("Amount:");
		itemLabelRemove.setFont(new Font("Tahoma", Font.PLAIN, 14));
		itemLabelRemove.setBounds(297, 480, 119, 41);
		contentPane.add(itemLabelRemove);
		
		amountRemoveItem = new JTextField();
		amountRemoveItem.setBounds(359, 480, 112, 41);
		contentPane.add(amountRemoveItem);
		amountRemoveItem.setColumns(10);
		
		JLabel label = new JLabel("Item Name:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(20, 532, 137, 41);
		contentPane.add(label);
		
		itemNameAdd = new JTextField();
		itemNameAdd.setColumns(10);
		itemNameAdd.setBounds(101, 532, 177, 41);
		contentPane.add(itemNameAdd);
		
		JLabel ItemLabelAdd = new JLabel("Amount:");
		ItemLabelAdd.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ItemLabelAdd.setBounds(297, 532, 119, 41);
		contentPane.add(ItemLabelAdd);
		
		amountAddItem = new JTextField();
		amountAddItem.setColumns(10);
		amountAddItem.setBounds(359, 532, 112, 41);
		contentPane.add(amountAddItem);
		
		JButton btnAddItem = new JButton("Add Item To Stock");
		btnAddItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			//TODO: Assign a function
				
			}
		});
		btnAddItem.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAddItem.setBounds(519, 532, 234, 41);
		contentPane.add(btnAddItem);
		
		JLabel label_2 = new JLabel("Item Name:");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(20, 584, 137, 41);
		contentPane.add(label_2);
		
		itemNameAddInv = new JTextField();
		itemNameAddInv.setColumns(10);
		itemNameAddInv.setBounds(101, 584, 177, 41);
		contentPane.add(itemNameAddInv);
		
		JLabel InvLabelAdd = new JLabel("Amount:");
		InvLabelAdd.setFont(new Font("Tahoma", Font.PLAIN, 14));
		InvLabelAdd.setBounds(297, 584, 119, 41);
		contentPane.add(InvLabelAdd);
		
		amountAddInv = new JTextField();
		amountAddInv.setColumns(10);
		amountAddInv.setBounds(359, 584, 112, 41);
		contentPane.add(amountAddInv);
		
		JButton btnAddItemTo = new JButton("Add Item To Inventory");
		btnAddItemTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				//TODO: Assign a function
				
				
			}
		});
		btnAddItemTo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAddItemTo.setBounds(519, 584, 234, 41);
		contentPane.add(btnAddItemTo);
		
		JLabel label_4 = new JLabel("Item Name:");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_4.setBounds(20, 636, 137, 41);
		contentPane.add(label_4);
		
		itemNameRemoveInv = new JTextField();
		itemNameRemoveInv.setColumns(10);
		itemNameRemoveInv.setBounds(101, 636, 177, 41);
		contentPane.add(itemNameRemoveInv);
		
		JLabel InvLabelRemove = new JLabel("Amount:");
		InvLabelRemove.setFont(new Font("Tahoma", Font.PLAIN, 14));
		InvLabelRemove.setBounds(297, 636, 119, 41);
		contentPane.add(InvLabelRemove);
		
		amountRemoveInv = new JTextField();
		amountRemoveInv.setColumns(10);
		amountRemoveInv.setBounds(359, 636, 112, 41);
		contentPane.add(amountRemoveInv);
		
		JButton btnRemoveItemFrom = new JButton("Remove Item From Inventory");
		btnRemoveItemFrom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			//TODO: Assign a function 
				
				
			}
		});
		btnRemoveItemFrom.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnRemoveItemFrom.setBounds(519, 636, 234, 41);
		contentPane.add(btnRemoveItemFrom);
		
		JButton btnAddNewUser = new JButton("Add New User Account");
		btnAddNewUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {					//TODO: Add function to open new JFrame to add user into database
				
				
			}
		});
		btnAddNewUser.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAddNewUser.setBounds(491, 11, 262, 75);
		contentPane.add(btnAddNewUser);
	}
}
