package project1;

import java.awt.event.*;
import java.util.LinkedList;

import javax.swing.*;

public class ListApp extends javax.swing.JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;





	/////////////////////////////////////////////Linked List  functions\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	 LinkedList<Item> name = new LinkedList<Item>();
	
	
	
	
	
	//ui elements
		JTextField itemName = new JTextField("Enter the item name: ", 20);
		JTextArea comments = new JTextArea("Notes",4, 15);
		
		JButton add = new JButton("Add");
		JButton remove = new JButton("Remove");
		
		JScrollPane scroll = new JScrollPane(comments, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		JLabel  itemLabel = new JLabel("Items");
		JLabel addLabel = new JLabel("Add");
		JLabel removeLabel = new JLabel("Remove");
		
	
	
	
	
	
	
	
	
	
	////ui constructor
	 public ListApp() {
			super("Grocery List");
			setSize(500, 900);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JPanel pane = new JPanel();
			
			
			comments.setLineWrap(true);
			comments.setWrapStyleWord(true);
			
		
			pane.add(add);
			add.requestFocus();
			pane.add(remove);
			pane.add(scroll);
			add(pane);
			setContentPane(pane);
			setVisible(true);
			
			
		}
	
	
	
	
	
	
	
	
	
	
	
	///connecting functions and ui elemets 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Object source = e.getSource();
			
			if(source == add) {
				JTextField addItem = new JTextField("Enter your item's name: ");
				JTextField addItemCost = new JTextField("Enter the cost of the item: ");
				String currentNum = addItemCost.getText();
				String currentText = addItem.getText();
				Item newItem = new Item(currentText, currentNum);
				name.add(newItem);
			}
			/*else if(source == remove) {
				JTextField removeItem = new JTextField("Enter your item's name: ");
				String itemRemove = removeItem.getText();
				if(Item.itemName == itemRemove) {}
					}
				*/
			repaint();
			}
			
		

	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ListApp li = new ListApp();
		///operation
	}




}
